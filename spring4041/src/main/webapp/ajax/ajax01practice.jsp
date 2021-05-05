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
			alert("내가 클릭되어요")
			$.ajax({
				url: "test.jsp",
				success: function(result) {
					alert('페이지 연결 성공')
					alert(result)
				},
				error: function() {
					alert('페이지 연결 실패')
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">ajax 테스트</button>
</body>
</html>