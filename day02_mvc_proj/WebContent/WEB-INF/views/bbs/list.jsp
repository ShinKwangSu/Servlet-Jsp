<%@page import="org.comstudy21.myweb.bbs.BoardDTO"%>
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

	<h1>게시글 목록</h1>
	<hr />
	<ul>
	<%
	List<BoardDTO> bbsList = (List<BoardDTO>)request.getAttribute("bbsList");
	for(BoardDTO bbs : bbsList) {
	%>
	<li><%=bbs.getNo() %> | <%=bbs.getTitle() %> | <%=bbs.getPost() %> </li>
	<%
	}
	%>
	</ul>
	<a href="post.do">글 작성</a>

</body>
</html>