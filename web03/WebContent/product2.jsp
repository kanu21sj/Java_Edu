<%@page import="shop.회원DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 1. 입력한 값 서버에서 받아와야 함. -->
<%
	String id = request.getParameter("id"); 	
	String name = request.getParameter("name"); 	
	String tel = request.getParameter("tel"); 	
	String email = request.getParameter("email");
	String type = request.getParameter("type"); 	
	String title = request.getParameter("title"); 	
	String content = request.getParameter("content");
	
%>
<!-- 2. 입력한 값 db처리 전담하는 클래스한테 create! 하라고 명령해야 함. -->
<%
	회원DB db = new 회원DB();
	db.create();
%>
<!-- 3. 회원가입처리 결과 알려줌. 클라이언트: html -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신이 입력한 정보를 확인해주세요.</h3>
<hr color="red">
당신이 입력한 id: <%= id %> <br>
당신이 입력한 name: <%= name %> <br>
당신이 입력한 tel: <%= tel %> <br>
당신이 입력한 email: <%= email %> <br>
당신이 입력한 type: <%= type %> <br>
당신이 입력한 title: <%= title %> <br>
당신이 입력한 content: <%= content %> <br>
</body>
</html>