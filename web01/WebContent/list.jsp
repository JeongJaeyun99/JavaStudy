<%@page import="bean.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
        	MemberDAO2 dao = new MemberDAO2();
            	ArrayList<MemberVO> list = dao.list();
        %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
	body{
		background: lime;
	}
	*{
		font-size: 20px;
		text-align: center;
	}
	.left { 
		/* 여러개를 선택해서 지정하고 싶을 때 클래스를 사용. 클래스 중 left에 해당하는 것만 스타일을 지정해라. */
		/* 클래스 선택은 .클래스명 */
		width: 100px;
		background: blue;
		color: white;
	}
	.data { 
		width: 100px;
		background: white;
		color: blue;
	}
	#bottom {
		background: red;
		color: yellow;
	}
	input{
		background: greenyellow;
	}
	
</style>
</head>
<body bgcolor = "red">
<table border = "1" align = "center">
	<tr>
		<td class = "left">아이디</td>
		<td class = "left">비밀번호</td>
		<td class = "left">이름</td>
		<td class = "left">전화번호</td>
		<td class = "left">상세정보</td>
	</tr>
<% 
for(MemberVO bag: list){
%>	
	<tr>
		<td><%= bag.getId() %></td>
		<td><%= bag.getPw() %></td>
		<td><%= bag.getName() %></td>
		<td><%= bag.getTel() %></td>
		<td>
			<a href = "one.jsp?id=<%= bag.getId() %>">
				<button>상세정보보기</button>
			</a>
		</td>
	</tr>
<% }%>
</table>
</body>
</html>