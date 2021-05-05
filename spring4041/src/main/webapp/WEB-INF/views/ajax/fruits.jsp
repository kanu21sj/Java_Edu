<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 태그를 사용할 수 있도록 설정 -->
<!-- jstl: java standard tag library: 자바 문법을 jsp에서 태그로 쓸 수 있는 문법 -->
<!-- prefix=c(core) 자바의 주요 문법들만 사용할 수 있음 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- fmt(포맷팅 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 자바, forEach, 변수 = x, 아이템 = 가져올 데이터 목록 -->
<c:forEach var="x" items="${fruits}">
- ${x}<br>
</c:forEach>	
<fmt:formatNumber value="1234.1234545665" pattern="#.##"/>