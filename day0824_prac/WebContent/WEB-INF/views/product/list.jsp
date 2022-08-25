<%@page import="org.sks.myweb.product.ProductDTO"%>
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

	<h1>중고차 매물 목록</h1>

	<table border="1" width="100%">

		<tr>
			<th>번호</th>
			<th>차종</th>
			<th>제조사</th>
			<th>가격</th>
			<th>수량</th>
			<th>장바구니</th>
		</tr>

		<%
		List<ProductDTO> productList = (List<ProductDTO>) request.getAttribute("productList");
		for (ProductDTO product : productList) {
		%>

		<tr>
			<td><%=product.getPno()%></td>
			<td><%=product.getPname()%></td>
			<td><%=product.getCompany()%></td>
			<td><%=product.getPrice()%></td>
			<td><%=product.getEa()%></td>
			<td><a href="cart_list.do?cmd?add&pno=<%=product.getPno()%>&ea=<%=product.getEa()%>">장바구니 담기</a></td>
		</tr>
		<%
		}
		%>

	</table>

</body>
</html>