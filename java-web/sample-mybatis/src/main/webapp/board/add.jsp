<%@page import="com.sample.vo.User"%>
<%@page import="com.sample.vo.Board"%>
<%@page import="com.sample.dao.BoardDao"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	User sessionSavedUser = (User) session.getAttribute("LOGINED_USER_INFO");

	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String userId = sessionSavedUser.getId();
	
	if (title.isBlank() || content.isBlank()) {
		response.sendRedirect("form.jsp?fail=blank");
		return;
	}
	
	Board board = new Board();
	board.setTitle(title);
	board.setContent(content);
	board.setUserId(userId);
	
	BoardDao boardDao = BoardDao.getInstance();
	boardDao.insertBoard(board);
	
	response.sendRedirect("list.jsp");
%>