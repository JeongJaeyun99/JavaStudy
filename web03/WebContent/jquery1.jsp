<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function age() {
		let yearTag = document.getElementById('year');
		let yearValue = yearTag.value;
		let year2 = 2023;
		let age = year2-parseInt(yearValue);
		alert('당신의 나이는 ' + age);
	}
	function rec() {
		let weightTag = document.getElementById('w');
		let heightTag = document.getElementById('h');
		let weightValue = weightTag.value;
		let heightValue = heightTag.value;
		let ans = parseInt(weightValue)*parseInt(heightValue);
		alert('사각형의 면적은 ' + ans);
	}

</script>
</head>
<body>
생년입력 : <input id="year" value="2000"> <button onclick="age()">나이계산</button><br>
사각형의 면적 가로: <input id="w"> 세로 : <input id="h">
								<button onclick="rec()">사각형의 면적 계산</button><br>
</body>
</html>