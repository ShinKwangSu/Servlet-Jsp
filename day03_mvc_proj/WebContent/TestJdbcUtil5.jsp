<%@page import="org.comstudy21.myweb.model.SaramDTO"%>
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
SaramDTO dto = new SaramDTO(1, null, null, null);



response.sendRedirect("TestJdbcUtil.jsp");

%>

</body>
</html>