<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String login = (String) request.getSession().getAttribute("login");
	%>


	<h1>메인 홈</h1>
	
	<p>${login}님 환영합니다.</p>
	<ul>
	<%
		if(login == null){
	%>
		<li><a href="member/login.do">로그인</a></li>
		<li><a href="member/register.do">회원가입</a></li>
	<%}else{ %>
		<li><a href="member/logout.do">로그아웃</a></li>
	<%} %>
		<li><a href="product/list.do">중고차 보기</a></li>
	</ul>

	<%
		if (login == null)
	%>

</body>
</html>