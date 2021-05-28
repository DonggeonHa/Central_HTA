<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="com.sample.vo.User"%>
<%@page import="com.sample.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// loginform.jsp에서 login.jsp로 제출된 요청파라미터값 조회하기
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// SAMPLE_USER 테이블에 대한 CRUD기능을 제공하는 UserDao 객체 획득하기
	UserDao userDao = UserDao.getInstance();
	User savedUser = userDao.getUserById(id);
	
	// 전달받은 비밀번호를 암호화한다.
	String sha256Password = DigestUtils.sha256Hex(password);
	
	// 암호화된 패스워드를 서로 비교한다.
	if (savedUser.getPassword().equals(sha256Password)) {
		// 사용자 인증을 통과한 경우
		// HttpSession 객체에 사용자 정보를 저장한다.
		session.setAttribute("LOGINED_USER_INFO", savedUser);
	}
	
	response.sendRedirect("/sample-mybatis/index.jsp");
%>
