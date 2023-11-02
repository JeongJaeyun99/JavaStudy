<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String dollar = request.getParameter("dollar");
	
	float dollarPrice = 1340.5f;
	
	float ans = Integer.parseInt(dollar) *dollarPrice;
	String result = ans + ""; 
%>
원화로 환산한 금액 : <%= result %>원