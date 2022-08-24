<%@page import="org.comstudy21.myweb.product.model.ProductDTO"%>
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

	<h1>메뉴 관리</h1>
	<hr />
	
	<table>
	
		<tr>
			<th>번호</th>
			<th>예약 상품</th>
			<th>가격</th>
			<th>삭제</th>
		</tr>
		
		<%
		List<ProductDTO> proList = (List<ProductDTO>)request.getAttribute("proList");
		for(ProductDTO pro : proList) {
		%>
		
		<tr>
			<th><%=pro.getRno() %></th>
			<th><%=pro.getRtitle() %></th>
			<th><%=pro.getRprice() %></th>
			<th></th>
		</tr>
		<% } %>
	
	</table>
	
	<a href="add.do">메뉴 등록</a>

</body>
</html>