<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../default/header.jsp" />
	<section>
		<div class="infoSection">
			<h1>${id }님의정보</h1>
			<table border="2">
				<tr>
					<th>아이디</th>
					<th>${id }</th>
				</tr>
				<tr>
					<th>비밀번호</th>
					<th>${pwd }</th>
				</tr>
			</table>
		</div>
	</section>
	<c:import url="../default/footer.jsp" />
</body>
</html>