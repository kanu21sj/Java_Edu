<%@page import="board.BoardDB"%>
<%@page import="board.BoardVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String email = request.getParameter("email");
        String type = request.getParameter("type");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        //1. 가방을 만들어라!
        BoardVO bag = new BoardVO();
        
        //2. 가방에 넣어라! => set메서드 이용!
        bag.setId(id);
        bag.setName(name);
        bag.setTel(tel);
        bag.setEmail(email);
        bag.setTitle(title);
        bag.setContent(content);
        
        //db전담하는 부품에서 db에서 수정할 예정.
        BoardDB db = new BoardDB();
        //db.update(id, pw, tel);
        db.update(bag);
        
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= id %>님의 전화번호가 <%= tel %>, 이메일 주소가 <%= email %>로 <br>
제목이 <%= title %>로, 내용이 <%= content %>로 변경되었습니다. <br>
</body>
</html>