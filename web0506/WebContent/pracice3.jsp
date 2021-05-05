<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시글 수정 화면입니다.</h2>
      <hr color="red">
       <form action="dbpractice3.jsp">
       	아이디: <input name="id"><br>
       	제목: <input name="title" style="width:300px;"><br>
       	내용: <input name="content" style="width:300px; height:300px"><br>
       <button>서버로 전송</button>
       </form>
</body>
</html>