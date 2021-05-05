<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="movielogin.DB전담임"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 입력한 값 서버에서 받아와야 함. -->
<%

//HttpServletRequest request = new HttpServletRequest
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String company = request.getParameter("company");
	String card = request.getParameter("card");
	String cardnum = request.getParameter("cardnum");
	
	//서버에서 받아올 값이 여러개인 경우 다르게 처리해주어야 함.
	//아직 for문이 돌릴게 없음
%>
    <!-- 입력한 값 db처리전담하는 클래스한테 create!하라고 명령  -->
<%
	//자바코드
	DB전담임 db = new DB전담임();
	db.create();
%>
    <!-- 회원가입처리 결과 알려줌. 클라이언트: html -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신의 회원정보를 확인해주세요.</h3>
<hr color="red">
당신이 입력한 아이디: <%= id %> <br>
당신이 입력한 비밀번호: <%= pw %> <br>
당신이 입력한 이름: <%= name %> <br>
당신이 입력한 휴대폰 번호: <%= company %><%= tel %> <br>
당신이 입력한 카드: <%= card %> <br>
당신이 입력한 카드번호: <%= cardnum %> <br>
<button type="button" onclick="location.href='login.html'">로그인 페이지로</button>
</body>
</html>