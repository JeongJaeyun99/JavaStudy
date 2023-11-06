<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="dao" class="bean.CompanyDAO"></jsp:useBean>
    <jsp:useBean id="bag" class="bean.CompanyDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
<%
	int result = dao.insert(bag);
%>
<%=
	result
%>