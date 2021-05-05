<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>첵등록화면입니다.</h2>
       <form action="insert.jsp"> <!-- 값 입력을 위하여 form 태그 사용 -->
       	아이디: <input name="id"><br> <!-- action을 통해 입력값을 받아 처리하는 페이지 지정 -->
       	제목: <input name="title"><br>
       	내용: <input name="story"><br>
       	출판사: <input name="company"><br>
       <button>전송</button>
       </form>
</body>
</html>