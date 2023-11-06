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
					$(json).each(function(i,one) {
						idValue = one.id
						nameValue = one.name
						addrValue = one.addr
						telValue = one.tel
						domainValue = one.domain
						$.ajax({
							url : "db_create2.jsp",
							data : {
								id : idValue,
								name: nameValue,
								addr : addrValue,
								tel : telValue,
								domain : domainValue,
							},
							async : false,
							success : function(result) {
								if(result.trim() == 1){
									console.log('db에 추가 성공!')
								}else{
									console.log('db에 추가 실패...')									
								}
								
							}
						})						
					})
					
				}
			})
		})// $
		$('#b2').click(function() {
			$.ajax({
				url:"data/company_mock.xml",
				success : function(xml) {
					list = $(xml).find('record')
					$('div').empty()
					for(let i = 0;i < list.length;i++){
						id = $(list[i]).find('id').text()
						name = $(list[i]).find('name').text()
						addr = $(list[i]).find('addr').text()
						tel = $(list[i]).find('tel').text()
						domain = $(list[i]).find('domain').text()
						$('div').append(id + " 이름 : " + name + " 주소 : " + addr + " 전화번호 : " + tel + " 도메인 : " + domain + "<br>")
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