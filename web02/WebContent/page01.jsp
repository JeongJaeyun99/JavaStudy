<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 쿠키(클라이언트)를 만들자
    	Cookie c3 = new Cookie("category","운동"); // 무조건 String
    	Cookie c4 = new Cookie("sort","축구"); // 무조건 String
    	// 브라우저에 심자(     HttpServltResponse response = new HttpServletResponse();    )
		response.addCookie(c3); // 서버로 보낼때    	
		response.addCookie(c4); // 서버로 보낼때    	
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>브라우저에 쿠키 심기 완료</h3>
	<a href="page02.jsp">쿠키보기</a>
</body>
</html>