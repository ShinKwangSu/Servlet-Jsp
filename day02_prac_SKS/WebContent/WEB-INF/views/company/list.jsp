<%@page import="org.comstudy21.myweb.company.CompanyDTO"%>
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

	<h1>기업 목록</h1>
	<hr />
	<ul>
	<%
	List<CompanyDTO> companyList = (List<CompanyDTO>)request.getAttribute("companyList");
	for(CompanyDTO company : companyList) {
	%>
	<li><%=company.getNo() %> | <%=company.getName() %> | <%=company.getNation() %> </li>
	<%
	}
	%>
	</ul>
	<a href="add.do">기업 추가</a>

</body>
</html>