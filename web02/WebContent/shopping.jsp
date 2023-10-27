<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 뉴스 댓글을 쓸때, 로그인 했을때와 로그인 하지 않았을때의 화면이 다름.
    	// 로그인 했을때, 안했을때 판단을 세션에 id가 저장되어있는지 확인해서 판단함.
    	if(session.getAttribute("id") == null) {
    		// id란 이름읗로 저장된 세션 XX
    		out.print("로그인 되지 않았습니다! 먼저 로그인을 해주세요");
    		out.print("<input name=id>");
    	}else{
    		out.print(session.getAttribute("id") + "님이 로그인 되었습니다.");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	쇼핑몰 화면 입니다.
</body>
</html>