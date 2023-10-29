<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	int money1 = (int)session.getAttribute("tennis");
    	int money2 = (int)session.getAttribute("swim");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	테니스와 수영 둘다 수강 할 시 수강료 : <%= money1 + money2 %>원
</body>
</html>