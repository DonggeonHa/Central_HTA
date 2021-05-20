package com.sample.hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.hr.vo.Department;
import com.sample.utils.ConnectionUtil;

/**
 * DEPARTMENTS ���̺� ���� CRUD ����� �����ϴ� Ŭ������.
 * @author Dylan
 *
 */
public class DepartmentDao {

	/**
	 * ��� �μ������� ��ȯ�Ѵ�
	 * @return �μ����� ���
	 * @throws SQLException
	 */
	public List<Department> getAlldepartments() throws SQLException {
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
}
