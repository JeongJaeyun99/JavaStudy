<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean> 
    <jsp:setProperty property="id" name="bag"/>
    
<%
	BbsDAO dao = new BbsDAO();
	int result = dao.delete(bag);
	if(result == 1){
%>
		<script>
			alert('삭제가 완료되었습니다.')
			location.href = "bbs.jsp";	
		</script>	
<% }else{ %>
		<script>
			alert('삭제중 문제가 발생하였습니다.')
		</script>	
<% } %>
	

