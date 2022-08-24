<%@page import="org.comstudy21.myweb.util.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
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
// saram테이블에서 name 필드가 'TEST'인 행 삭제하는 jdbc 구현.
Connection conn = JdbcUtil.getConnection();
%>

</body>
</html>