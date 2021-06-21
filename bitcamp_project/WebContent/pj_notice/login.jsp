<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  <link rel="stylesheet" href="css/bootstrap.css"> -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/sandstone/bootstrap.min.css" 
integrity="undefined" crossorigin="anonymous"> -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<meta charset="UTF-8">
<title>로그인화면</title>
</head>
<script>
function send_go1(frm) {
	frm.action = "controller?type=sign";
	frm.submit();
}
function send_go2(frm) {
	frm.action = "controller?type=login";
	frm.submit();
}

</script>
<body>
<%@include file ="navbar.jsp" %>
<form method="post">
	<div  style="position : absolute; top : 30%; left : 40% ; border : solid 1px gray;">
	<table>
	<tr>
		<td colspan="2"><h4>로그인</h4></td>
	</tr>
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" id="id"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="text" name="password" id="password"></td>
	</tr>
	<tr>
		<td colspan="2">
		<div align="center">
		<button class="btn btn-outline-secondary" type="button" onclick="send_go2(this.form);">로그인</button>
		<button class="btn btn-outline-secondary" type="button"  onclick="send_go1(this.form)">회원가입</button>	
		</div>
		</td>
	</tr>
	</table>
	</div>
</form>	
</body>
</html>