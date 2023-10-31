<%@page import="java.util.ArrayList"%>
<%@page import="bean.ProductDAO"%>
<%@page import="bean.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include> <!-- 액션태그 -->
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<div id="center">
			<% if(session.getAttribute("id") != null ) { %>
				<%= session.getAttribute("id") %>님 환영합니다.
				<a href="logout.jsp">
					<button class="btn btn-outline-danger">로그아웃</button>
				</a>
				<%
					String id = request.getParameter("id");
	   				ProductDAO dao = new ProductDAO();
	   				ProductDTO bag = new ProductDTO();
	   				bag.setId(id);
	   				ProductDTO bag2 = dao.one(bag);
   				%>
   				<table border="1" class="table table-hover">
   					<tr>
   						<td rowspan="5"><img src="img/<%= bag2.getImg() %>"></td>
   						<td><span class="badge bg-primary">상품 아이디</span><%= bag2.getId() %></td>
   					</tr>
    				<tr>
   						<td><span class="badge bg-primary">상품 제목</span><%= bag2.getTitle() %></td>
   					</tr>
   					<tr>
   						<td><span class="badge bg-primary">상품 설명</span><%= bag2.getContent() %></td>
   					</tr>
   					<tr>
   						<td><span class="badge bg-primary">상품 가격</span><%= bag2.getPrice() %></td>
   					</tr>
   					<tr>	
   						<td><span class="badge bg-primary">상품 회사</span><%= bag2.getCompany() %></td>
   					</tr>
   					<tr>
						<td colspan="2" class="alert alert-Warning">
							<button class="btn btn-primary" id="basket">장바구니</button>
							<button class="btn btn-success">주문하기</button>
						</td>
					</tr>
   				</table>
   			<% } %>
			</div>
		</div>
	</div>
</body>
</html>