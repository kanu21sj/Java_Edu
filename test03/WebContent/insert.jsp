<%@page import="pack03.BookDAO"%>
<%@page import="pack03.BookVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <% //java 명령문 사용
    	//입력해서 전송된 데이터 받아오는 메서드 사용
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String story = request.getParameter("story");
        String company = request.getParameter("company");
        
        //가방 만들기
        BookVO bag = new BookVO();
      
        //Set메서드 사용하여 가방에 넣기 
        bag.setId(id);
        bag.setTitle(title);
        bag.setStory(story);
        bag.setCompany(company);
        
        //데이터베이스 전담하는 BookDAO부품에서  
        BookDAO db = new BookDAO();
        //데이터베이스로 넣어달라고 요청
        db.create(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
책 등록이 완료되었습니다.
</body>
</html>