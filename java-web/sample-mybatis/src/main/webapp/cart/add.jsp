<%@page import="com.sample.dao.CartItemDao"%>
<%@page import="com.sample.vo.CartItem"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.sample.vo.User"%>
<%@page import="com.sample.util.CommonUtils"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%

	/*
		클라이언트 전용의 세션객체가 JSP 내장객체를 저장하는 session 참조변수에 연결되는 과정
		1. 요청객체의 요청헤더정보에서 클라이언트가 전달한 세션아이디를 조회한다.
		2. Tomcat 서버에서 조회된 세션아이디에 해당하는 세션객체를 검색한다.
		3. 세션아이디에 해당하는 세션객체가 검색되면 해당 세션객체를 session 참조변수에 대입한다.
		4. 개발자가 작성한 JSP 코드에서는 session참조변수를 이용해서 세션객체에 접근할 수 있다.
	*/
	
	/*
		login.jsp에서는 사용자 인증이 완료되면 세션객체에 사용자정보를 저장한다.
		session.setAttribyte("LOGINED_USER_INFO", user); 	// "LOGINED_USER_INFO"이름으로 User객체 저장
		
		* 사용자 인증이 완료된 이후에 실행되는 모든 JSP에서는
		  login.jsp에서 세션객체에 저장해둔 사용자 정보를 꺼낼수 있다.
		  User sessionSavedUser = (User) session.getAttribyte("LOGINED_USER_INFO");
		* 단, 사용자 인증이 완료되지 않은 경우에는
		  세션객체에서 저장해둔 사용자정보가 없기때문에 모든 JSP에서
		  User sessionSavedUser = (User) session.getAttribyte("LOGINED_USER_INFO");를 실행하면
		  sessionSaveduser에 대입되는 값은 null이다
	*/
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
