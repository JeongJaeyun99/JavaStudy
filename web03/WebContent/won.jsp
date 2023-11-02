<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String won = request.getParameter("won");
	
	float dollarPrice = 1340.5f;
	
	float ans = Integer.parseInt(won) / dollarPrice;
	String result = ans + ""; 
%>
달러로 환산한 금액 : <%= result %>$