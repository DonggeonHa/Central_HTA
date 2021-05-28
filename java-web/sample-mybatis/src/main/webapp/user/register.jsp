<%@page import="com.sample.dao.UserDao"%>
<%@page import="com.sample.vo.User"%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// registerform.jsp에서 register.jsp로
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	
	// 비밀번호를 암호화하기
	String sha256Password = DigestUtils.sha256Hex(password);
	
	// User객체를 생성해서 사용자정보를 저장한다.
	User user = new User();
	user.setId(id);
	user.setPassword(sha256Password);
	user.setName(name);
	user.setEmail(email);
	user.setPhone(phone);
	
	// SAMPLE_USERS 테이블에 대한 CRUD 기능이 구현된 UserDao 객체를 획득한다.
	UserDao userDao = UserDao.getInstance();
	userDao.insertUser(user);
	
	// 브라우저에게 재요청 URL을 응답으로 보낸다.
	response.sendRedirect("registerSuccess.jsp");
%>