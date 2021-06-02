<%@page import="com.sample.dao.BoardDao"%>
<%@page import="com.sample.vo.Board"%>
<%@page import="com.sample.util.CommonUtils"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	int no = CommonUtils.stringToInt(request.getParameter("no"));
	int pageNo = CommonUtils.stringToInt(request.getParameter("page"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	int viewCount = CommonUtils.stringToInt(request.getParameter("viewCount"));
	
	Board board = new Board();
	board.setNo(no);
	board.setTitle(title);
	board.setContent(content);
	board.setViewCount(viewCount);
	
	BoardDao boardDao = BoardDao.getInstance();
	boardDao.updateBoard(board);
	
	response.sendRedirect("detail.jsp?no=" + no + "&page=" + pageNo);
%>
