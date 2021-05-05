<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
/* 	$(function() { //$: jquery 동작함수
		$('button').click(function() {
			dataTag = $('#data') //#data = document.getElementById('data')와 동일함
			dataValue = dataTag.val()
			alert(dataValue)
		})
	}) */
	
	//버튼을 클릭했을 때
	//data에 들어있는 value를 가지고 와서 출력
	$(function() {
		$('#button1').click(function() {
			data = $('#data').val()
			alert(data)
		})
	})
	$(function() {
		$('#button2').click(function() {
			data2 = $('#data2').val()
			alert(data2)
		})
	})
	$(function() {
		$('#button3').click(function() {
			idchk = $('#idchk').val()
			if (idchk.length >= 8) {
				alert('사용할 수 있는 id 입니다.')
			}else {
				alert('id는 8자 이상이어야 합니다.')
			}
		})
	})
	$(function() {
		$('#button4').click(function() {
			pw1 = $('#pw1').val()
			reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/
			
			if (false == reg.test(pw1)) {
				alert('비밀번호는 8자 이상이어야 하며, 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.')
			} else {
				alert('비밀번호가 설정되었습니다.')
			}
		})
	})
	$(function() {
		$('#button5').click(function() {
			pw1 = $('#pw1').val()
			pw2 = $('#pw2').val()
			
			if (pw1 == pw2) {
				alert('비밀번호 재확인 완료.')
			} else {
				alert('비밀번호가 일치하지 않습니다.')
			}
		})
	})
</script>
</head>
<body>
<input id="data" value="밥먹으러 가자.!!!">
<button id="button1">뭐할꺼니??</button>
<hr>
<input id="data2" value="">
<button id="button2">끝나고 어디 갈까??</button>
<hr>
<input id="idchk" value="">
<button id="button3">아이디 길이 체크</button>
<hr>
<input id="pw1" value="">
<button id="button4">패스워드 확인</button>
<hr>
<input id="pw2" value="">
<button id="button5">패스워드 확인</button>
</body>
</html>