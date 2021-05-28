<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="com.sample.vo.User"%>
<%@page import="com.sample.dao.UserDao"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// loginform.jsp에서 login.jsp로 제출된 요청파라미터값 조회하기
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// 입력값 누락체크
	if (id.isBlank() || password.isBlank()) {
		response.sendRedirect("loginform.jsp?jail=blank");
		return;
	}
	
	// SAMPLE_USER 테이블에 대한 CRUD기능을 제공하는 UserDao객체 획득하기
	UserDao userDao = UserDao.getInstance();
	
	// 미가입회원인지 체크
	User savedUser = userDao.getUserById(id);
	
	if (savedUser == null) {
		response.sendRedirect("loginform.jsp?fail=invalid");
		return;
	}
	
	// 탈퇴처리된(비활성화 된) 회원인지 체크
	if ("inactive".equals(savedUser.getStatus())) {
		response.sendRedirect("loginform.jsp?fail=inactive");
		return;
	}
	
	// 비밀번호 일치여부 체크하기
	String sha256Password = DigestUtils.sha256Hex(password);
	if (!sha256Password.equals(savedUser.getPassword())) {
		response.sendRedirect("loginform.jsp?fail=invalid");
		return;
	}
	
	// 입력값 누락/ 미가입 사용자/ 탈퇴처리된 사용자/ 비밀번호 불일치 등의
	// 모든 체크를 통과한 경우 아래의 코드가 실행된다
	
	// 사용자 인증과정을 통과한 사용자정보를 세션객체에 저장한다.
	// 자바웹의 로그인처리 | 사용자인증과정을 통과한 사용자 정보를 클라이언트 전용의 세션객체에 저장하는 것
	session.setAttribute("LOGINED_USER_INFO", savedUser);

	// 로그인처리가 완료되면 메인페이지를  재요청하는 URL을 응답으로 보낸다
	response.sendRedirect("/sample-mybatis/index.jsp");
	
%>