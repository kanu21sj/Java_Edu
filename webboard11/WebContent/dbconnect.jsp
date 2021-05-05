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
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        //1. 가방을 만들어라!
        BoardVO bag = new BoardVO();
      
        //2. 가방에 넣어라! => set메서드이용!
        bag.setId(id);
        bag.setName(name);
        bag.setTel(tel);
        bag.setEmail(email);
        bag.setTitle(title);
        bag.setContent(content);
        
        //db전담하는 부품에서 db에 넣어달라고 할 예정.
        BoardDB db = new BoardDB();
        db.create(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시글 등록이 완료되었습니다.
</body>
</html>