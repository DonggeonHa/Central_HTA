<%@page import="com.sample.dao.ProductDao"%>
<%@page import="com.sample.vo.Product"%>
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

	// detail.jsp의 리뷰등록폼에서 전송한 값을 요청파라미터값으로 조회한다.
	int productNo = CommonUtils.stringToInt(request.getParameter("productNo"));
	int pageNo = CommonUtils.stringToInt(request.getParameter("pageNo"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String userId = sessionSavedUser.getId();
	
	// 입력값 유효성 검증
	if (title.isBlank() || content.isBlank()) {
		response.sendRedirect("detail.jsp?no="+ productNo + "&page=" + pageNo + "&fail=blank");
		return;
	}
	
	// Review객체를 생성해서 리뷰정보 저장하기
	Review review = new Review();
	review.setTitle(title);
	review.setContent(content);
	review.setProductNo(productNo);
	review.setUserId(userId);
	
	// SAMPLE_PRODUCT_REVIEWS에 CRUD기능을 지원하는 ReviewDao 객체 획득하기
	ReviewDao reviewDao = ReviewDao.getInstance();
	reviewDao.insertReview(review);
	
	ProductDao productDao = ProductDao.getInstance();
	Product product = productDao.getProductByNo(productNo);
	product.setReviewCnt(product.getReviewCnt() + 1);
	productDao.updateProduct(product);
	
	// 상품 상세 페이지를 재요청하는 URL을 응답으로 보낸다
	response.sendRedirect("detail.jsp?no=" + productNo + "&page=" + pageNo);

%>