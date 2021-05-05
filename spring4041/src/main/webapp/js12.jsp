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
		$('#image').click(function() {
			image = $('#image').val()
			div = $('div')
			img = '<img width=100 height=100 src=resources/img/' + image +'>' 
			div.append(img + '<br>')
		})
		$('#reply1').click(function() {
			reply = $('#reply').val()
			div = $('div')
			div.append(reply + '<br>')
			$('#reply').val('')
		})	
		$('#iandr').click(function() {
			reply = $('#reply').val()
			image = $('#image').val()
			img = '<img width=100 height=100 src=resources/img/' + image +'>' 
			div = $('div')
			div.append(img + '<br>')
			div.append(reply + '<br>')
		})	
	})
</script>
</head>
<body>
	<button id="image" type="button" value="ma.jpg">이미지추가</button><br>
	<input id="reply">
	<button id="reply1" type="button">댓글추가</button><br>
	<button id="iandr" type="button" value="ma.jpg">댓글+이미지추가</button>
	<hr color="red" size="3">
	<div></div>
</body>
</html>