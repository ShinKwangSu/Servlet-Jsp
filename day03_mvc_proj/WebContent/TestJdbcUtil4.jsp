<%@page import="java.sql.PreparedStatement"%>
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
String name = "qwer";
String phone = "010-9999-9999";
String email = "qwer@aaa.com";

Connection conn = JdbcUtil.getConnection();

String sql = "update saram set name = ?, phone = ?, email = ? where name like '%TEST%'";
PreparedStatement pstmt = conn.prepareStatement(sql);

pstmt.setString(1, name);
pstmt.setString(2, phone);
pstmt.setString(3, email);

int cnt_result = pstmt.executeUpdate();
if (cnt_result > 0) {
	System.out.println("수정 성공!");
} else {
	System.out.println("수정 실패!");
}
JdbcUtil.close(conn, pstmt, null);
response.sendRedirect("TestJdbcUtil.jsp");
%>

</body>
</html>