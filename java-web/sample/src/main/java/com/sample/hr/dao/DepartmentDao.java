package com.sample.hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.hr.dto.DepartmentDto;
import com.sample.hr.vo.Department;
import com.sample.utils.ConnectionUtil;

/**
 * DEPARTMENTS ���̺� ���� CRUD ����� �����ϴ� Ŭ������.
 * @author Dylan
 *
 */
public class DepartmentDao {

	public void insertDepartment(Department department) throws SQLException {
		
		String sql = "INSERT INTO departments "
				   + "(department_id, department_name, location_id) "
				   + "VALUES(departments_seq.nextval, ?, ?) ";
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, department.getName());
		pstmt.setInt(2, department.getLocationId());
		pstmt.executeUpdate(); // INSERT, UPDATE, DELETE ������ �����Ѵ�.
		
		pstmt.close();
		conn.close();
				
	}
	
	
	/**
	 * ��� �μ������� ��ȯ�Ѵ�
	 * @return �μ����� ���
	 * @throws SQLException
	 */
	public List<Department> getAllDepartments() throws SQLException {
		List<Department> departments = new ArrayList<Department>();
		String sql = "SELECT department_id, department_name, manager_id, location_id "
				   + "FROM departments "
				   + "ORDER BY department_id ASC ";
		
		Connection con = ConnectionUtil.getConnection(); 		// DBMS�� ������ ����ϴ� Connection ��ü ȹ��
		PreparedStatement pstmt = con.prepareStatement(sql);	// ������ SQL�� DBMS�� �����ϴ� PreparedStatement  ��ü ȹ��
		ResultSet rs = pstmt.executeQuery();					// SQL�� DBMS�� �����ϰ� �������� ���Ե� ResultSet ��ü ȹ��
		
		while (rs.next()) {
			Department department = new Department();
			department.setId(rs.getInt("department_id"));
			department.setName(rs.getString("department_name"));
			department.setManagerId(rs.getInt("manager_id"));
			department.setLocationId(rs.getInt("location_id"));
			
			departments.add(department);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return departments;
	}
	
	/**
	 * �μ����̵� ���޹޾Ƽ� �μ��⺻ ������ ��ȯ�Ѵ�.
	 * @param deptId ��ȸ�� �μ����̵�
	 * @return �μ������� ���Ե� DepartmentDto
	 * @throws SQLException
	 */
	public DepartmentDto getDepartmentDto(int deptId) throws SQLException {
		String sql = "SELECT d.department_id, d.department_name, d.manager_id, m.first_name manager_name, l.location_id, l.city, "
		           + "		 (SELECT COUNT(*) FROM employees E WHERE e.department_id = ?) emp_count "
		           + "FROM departments d, locations l, employees m "
		           + "WHERE d.department_id = ? "
		           + "AND d.manager_id = m.employee_id(+) "
		           + "AND d.location_id = l.location_id ";
		
		DepartmentDto dto = null;
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, deptId);
		pstmt.setInt(2, deptId);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			dto = new DepartmentDto();
			dto.setId(rs.getInt("department_id"));
			dto.setName(rs.getString("department_name"));
			dto.setManagerId(rs.getInt("manager_id"));
			dto.setManagerName(rs.getString("manager_name"));
			dto.setLocationId(rs.getInt("location_id"));
			dto.setCity(rs.getString("city"));
			dto.setEmpCount(rs.getInt("emp_count"));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		
		return dto;
		
		
	}
	
	
}
