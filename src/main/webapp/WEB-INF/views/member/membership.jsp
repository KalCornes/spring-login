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
		<div class="membershipSection">
			<h1>회 원 등 록</h1>
			<form action="saveMember" method="post">
				<input type="text" name="id" placeholder="아이디"> <br> <input
					type="text" name="pwd" placeholder="비밀번호">
				<hr>
				<input type="submit" value="회원가입">
			</form>

		</div>
	</section>
	<c:import url="../default/footer.jsp" />
</body>
</html>