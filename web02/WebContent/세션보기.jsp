<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String name = (String)session.getAttribute("name");
    	int age = (int)session.getAttribute("age");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : ${name}<br>
	나이 : ${age}<br>
	내년의 나이 : <%= age+1 %>세	<br>
</body>
</html>