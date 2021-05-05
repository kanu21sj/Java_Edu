<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">$
$(function() {
	$('#b1').click(function() {
		datas = $('form').serialize()
		$.ajax({
			url: "computer",
			data: datas,
			success: function(x) {
				$('#d1').html(x)
			}
		}) //b1.ajax
	}) //b1		
	$('#b2').click(function() {
		$.ajax({
			url: "fruits",
			success: function(x) {
				$('#d1').html(x)
			}
		}) //b2.ajax
	}) //b2
}) //start
</script>
</head>
<body>
<form>
	컴퓨터종류: <input id="comtype" name="comtype"><br>
	컴퓨터가격: <input id="comprice" name="comprice"><br>
	마우스종류: <input id="mousetype" name="mousetype"><br>
	마우스가격: <input id="mouseprice" name="mouseprice"><br>
	<input id="b1" type="button" value="확인">
</form>
	<input id="b2" type="button" value="과일 목록을 가지고 와보자.">
<div id="d1"></div>
</body>
</html>