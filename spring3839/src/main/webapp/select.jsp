<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<!-- View 부분 -->
<h3>게시글 검색</h3>
<hr color="red">
<form action = "select">
	id: <input type="text" name="id"><br>
	<input type="submit" value="search">
</form>
<a href="select?id=apple">apple회원 검색</a><br>
<a href="select?id=Banana">banana회원 검색</a><br>
<a href="select?id=Choco">Choco회원 검색</a><br>
</body>
</html>