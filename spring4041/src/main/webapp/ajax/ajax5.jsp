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
		//여러개 항목들을 넣을 경우 해당 부분을 form으로 묶은 후
		//serialize를 사용하면 편리하게 코딩할 수 있음
		datas = $('form').serialize()
		$.ajax({
			//Controller에 requestMapping과 동일해야함
			url: "com",
			data: datas,
			success: function(x) {
				$('div').html(x)
			}
		})
	})
})
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
	<div></div>
</body>
</html>