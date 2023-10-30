<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include> <!-- 액션태그 -->
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<% if(session.getAttribute("id") != null ) { %>
			<hr color="blue">
			<span class="alert alert-success"> 
				<%=session.getAttribute("id")%>님 환영합니다.
			</span>
			<hr color="red">
			<br><br>
		<% } %>
		<hr color="blue">
			<form action="insert2.jsp">
				<table border="1"  class="table table-hover">
					<tr  class="table-warning">
						<td width="200">제목</td>
						<td width="300"><input name="title"></td>
					</tr>
					<tr  class="table-warning">
						<td width="200">내용</td>
						<td width="300"><input name="content"></td>
					</tr>
					<tr  class="table-warning">
						<td width="200">작성자</td>
						<td width="300">
						<!-- type="hidden"이면 input이 안보임. 값은 전달됨 -->
						<input 	name="writer" style="height: 100px;" 
								value="<%=session.getAttribute("id")%>" >
								<!-- <input name="writer" value="apple"> -->
						</td>
					</tr>
					<tr  class="table-warning">
						<td colspan="2">
							<button type="submit" class="btn btn-danger">글쓰기 완료</button>
						</td>
					</tr>
				</table>
			</form>
	</div>
</div>	
</body>
</html>