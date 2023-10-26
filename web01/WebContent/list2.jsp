<%@page import="bean.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	BbsDAO dao = new BbsDAO();
    	ArrayList<BbsVO> list = dao.list();
     	
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
		<td class = "left">No</td>
		<td class = "left">제목</td>
		<td class = "left">내용</td>
		<td class = "left">작성자</td>	
	</tr>
<% 
for(BbsVO bag: list){
%>	
	<tr>
		<td><%= bag.getNo() %></td>
		<td><a href = "one2.jsp?no=<%= bag.getNo() %>"><%= bag.getTitle() %></a></td>
		<td><%= bag.getContent() %></td>
		<td><%= bag.getWriter() %></td>
	</tr>
<% }%>
</table>
</body>
</html>