<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원정보 수정 화면입니다.</h2>
      <hr color="red">
      <!-- form태그는 값을 입력하고 싶을 때 사용 -->
      <!-- 입력값들은 모두 form들어가야 한다. -->
      <!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
       <form action="db연결3.jsp">
       	아이디: <input name="id"><br>
       	패스워드: <input name="pw"><br>
       	연락처: <input name="tel"><br>
       <button>서버로 전송</button>
       </form>
</body>
</html>