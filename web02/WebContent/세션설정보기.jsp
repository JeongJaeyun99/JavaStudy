<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	int view = (int)session.getAttribute("view");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	조회수는 : <%= view %>
	<a href="조회수증가.jsp">조회수 증가</a>
</body>
</html>