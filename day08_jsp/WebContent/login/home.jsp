<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>home</h1>

	<%
	String userId = (String) session.getAttribute("id");
	String userName = (String) session.getAttribute("name");
	
	String userId_app = (String) application.getAttribute("appId");
	String userName_app = (String) application.getAttribute("appName");
	%>

	User Id : <%=userId%><br />
	User Name : <%=userName%>
	<hr />
	User Id(application) : <%=userId_app%><br />
	User Name(application) : <%=userName_app%>
	
	<br />
	<a href="login.html">로그인</a>
	<a href="logout.jsp">로그아웃</a>
	
</body>
</html>