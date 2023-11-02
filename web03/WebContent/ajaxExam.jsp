<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#d').click(function() {
			let wonValue = $('#wtod').val()
			$.ajax({
				url:"won.jsp",
				data:{
					won: wonValue
				},
				success: function(result) {
					$('div').html(result)
				}
			})//ajax
		})
		$('#w').click(function() {
			let dollarValue = $('#dtow').val()
			$.ajax({
				url:"dollar.jsp",
				data:{
					dollar: dollarValue
				},
				success: function(result) {
					$('div').html(result)
				}
			})//ajax
		})//$		
	})
</script>
</head>
<body>
	<h3>비동기 통신으로 서버와 통신하기</h3>
	원화를 달러로 : <input id="wtod"> <button id="d">원화를 달러로</button>
	<hr color="red">
	달러를 원화로 : <input id="dtow"> <button id="w">달러를 원화로</button>
	<hr color="blue">
	<div>결과가 표시되는곳</div>
</body>
</html>