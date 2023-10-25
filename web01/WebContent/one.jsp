<%@ page import="bean.MemberVO"%>
<%@ page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    jsp에서해야하는 3가지
		1. form안에 입력한 데이터를 받아서 저장해두자
		2. 받은 데이터를 DAO에게 주자
		3. 결과를 html로 만들자. 
     -->
     <% 
     // 스크립트릿(let)이라고 한다.
/* 		1. form안에 입력한 데이터를 받아서 저장해두자 */
     	// 미리 톰켓에서 자주 사용하는 부품은 new를 이용해서 객체를 만드어놓았음
     	// 미리 만들어서 제공하는 객체 >> 내장된 객체
     	// 클라이언트로 부터 데이터를 받아오는 객체 >> request
     	String id = request.getParameter("id");    	
     	
     	
     	// 2. DAO에 데이터를 주소 db처리 요청
     	MemberDAO dao = new MemberDAO();
     	
     	MemberVO vo = dao.one(id);
     	
     	
     	// 3. 결과를 html로 만들어서 클라이언트에 전송     	
     	
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "red">
	<h3>회원 <%= id %>님의 회원정보 검색 결과</h3>
	<hr color = "blue">
	회원 ID : <%= vo.getId() %><br>
	회원 PW : <%= vo.getPw() %><br>
	회원 이름 : <%= vo.getName() %><br>
	회원 전화번호 : <%= vo.getTel() %><br>
</body>
</html>