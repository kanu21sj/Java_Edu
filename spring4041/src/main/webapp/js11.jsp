<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
/* 	$(function() {
		$('#button1').click(function() {
			pw1 = $('#pw1').val()
			pw2 = $('#pw2').val()
			div = $('div')
			if (pw1 == pw2) {
				div.html('<h3 style=color:blue;>비밀번호가 일치합니다.</h3>')
			} else {
				div.html('<h3 style=color:red;>비밀번호가 일치하지 않습니다.</h3>')
			}
		})
	}) */
	
	$(function() {
		$('#pw2').keyup(function() { //자동으로 비밀번호 확인해주는 keyup
			pw1 = $('#pw1').val()
			pw2 = $('#pw2').val()
			div = $('#pwchk')
			if (pw1 == pw2) {
				div.html('<h3 style=color:blue;>비밀번호가 일치합니다.</h3>')
			} else {
				div.html('<h3 style=color:red;>비밀번호가 일치하지 않습니다.</h3>')
			}
		})
	})
	
	$(function() {
		$('#add').click(function() {
			reply = $('#reply').val()
			div = $('#reply1')
			//div.append결과 값을 계속 쌓아서 보여줌
			//태그 사용시 String 타입으로 해줘야 함 ''
			div.append('- ' + reply + '<br>')
			//val()안에 ''를 넣어주면 input자리에 입력값이 등록된 후 사라짐
			$('#reply').val('')
		})
		$('#ma').click(function() {
		ma = $('#ma').val()
		div = $('#reply1')
		img = '<img width=100 height=100 src=resources/img/' + ma +'>' 
		div.append('- ' + img + '<br>')
		})
		$('#ma2').click(function() {
		ma2 = $('#ma2').val()
		div = $('#reply1')
		img = '<img width=100 height=100 src=resources/img/' + ma2 +'>' 
		div.append('- ' + img + '<br>')
		})
	})
</script>
</head>
<body>
비밀번호: <input id="pw1"><br>
비밀번호 재확인: <input id="pw2"><br>
<div id="pwchk"></div>
<hr>
댓글: <input id="reply">
<input type="button" value="댓글추가" id="add">
<hr>
<input id="ma" type="button" value="ma.jpg" style='background:yellow; font-size:50px;'>
<input id="ma2" type="button" value="ma2.png" style='background:pink; font-size:50px;'>
<div id="reply1"></div>
<hr color="red" size="5">
</body>
</html>