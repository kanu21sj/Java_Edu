<%@page import="shop.계산기"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 컨트롤 + 쉬프트 + / : 자동주석 -->
    <!-- index로 부터 n1, n2 값을 받아주어야 함 -->
    <!-- n1, n2를 int로 바꾸어 주어야 함 -->
    <!-- 계산기한테 두 개를 더해달라고 해야 함 -->
    <!-- 더한 반환값을 받아와서 클라이언트에 전송(html만든 후, 전송) -->
    <%
    	String n1 = request.getParameter("n1"); 
    	String n2 = request.getParameter("n2"); 
    	int s1 = Integer.parseInt(n1);
    	int s2 = Integer.parseInt(n2);
    	계산기 cal = new 계산기();
    	int result = cal.minus(s1, s2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Result of calculation is <%= result %>
</body>
</html>