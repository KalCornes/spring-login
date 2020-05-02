<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function popup(){
		if("${cook}" == ""){
			window.open("popup","","width=300,height=200,top=500,left=500");
		}
	}
</script>

</head>
<body onload="popup()">
	<c:import url="../default/header.jsp" />
	<c:import url="../default/main.jsp" />
	<c:import url="../default/footer.jsp" />
</body>
</html>