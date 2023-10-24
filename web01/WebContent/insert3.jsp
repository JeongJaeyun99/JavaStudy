<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    jsp에서해야하는 3가지
		1. form안에 입력한 데이터를 받아서 저장해두자
		2. 받은 데이터를 DAO에게 주자
		3. 결과를 html로 만들자. 
     -->
     <% 
     // 스크립트릿(let)이라고 한다.
/* 		1. form안에 입력한 데이터를 받아서 저장해두자 */
     	// 미리 톰켓에서 자주 사용하는 부품은 new를 이용해서 객체를 만드어놓았음
     	// 미리 만들어서 제공하는 객체 >> 내장된 객체
     	// 클라이언트로 부터 데이터를 받아오는 객체 >> request
     	String id = request.getParameter("id");
     	String name = request.getParameter("name");
     	String content = request.getParameter("content");
     	String price2 = request.getParameter("price");
     	int price = Integer.parseInt(price2);
     	String company = request.getParameter("company");
     	String img = request.getParameter("img");
     	
     	// 2. DAO에 데이터를 주소 db처리 요청
     	ProductDAO dao = new ProductDAO();
     	ProductVO bag = new ProductVO();
     	
     	bag.setId(id);
     	bag.setName(name);
     	bag.setContent(content);
     	bag.setPrice(price);
     	bag.setCompany(company);
     	bag.setImg(img);
     	
     	dao.insert(bag);
     	
     	// 3. 결과를 html로 만들어서 클라이언트에 전송     	
     	
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "red">
	<h5>게시물이 등록되었습니다.</h5>
	<hr color = "green">
	상품의 아이디은 : <%= id %> <br>
	상품의 이름은 : <%= name %> <br>
	상품의 내용은 : <%= content %> <br>
	상품의 가격은 : <%= price %> <br>
	상품의 회사는 : <%= company %> <br>
	상품의 이미지는 : <%= img %> 
</body>
</html>