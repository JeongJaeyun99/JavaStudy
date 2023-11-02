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
		$.ajax({
			url: "ok.jsp",
			success: function(result) {
				$('#d1').html(result)
			}
		})// ajax
		$.ajax({
			url: "weather.jsp",
			success: function(result) {
				$('#d2').html(result)
			}
		})//ajax
		$.ajax({
			url: "tour.jsp",
			success: function(result) {
				$('#d3').html(result)
			}
		})//ajax
	})// $
</script>
</head>
<body>
<div id="d1" style="background:yellow">
</div>
<div id="d2" style="background:green">
</div>
<div id="d3" style="background:lightblue">
</div>
</body>
</html>