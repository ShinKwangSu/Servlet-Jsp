<%@page import="org.comstudy21.myweb.shop.ShopDTO"%>
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

<h1>상품 목록</h1>
<hr />
<ul>
<%
List<ShopDTO> shopList = (List<ShopDTO>)request.getAttribute("shopList");
for(ShopDTO shop : shopList) {
%>
<li><%=shop.getNo() %> | <%=shop.getName() %> | <%=shop.getDate() %> </li>
<%
}
%>
</ul>
<a href="regist.do">상품 등록</a>

</body>
</html>