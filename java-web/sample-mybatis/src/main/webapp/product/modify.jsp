<%@page import="com.sample.dao.ProductDao"%>
<%@page import="com.sample.vo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	String category = request.getParameter("category");
	String name = request.getParameter("name");
	String maker = request.getParameter("maker");
	int price = Integer.parseInt(request.getParameter("price"));
	int discountPrice = Integer.parseInt(request.getParameter("discountPrice"));
	int stock = Integer.parseInt(request.getParameter("stock"));
	String soldOut = request.getParameter("soldOut");

	Product product = new Product();
	product.setNo(no);
	product.setCategory(category);
	product.setName(name);
	product.setMaker(maker);
	product.setPrice(price);
	product.setDiscountPrice(discountPrice);
	product.setStock(stock);
	product.setSoldOut(soldOut);
	
	ProductDao productDao = ProductDao.getInstance();
	productDao.updateProduct(product);
	
	response.sendRedirect("detail.jsp?no="+product.getNo());
%>