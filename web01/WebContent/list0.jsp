<%@page import="bean.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	MemberDAO dao = new MemberDAO();
    	ArrayList<MemberVO> list = dao.list();
     	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "red">
<% 
for(MemberVO bag: list){
%>
	회원 ID : <%= bag.getId() %><br>
	회원 PW : <%= bag.getPw() %><br>
	회원 이름 : <%= bag.getName() %><br>
	회원 전화번호 : <%= bag.getTel() %><br>
	<%= "------------------------------\n" %>
<% }%>
</body>
</html>