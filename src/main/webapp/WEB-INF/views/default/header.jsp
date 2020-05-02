<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="resources/css/quiz.css" rel="stylesheet">
<script src="resources/js/boardjs.js"></script>
</head>
<body>
  <header>
    <font class="title" face="Gabriola">CARE LAB</font>
  </header>
  <hr>
  <Nav>
    <a href="index">HOME</a> 
    <c:choose>
    <c:when test="${empty state}">
    <a href="login">회원정보</a>
    <a href="login">로그인</a>
    </c:when>
    <c:otherwise>
    <a href="memberList">회원정보</a>
    <a href="javascript:logout()">로그아웃</a>
    </c:otherwise>  
    </c:choose>
  </Nav>
  <hr>
</body>
</html>