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
		$('#b4').click(function() {
			$('div').html("");
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fsports%2F%3FoutputType%3Dxml&api_key=qungx0ckso98vtuwlfu6ilpbju6s389tcukapnyt",
				success: function(x) {
					/* console.log(x); */
					let list = x.items
					for(let i = 0;i<list.length;i++){
						console.log(list[i].title)
						console.log(list[i].link)
						console.log(list[i].content)	
						aTag = "<a href=" + list[i].link + ">" + list[i].title + "</a>"
						$('#d1').append(aTag + " " + list[i].content)
					}
				},
				error: function(e) {
					alert('에러가 발생함')
				}
			
			})//$b4
		})//ajax
		$('#b2').click(function() {
			$('div').html("");
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fentertainments%2F%3FoutputType%3Dxml&api_key=qungx0ckso98vtuwlfu6ilpbju6s389tcukapnyt",
				success: function(x) {
					/* console.log(x); */
					let list = x.items
					for(let i = 0;i<list.length;i++){
						console.log(list[i].title)
						console.log(list[i].link)
						console.log(list[i].content)	
						aTag = "<a href=" + list[i].link + ">" + list[i].title + "</a>"
						$('#d1').append(aTag + " " + list[i].content)
					}
				},
				error: function(e) {
					alert('에러가 발생함')
				}
			
			})//$b3
		})//ajax
		$('#b3').click(function() {
			$('div').html("");
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fpolitics%2F%3FoutputType%3Dxml&api_key=qungx0ckso98vtuwlfu6ilpbju6s389tcukapnyt",
				success: function(x) {
					/* console.log(x); */
					let list = x.items
					for(let i = 0;i<list.length;i++){
						console.log(list[i].title)
						console.log(list[i].link)
						console.log(list[i].content)	
						aTag = "<a href=" + list[i].link + ">" + list[i].title + "</a>"
						$('#d1').append(aTag + " " + list[i].content)
					}
				},
				error: function(e) {
					alert('에러가 발생함')
				}
			
			})//$b3
		})//ajax
	})
</script>
</head>
<body background="yellow">
	<button id='b2'>연예기사보기</button>
	<button id='b3'>정치기사보기</button>
	<button id='b4'>스포츠기사보기</button><br>
	<div id="d1"></div>
</body>
</html>