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
			//Controller에 requestMapping과 동일해야함
			url: "fruit",
			success: function(x) {
				$('#result').html(x)
			}
		})
	})
	$('#b2').click(function() {
		$.ajax({
			//Controller에 requestMapping과 동일해야함
			url: "tour",
			success: function(x) {
				$('#result').html(x)
			}
		})
	})
})
</script>
</head>
<body>
<form>
	<input id="b1" type="button" value="과일 목록을 가지고 와보자.">
	<input id="b2" type="button" value="여행 목록을 가지고 와보자.">
</form>
	<div id="result"></div>
</body>
</html>