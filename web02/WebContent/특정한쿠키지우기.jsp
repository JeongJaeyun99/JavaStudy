<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Cookie c1 = new Cookie("name","hong");
    	c1.setMaxAge(0);
    	response.addCookie(c1);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <a href="page02.jsp">쿠키보기</a>	
</body>
</html>