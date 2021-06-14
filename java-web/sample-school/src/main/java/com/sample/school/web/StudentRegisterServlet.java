package com.sample.school.web;

import java.io.IOException;

import com.sample.school.dao.StudentDao;
import com.sample.school.vo.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerStudent")
public class StudentRegisterServlet extends HttpServlet {

	StudentDao studentDao = StudentDao.getInstance();
	Student student = new Student();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String id = req.getParameter("userid");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		int deptNo = Integer.parseInt(req.getParameter("departmentNo"));
		int grade = Integer.parseInt(req.getParameter("grade"));
		
		student.setId(id);
		student.setPassword(password);
		student.setName(name);
		student.setDepartmentNo(deptNo);
		student.setGrade(grade);
		
		studentDao.insertStudent(student);
		
		res.sendRedirect("index");
	}
}
