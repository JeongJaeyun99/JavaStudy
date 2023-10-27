<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id= request.getParameter("id");
    	String pw= request.getParameter("pw");
    	String id2 = "apple";
    	String pw2 = "1234";
    	if(id.equals(id2) && pw.equals(pw2)){
    		session.setAttribute("id", id);  
    		out.print("<h3>로그인성공<h3>");
    		out.print("<script>alert('로그인성공')</script>");
    	}else{
    		out.print("<a href=네이버로그인.jsp>로그인하는 페이지로 이동</a><br>");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="news.jsp">뉴스로 링크</a>
	<a href="mail.jsp">메일로 링크</a>
	<a href="shopping.jsp">쇼핑으로 링크</a>
</body>
</html>