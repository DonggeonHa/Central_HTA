package com.sample.hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.hr.dto.EmployeeDto;
import com.sample.hr.vo.Employee;
import com.sample.utils.ConnectionUtil;

/**
 * EMPLOYEES 테이블에 대한 CRUD를 제공하는 클래스다
 * @author Dylan
 *
 */
public class EmployeeDao {

	public void insertEmployee(Employee employee) throws SQLException {
		String sql = "INSERT INTO employees "
				   + "VALUES(EMPLOYEES_SEQ.NEXTVAL, ?, ?, ?, ?, SYSDATE, ?, ?, ? ,? ,?) ";
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, employee.getFirstName());
		pstmt.setString(2, employee.getLastName());
		pstmt.setString(3, employee.getEmail());
		pstmt.setString(4, employee.getPhoneNumber());
		pstmt.setString(5, employee.getJobId());
		pstmt.setDouble(6, employee.getSalary());
		pstmt.setDouble(7, employee.getCommissionPct());
		pstmt.setInt(8, employee.getManagerId());
		pstmt.setInt(9, employee.getDepartmentId());
		pstmt.executeUpdate(); // INSERT, UPDATE, DELETE 구문을 실행한다.
		
		pstmt.close();
		conn.close();
	}
	
	public List<Employee> getAllEmployees() throws SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "SELECT employee_id, first_name, last_name "
				   + "FROM employees "
				   + "ORDER BY employee_id ASC ";
		
		Connection con = ConnectionUtil.getConnection(); 		// DBMS와 연결을 담당하는 Connection 객체 획득
		PreparedStatement pstmt = con.prepareStatement(sql);	// 지정된 SQL을 DBMS로 전송하는 PreparedStatement  객체 획득
		ResultSet rs = pstmt.executeQuery();					// SQL을 DBMS로 전송하고 실행결과가 포함된 ResultSet 객체 획득
		
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			
			employees.add(emp);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return employees;
	}
	
	public Employee getEmployee(int empId) throws SQLException {
		String sql = "SELECT * "
		           + "FROM employees "
		           + "WHERE employee_id = ? ";
		
		Employee emp = null;
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, empId);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			emp = new Employee();
			emp.setId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setPhoneNumber(rs.getString("phone_number"));
			emp.setHireDate(rs.getDate("hire_date"));
			emp.setJobId(rs.getString("job_id"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setCommissionPct(rs.getDouble("commission_pct"));
			emp.setManagerId(rs.getInt("manager_id"));
			emp.setDepartmentId(rs.getInt("department_id"));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		
		return emp;
	}
	
	public List<EmployeeDto> getEmployeeDto() throws SQLException {
		String sql = "SELECT DISTINCT m.employee_id, m.first_name, m.last_name "
				+ "FROM employees e, employees m "
				+ "WHERE e.manager_id = m.employee_id "
				+ "ORDER BY m.employee_id ASC ";
		
		List<EmployeeDto> dtos = new ArrayList<EmployeeDto>();
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			EmployeeDto employeeDto = new EmployeeDto();
			employeeDto.setManagerId(rs.getInt("employee_id"));
			employeeDto.setManagerName(rs.getString("first_name") + rs.getString("last_name"));
			
			dtos.add(employeeDto);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return dtos;
		
		
	}
	
	/**
	 * 부서아이디를 전달받아서
	 * @param deptId
	 * @return
	 * @throws SQLException
	 */
	public List<Employee> getEmployeesByDepartmentId(int deptId) throws SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		
		String sql = "SELECT * " 
				   + "FROM employees "
				   + "WHERE department_id = ? ";
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, deptId);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setPhoneNumber(rs.getString("phone_number"));
			emp.setHireDate(rs.getDate("hire_date"));
			emp.setJobId(rs.getString("job_id"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setCommissionPct(rs.getDouble("commission_pct"));
			emp.setManagerId(rs.getInt("manager_id"));
			emp.setDepartmentId(rs.getInt("department_id"));
			
			
			employees.add(emp);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		
		return employees;
	}
}
