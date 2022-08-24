<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/common.css" />
</head>
<body>

<h1>길동이네 식당 예약 프로그램</h1>
<hr />
<ul>
<%
Map items = (Map)request.getAttribute("items");
Set keys = items.keySet();
Iterator iterator = keys.iterator();
while(iterator.hasNext()) {
	String key = (String)iterator.next();
%>
<!-- HTML 코드 -->
<li><a href="<%=items.get(key) %>"><%=key %></a></li>
<%
}
%>
</ul>

</body>
</html>