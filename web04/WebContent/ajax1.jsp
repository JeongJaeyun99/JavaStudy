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
			url: "https://www.chosun.com/arc/outboundfeeds/rss/category/sports/?outputType=xml",
			success: function(x) {
				alert(x);
			},
			error: function(e) {
				alert('에러가 발생함')
			}
		})//ajax
	})
</script>
</head>
<body>

</body>
</html>