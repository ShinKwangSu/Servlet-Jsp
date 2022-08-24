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

<form action="" method="post">

	<div>
		<label for="name">예약자 성명</label>
		<input type="text" name="name" value="홍길동"/>
	</div>
	
	<div>
		<label for="rno">예약 상품</label>
		<select name="rno">
		<%
		List<ProductDTO> proList = (List<ProductDTO>)request.getAttribute("proList");
		for(ProductDTO pro : proList) {
		%>
			<option value="<%=pro.getRno() %>"><%=pro.toString() %></option>
		<%
		}
		%>
		</select>
	</div>
	
	<div>
		<label for="phone">전화번호</label>
		<input type="text" name="phone" value="010-1234-1234"/>
	</div>
	
	<div>
		<label for="rpay">결제 상태</label>
		<input type="radio" name="rpay" value="F"  checked/> 미납
		<input type="radio" name="rpay" value="T" /> 완납
	</div>
	
	<div>
		<input type="submit" value="예약"/>
	</div>

</form>

</body>
</html>