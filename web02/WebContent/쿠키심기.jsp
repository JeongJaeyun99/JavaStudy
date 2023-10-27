<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 쿠키(클라이언트)를 만들자
    	Cookie c1 = new Cookie("name","hong"); // 무조건 String
    	Cookie c2 = new Cookie("age","100"); // 무조건 String
    	// 브라우저에 심자(     HttpServltResponse response = new HttpServletResponse();    )
		response.addCookie(c1); // 서버로 보낼때    	
		response.addCookie(c2); // 서버로 보낼때    	
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>브라우저에 쿠키 심기 완료</h3>
	<a href="쿠키보기.jsp">쿠키보기</a>
</body>
</html>