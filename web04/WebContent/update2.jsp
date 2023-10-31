<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
<jsp:useBean id="dao" class="bean.BbsDAO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	int result = dao.update(bag);
	if(result == 1){
%>
	<script>
		alert('수정이 완료되었습니다.')
		location.href = "bbs.jsp";	
	</script>	
<% }else{ %>
	<script>
		alert('글을 수정하는중 문제가 발생하였습니다.')
	</script>	
<% } %>