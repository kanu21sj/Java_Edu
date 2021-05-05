<%@page import="shop.memberDB2"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        //db전담하는 부품에서 db에서 수정해달라고 할 예정.
        memberDB2 db = new memberDB2();
        db.update(id, title, content);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시글 수정이 완료되었습니다.
</body>
</html>