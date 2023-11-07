<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 무조건 get요청 -->
	<a href="hi?q=car">get요청</a><br>
	<!-- get,post선택가능 -->
	<form action="hi?id=apple&&pw=1234" method="post">
		id : <input name="id" value="apple"><br>
		pw : <input name="pw" value="1234"><br>
		<button>서버로 제출</button>
	</form>
</body>
</html>