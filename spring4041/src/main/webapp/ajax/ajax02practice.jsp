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
	$("#b1").click(function() {
		$.ajax({
			url: "money.jsp",
			data: {
				money: $('#money').val(),
				choice: $('#choice').val()
			},
			success: function(result) {
				alert(result)
			}
		})
	})
	$("#b2").click(function() {
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
	$("#b3").click(function() {
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
	<hr color="blue">
	결제금액:
	<input id="money"><br>
	결제수단: 1)계좌이체 2)신용카드 3)휴대폰결제<input id="choice"><button id="b1">결제하기</button><br>
	<hr color="red">
	인증받을 전화번호: <input id="tel"><button id="b2">인증번호받기</button><br>
	인증번호 입력:	<input id="num"><button id="b3">인증번호확인</button>
	<hr color="red">
	<div id="d1"></div>
</body>
</html>