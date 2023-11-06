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
		$('#w1').click(function() {
			$.ajax({
				url : "https://api.openweathermap.org/data/2.5/weather?lat=37.6178618&lon=127.0149653&appid=0e0b977eb211041a35f400926786704f", 
				dataType : 'json',
				success : function(x) {
					$('#d1').html("위치 : "+x.name+"<br>"+
					"날씨 : "+x.weather[0].description+"<br>"+
					"풍속 : "+x.wind.speed+"<br>"+
					"최고기온 : "+x.main.temp_max+"<br>"+
					"최저기온 : "+x.main.temp_min+"<br>"+
					"체감온도 : "+x.main.feels_like+"<br>" +
					"구름 : "+x.clouds.all+"<br>")
				}
			})
		})
		
		$('#w2').click(function() {
			$.ajax({
				url : "https://api.openweathermap.org/data/2.5/weather?lat=37.6178618&lon=127.0149653&appid=0e0b977eb211041a35f400926786704f", 
				dataType : 'json',
				success : function(x) {
					$('#d1').html("위치 : "+x.name+"<br>"+
					"날씨 : "+x.weather[0].description+"<br>"+
					"풍속 : "+x.wind.speed+"<br>"+
					"최고기온 : "+x.main.temp_max+"<br>"+
					"최저기온 : "+x.main.temp_min+"<br>"+
					"체감온도 : "+x.main.feels_like+"<br>" +
					"구름 : "+x.clouds.all+"<br>")
				}
			})
		})
	})
</script>
</head>
<body>
	<button id="w1">날씨정보보기1</button>
	<button id="w2">날씨정보보기2</button>
	<div id="d1"></div>
</body>
</html>