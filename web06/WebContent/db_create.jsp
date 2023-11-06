<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<jsp:useBean id="dao" class="bean.CarDAO"></jsp:useBean>
	<jsp:useBean id="bag" class="bean.CarDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
    <%
    	int result = dao.insert(bag);
    %>
    <%= result %>