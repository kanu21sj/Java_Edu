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
		$("#b2").click(function() {
			$.ajax({
				url: "money.jsp",
				data: { //입력값 value 받아줌
					money: $('#money').val(),
					choice: $('#choice').val() 
				},
				success: function(result) {
					alert('연결 성공 ' + result)
					//money.jsp의 result를 받아와서 출력
				}
			})
		})
		$("#b3").click(function() {
			//$.ajax()
		})
		$("#b4").click(function() {
			$.ajax({
				url: "tel.jsp",
				data: {
					tel: $('#tel').val()
				},
				success: function(result) {
					//공백이 없게 해줌 trim
					//공백이 포함될 경우 enter+숫자가 되기 때문에
					num2 = result.trim()
					alert('인증번호 발송 ' + result)
				}
			})
		})
		$("#b5").click(function() {
			num = $('#num').val()
			if (num == num2) {
				alert(num + ", " + num2)
				$('div').html('인증 성공')
			} else {
				alert(num + ", " + num2)
				$('div').html('인증 실패')				
			}
		})
	})
</script>
</head>
<body>
결제금액: <input id="money"><br>
결제수단: 1)계좌이체, 2)신용카드, 3)모바일결제 <input id="choice"><button id="b2">결제하기(money.jsp)</button><br>
<hr color="red">
회원가입할 id입력: <input id="id"><button id="b3">id중복체크(check.jsp)</button><br>
<hr color="red">
인증받을 전화번호 입력: <input id="tel"><button id="b4">인증번호 받기(tel.jsp)</button><br>
인증받은 숫자입력: <input id="num"><button id="b5">인증번호 확인</button>
<hr color="green">
<div id="d1"></div>
</body>
</html>