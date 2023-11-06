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
		$('#b1').click(function() {
			$.ajax({
				url: "data/company_mock.json",
				success: function(json) {
					alert('데이터의 갯수 : ' + json.length + '개')
					for(let i = 0;i<json.length;i++){
						console.log('id : ' + json[i].id)
						console.log('name : ' + json[i].name)
						console.log('addr : ' + json[i].addr)
						console.log('tel : ' + json[i].tel)
						console.log('domain : ' + json[i].domain)
					}
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">company.json읽어와서 추출하기</button>
<button id="b2">company.xml읽어와서 추출하기</button>
<div></div>
</body>
</html>