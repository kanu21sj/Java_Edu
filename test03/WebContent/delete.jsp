<%@page import="pack03.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //입력해서 전송된 데이터 값을 받음
    String id = request.getParameter("id");
        
  	//데이터베이스 전담하는 BookDAO부품에서  
    BookDAO db = new BookDAO();
  	////데이터베이스에서 삭제해달라고 요청
    db.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
책 정보 삭제가 완료되었습니다.
</body>
</html>