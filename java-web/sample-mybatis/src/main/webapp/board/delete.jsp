<%@page import="com.sample.dao.BoardDao"%>
<%@page import="com.sample.util.CommonUtils"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int no = CommonUtils.stringToInt(request.getParameter("no"));

	BoardDao boardDao = BoardDao.getInstance();
	boardDao.deleteBoard(no);
	
	response.sendRedirect("list.jsp");
%>