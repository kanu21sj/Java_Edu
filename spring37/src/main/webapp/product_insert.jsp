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
<h3>제품을 등록해주세요</h3>
<hr color="red">
<form action = "product_insert.mega">
	id: <input type="text" name="id"><br>
	title: <input type="text" name="title"><br>
	price: <input type="text" name="price"><br>
	company: <input type="text" name="company"><br>
	<input type="submit" value="register">
</form>
</body>
</html>