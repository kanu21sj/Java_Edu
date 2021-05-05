<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	 //document.ready(): body부분을 먼저 브라우저가 읽고 와서
	//body안에 있는 요소들을 브라우저가 인식한 후에 설정을 하게 됨.
	$(function() {
		//body부분을 브라우저가 먼저 읽어 와서 실행할 내용을 이름함수에 바로 넣어준다.
		//RAM에 트리구조로 body부분을 만들어서 포함관계를 알 수 있음.
		//부모, 자식간의 관계가 성립
		//Document Object Model(DOM) tree
		alert('body태그 안에 있는 요소들을 모두 읽어서 브라우저가 인식하고 있음')
		//콜백함수
		$('#button1').click(function() {
			//button태그를 클릭했을 때 입력값으로 들어온 함수 부분을 실행해!
			data = $('input').val()
			data2 = $('#data2').val()
			//value 값으로 input에 입력한 값을 가져와!
			alert('입력된 값은 ' + data + data2)
		})
	})
	//태그이름 $('태그이름'), 클래스이름 $('.클래스이름')
	//아이디명 $('#아이디명')
	$(function() {
		$('#button2').click(function() {
			data3 = $('#data3').val()
			alert('내가 갈곳은 ' + data3)
		})
	fun
	})
</script>
</head>
<body>
<input id="data">
<input id="data2">
<button id="button1">뭐할꺼니??</button>
<hr color="red">
<input id="data3">
<button id="button2">어디로 갈꺼니??</button>
<input id="img" type="button" value="roomimg" style='background:pink; font-size:50px;'>
<hr>
</body>
</html>