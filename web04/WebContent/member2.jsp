<%@page import="bean.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="bean.MemberDTO2"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"></jsp:setProperty>
    <% 
	    MemberDAO2 dao = new MemberDAO2();
		int result = dao.insert(bag);
    	String resultText = "";
		if(result == 1){	
    		resultText = "회원가입에 성공하였습니다.";
    	}else{
    		resultText = "회원가입에 실패하였습니다.";    		
    	}
    			
    %>
    <%
    	/*  String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	
    	MemberDTO2 bag = new MemberDTO2();
    	bag.setId(id);
    	bag.setPw(pw);
    	bag.setName(name);
    	bag.setTel(tel); */ 
   	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<%= resultText %>
			<a href="member.jsp">회원가입 로그인 페이지로 이동</a>
		</div>
	</div>
</body>
</html>