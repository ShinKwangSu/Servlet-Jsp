<%@page import="org.comstudy21.myweb.color.ColorDTO"%>
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

	<h1>색상 목록</h1>
	<hr />
	<ul>
	<%
	List<ColorDTO> colorList = (List<ColorDTO>)request.getAttribute("colorList");
	for(ColorDTO color : colorList) {
	%>
	<li><%=color.getNo() %> | <%=color.getName() %> | <%=color.getType() %> </li>
	<%
	}
	%>
	</ul>
	<a href="add.do">색상 추가</a>
	

</body>
</html>