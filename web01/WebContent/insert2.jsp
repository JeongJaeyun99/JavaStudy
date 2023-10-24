<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
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
     	String title = request.getParameter("title");
     	String content = request.getParameter("content");
     	String writer = request.getParameter("writer");
     	
     	// 2. DAO에 데이터를 주소 db처리 요청
     	BbsDAO dao = new BbsDAO();
     	BbsVO bag = new BbsVO();
     	
     	bag.setTitle(title);
     	bag.setContent(content);
     	bag.setWriter(writer);
     	
     	dao.insert(bag);
     	
     	// 3. 결과를 html로 만들어서 클라이언트에 전송     	
     	
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "red">
	<h5>게시물이 등록되었습니다.</h5>
	<hr color = "green">
	게시글의 제목은 : <%= title %> <br>
	게시글의 내용은 : <%= content %> <br>
	게시글의 작성자는 : <%= writer %> <br>
</body>
</html>