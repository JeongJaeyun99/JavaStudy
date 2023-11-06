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
				url: "data/car.json",
				success: function(json) {
					$(json).each(function(i,one) {
						idValue=one.id
						emailValue = one.email
						carValue = one.car
						$.ajax({
							url: "db_create.jsp",
							data : {
								id : idValue,
								email : emailValue,
								car  : carValue
							},
							success : function(result) {
								console.log(result)
								if(result.trim() == '1'){
									console.log('성공적으로 데이터가 추가되었습니다.')
						    	}else{
						    		console.log('데이터 추가에 실패하였습니다!')
						    	}
								
							}
						})
					})
				}
			})
		})// $
		$('#b2').click(function() {
			$.ajax({
				url:"data/car.xml",
				success : function(xml) {
					list = $(xml).find('record')
					$('div').empty()
					for(let i = 0;i < list.length;i++){
						id = $(list[i]).find('id').text()
						email = $(list[i]).find('email').text()
						car = $(list[i]).find('car').text()
						$('div').append(id + " 이메일 : " + email + " 자동차 브랜드 : " + car + "<br>")
					}
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">car.json읽어와서 추출하기</button>
<button id="b2">car.xml읽어와서 추출하기</button>
<div></div>
</body>
</html>