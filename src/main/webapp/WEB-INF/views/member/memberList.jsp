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
		<div class="memberlistSection">
			<h1>회 원 정 보</h1>
			<table border="2">
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
				</tr>
				<c:forEach var="st" items="${member }">
					<tr>
						<td><a href="memberInfo?id=${st.id}&pwd=${st.pwd}">${st.id }</a></td>
						<td>${st.pwd }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</section>
	<c:import url="../default/footer.jsp" />
</body>
</html>