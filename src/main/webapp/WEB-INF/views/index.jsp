<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h2>Hello Springframework</h2>
	<a href="/board/save">글작성</a>
	<a href="/board/">글목록</a>
	<a href="/board/paging">페이징목록</a>
</body>
</html>
