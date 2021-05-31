<%@page import="java.net.URLEncoder"%>
<%@page import="com.sample.vo.User"%>
<%@page import="com.sample.dao.ReviewDao"%>
<%@page import="com.sample.vo.Review"%>
<%@page import="com.sample.util.CommonUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//클라이언트 전용의 세션객체에서 저장된 사용자정보 조회
	User sessionSavedUser = (User) session.getAttribute("LOGINED_USER_INFO");

	// 클라이언트 전용의 세션객체에서 사용자정보가 조회되지 않으면 로그인하지 않은 사용자임
	// 로그인 폼 페이지를 재요청하는 URL을 응답으로 보낸다.
	if (sessionSavedUser == null) {
		String encodedText = URLEncoder.encode("리뷰등록", "utf-8");
		response.sendRedirect("../user/loginform.jsp?fail=deny&job="+ encodedText);
		return;
	}

	int productNo = CommonUtils.stringToInt(request.getParameter("productNo"));
	int pageNo = CommonUtils.stringToInt(request.getParameter("pageNo"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String userId = sessionSavedUser.getId();
	
	Review review = new Review();
	review.setProductNo(productNo);
	review.setUserId(userId);
	review.setTitle(title);
	review.setContent(content);
	
	ReviewDao reviewDao = ReviewDao.getInstance();
	reviewDao.insertReview(review);
	
	response.sendRedirect("detail.jsp?no=" + productNo + "&page=" + pageNo);

%>