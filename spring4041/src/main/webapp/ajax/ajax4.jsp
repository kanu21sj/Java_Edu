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
	$('#b1').click(function() {
		$.ajax({
			//다음 연결될 페이지는 movie
			url: "movie",
			data: {
				//입력된 값들을 가져올 변수명
				title : $('#title').val(),
				price :$('#price').val()
			},
			success: function(x) { //변수는 아무거나 상관없음
				$('#result').html(x)
			} 
		}) //ajax
	}) //b1 function
}) //start

</script>
</head>
<body>
	영화제목: <input id="title"><br>
	영화관람료: <input id="price"><br>
	<input id="b1" type="button" value="확인">
	<div id="result"></div>
	<hr color="red">
</body>
</html>