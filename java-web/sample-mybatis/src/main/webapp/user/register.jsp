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
	
	///////////// 입력값 누락 체크
	// 요청파라미터값으로 전달받은 사용자정보에 누락된 정보가 있으면 입력폼을 다시 요청하게 한다.
	if (id.isBlank() || password.isBlank() || name.isBlank() || email.isBlank() || phone.isBlank()) {
		response.sendRedirect("registerform.jsp?fail=blank");
		return;
	}
		
	// SAMPLE_USERS 테이블에 대한 CRUD 기능이 구현된 UserDao 객체를 획득한다.
	UserDao userDao = UserDao.getInstance();
	
	/////////// 아이디 중복체크
	// 요청파라미터값으로 전달받은 id가 이미 사용중인 아이디라면 입력폼을 다시 요청하게 한다.
	User savedUser = userDao.getUserById(id);
	if (savedUser != null) {
		response.sendRedirect("registerform.jsp?fail=id");
		return;
	}
	
	// 비밀번호를 암호화하기
	String sha256Password = DigestUtils.sha256Hex(password);
	
	// User객체를 생성해서 사용자정보를 저장한다.
	User user = new User();
	user.setId(id);
	user.setPassword(sha256Password);
	user.setName(name);
	user.setEmail(email);
	user.setPhone(phone);
	
	userDao.insertUser(user);
	
	// 브라우저에게 재요청 URL을 응답으로 보낸다.
	response.sendRedirect("registerSuccess.jsp");
%>