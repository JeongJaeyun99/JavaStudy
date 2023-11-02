<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%
    	String id = request.getParameter("id");
    	String list[] = {"root", "admin","jeong"};
    	String result = "사용가능한 아이디 입니다.";
    	for(String check:list){
    		if(check.equals(id)){
    			result = "중복된 아이디입니다. 사용 불가능!";
    			break;
    		}
    	}
    %>
    <%= result %>