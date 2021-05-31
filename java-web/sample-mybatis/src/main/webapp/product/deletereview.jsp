<%@page import="com.sample.dao.ReviewDao"%>
<%@page import="com.sample.util.CommonUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int reviewNo = CommonUtils.stringToInt(request.getParameter("reivewNo"));
	int productNo = CommonUtils.stringToInt(request.getParameter("productNo"));	
	int pageNo = CommonUtils.stringToInt(request.getParameter("pageNo"));

	ReviewDao reviewDao = ReviewDao.getInstance();
	reviewDao.deleteReview(reviewNo);
	
	response.sendRedirect("detail.jsp?no=" + productNo + "&page=" + pageNo);
%>