<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		//1. b1 클릭했을 때,
		$('#b1').click(function() {
			
			//2. tel에 입력한 값을 가지고 와야함.
			telVal = $('#tel').val()
			
			//3. MVC2에서는 Controller에서 넘긴 값을 받아서 다음 처리를 진행하게 함.
			$.ajax({
			
				//4. ajax의 url은 컨트롤러의 requestMapping과 동일해야함.
				url: "text",
				data: {
					tel : telVal //tel = telVal
				},
				success: function(x) { //변수는 아무거나 상관없음
					$('#result').html('<h3>' + x + '</h3>')
				}
					
			}) //ajax
			
		}) //b1
		
		$('#b2').click(function() {
			//num2의 값과 num기 같은지 비교
			numVal = $('#num').val() //input일때만 값이 value
			num2Val = $('#result').text() //tag사이의 값은 text
			if (numVal == num2Val) {
				alert('본인인증 성공!!!')
			} else {
				alert('본인인증 실패!!!')
			}
		})
	}) //start
</script>
</head>
<body>
	인증받을 전화번호: <input id="tel"><input id="b1" type="button" value="인증번호 받기"><br>
	인증번호 확인: <input id="num"><input id="b2" type="button" value="인증번호 확인"><br>
	<hr color="red">
	<div id="result"></div>
</body>
</html>