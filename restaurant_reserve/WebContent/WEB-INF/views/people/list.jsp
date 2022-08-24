<%@page import="org.comstudy21.myweb.people.model.PeopleDTO"%>
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

<h1>예약 목록</h1>
<hr />

<table>

	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>전화</th>
		<th>완납</th>
		<th>예약상품</th>
		<th>삭제</th>
	</tr>
	
	<%
	List<PeopleDTO> peopleList = (List<PeopleDTO>)request.getAttribute("peopleList");
	for(PeopleDTO person : peopleList) {
	%>
	<tr>
		<th><%=person.getPno() %></th>
		<th><%=person.getName() %></th>
		<th><%=person.getPhone() %></th>
		<th>
		<% if (person.getRpay().equals("T")) { %>
			완납
			<% } else { %>
			미납
			<% } %>
		</th>
		<th><%=person.getRno() %>-<%=person.getRtitle()%>-<%=person.getRprice()%></th>
		<th></th>
		<% } %>
	</tr>

</table>

<a href="add.do">예약 등록 |</a>
<a href="../home.do">HOME</a>


</body>
</html>