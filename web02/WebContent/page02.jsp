<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    	Cookie[] cookies = request.getCookies();
    	String name = "";
    	String value = "";
    	 //==> 서블릿으로 변환될 때 service()안으로 코드가 다 들어가 생성.
    	for(Cookie c : cookies){
    		if(c.getName().equals("category") || c.getName().equals("sort"))
    		out.print("쿠키의 이름 : " + c.getName() + "   쿠키의 값 : " + c.getValue() + "<br>");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	쿠키의 개수 : <%= cookies.length %>개<br>
	<a href="특정한쿠키지우기.jsp">특정한쿠키지우기</a>	
</body>
</html>