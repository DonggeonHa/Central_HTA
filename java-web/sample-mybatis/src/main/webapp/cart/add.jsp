<%@page import="com.sample.dao.CartItemDao"%>
<%@page import="com.sample.vo.CartItem"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.sample.vo.User"%>
<%@page import="com.sample.util.CommonUtils"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
	// 클라이언트 전용의 세션객체에서 저장된 사용자정보 조회
	User sessionSavedUser = (User) session.getAttribute("LOGINED_USER_INFO");

	// 클라이언트 전용의 세션객체에서 사용자정보가 조회되지 않으면 로그인하지 않은 사용자임
	// 로그인 폼 페이지를 재요청하는 URL을 응답으로 보낸다.
	if (sessionSavedUser == null) {
		String encodedText = URLEncoder.encode("장바구니담기", "utf-8");
		response.sendRedirect("../user/loginform.jsp?fail=deny&job="+ encodedText);
		return;
	}

	// 요청 파라미터에서 상품번호 조회
	int productNo = CommonUtils.stringToInt(request.getParameter("no"));
	// 조회된 사용자정보에서 사용자 아이디 조회
	String userId = sessionSavedUser.getId();
	
	// CartItem객체를 생성해서 사용자아이디, 상품번호를 저장한다.
	CartItem cartItem = new CartItem();
	cartItem.setProductNo(productNo);
	cartItem.setUserId(userId);
	
	// SAMPLE_CART_ITEMS 테이블에 대한 CRUD 기능이 구현된 CartItemDao객체 획득하기
	CartItemDao cartItemDao = CartItemDao.getInstance();
	// CartItemDao객체의 insertCartItem(장바구니아이템정보)를 실행해서 장바구니 아이템정보를 저장한다.
	cartItemDao.insertCartItem(cartItem);
	
	// 브라우져에게 재요청 URL을 응답으로 보낸다
	response.sendRedirect("/sample-mybatis/product/list.jsp");
%>
