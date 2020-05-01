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
	<c:remove var="state" />
	<c:import url="../default/header.jsp" />
	<section>
		<div class="loginMent">
			<H1>로그인 페이지 입니다</H1>
		</div>
		<div class="loginTable">
			<form action="loginChk" method="post">
				<table>
					<tr>
						<td><input type="text" name="id" placeholder="아이디"></td>
						<td rowspan="2"><button onclick="#" class="loginBtn">로그인</button></td>
					</tr>
					<tr>
						<td><input type="text" name="pwd" placeholder="비밀번호"></td>
					</tr>
					<tr>
						<td><a href="membership">회원가입</a></td>
					</tr>
				</table>
			</form>
		</div>
	</section>
	<c:import url="../default/footer.jsp" />
</body>
</html>