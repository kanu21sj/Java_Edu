<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function web() {
	site = document.getElementById('site').value
	location.href = 'http://www.' + site
}

function pay() {
	com = document.getElementById('com').value 
	money = parseInt(document.getElementById('money').value)
	choice = document.getElementById('choice').value 
	
	if (choice == 1) {
		choice = '계좌이체'
		money
	}
	else if (choice == 2) {
		choice = '신용카드'
		money = money + 1000
	}
	else if (choice == 3) {
		choice = '휴대폰결제'
		money = money + 500
	}
	result = document.getElementById('result')
	result.innerHTML = com + '에서 ' + money + '원 ' + choice + '로 구매하셨습니다.'
}
</script>
</head>
<body>
<input type="text" id="site">
<button onclick="web()">해당 사이트로 이동</button><br><br>
구매상점: <input type="text" id="com" value=""><br>
결제금액: <input type="text" id="money" value=""><br>
결제수단: <input type="text" id="choice" value=""><br>
<button onclick="pay()">결제금액 확인</button><br><br>
<div id="result" style="background:yellow; width:1000px; height:500px; font-size:50px;"></div>
</body>
</html>