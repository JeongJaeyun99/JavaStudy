<%@page import="bean.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	ProductDAO dao = new ProductDAO();
    	ArrayList<ProductVO> list = dao.list();
     	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
	body{
		background: lime;
	}
	*{
		font-size: 20px;
		text-align: center;
	}
	.left { 
		/* 여러개를 선택해서 지정하고 싶을 때 클래스를 사용. 클래스 중 left에 해당하는 것만 스타일을 지정해라. */
		/* 클래스 선택은 .클래스명 */
		width: 100px;
		background: blue;
		color: white;
	}
	.data { 
		width: 100px;
		background: white;
		color: blue;
	}
	#bottom {
		background: red;
		color: yellow;
	}
	input{
		background: greenyellow;
	}
	
</style>
</head>
<body bgcolor = "red">
<table border = "1" align = "center">
	<tr>
		<td class = "left">상품번호</td>
		<td class = "left">상품이름</td>
		<td class = "left">가격</td>
		<td class = "left">이미지</td>
	</tr>
<% 
for(ProductVO bag: list){
%>	
	<tr>
		<td><%= bag.getId() %></td>
		<td><a href = "one3.jsp?id=<%= bag.getId() %>"><%= bag.getName() %></a></td>
		<td><%= bag.getPrice() %></td>
		<td>
			<img src="img/<%= bag.getImg() %>" width = "100",height = "100">
			<%-- <%= bag.getImg() %> --%>
		</td>
	</tr>
<% }%>
</table>
</body>
</html>