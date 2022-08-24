<%@page import="org.comstudy21.myweb.drink.DrinkDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>음료 목록</h1>
	<hr />
	<ul>
	<%
	List<DrinkDTO> drinkList = (List<DrinkDTO>)request.getAttribute("drinkList");
	for(DrinkDTO drink : drinkList) {
	%>
	<li><%=drink.getNo() %> | <%=drink.getName() %> | <%=drink.getType() %> </li>
	<%
	}
	%>
	</ul>
	<a href="add.do">음료 추가</a>

</body>
</html>