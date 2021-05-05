<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 태그를 사용할 수 있도록 설정 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 자바, forEach, 변수 = x, 아이템 = 가져올 데이터 목록 -->
<c:forEach var="x" items="${tour}">
- ${x}<br>
</c:forEach>	