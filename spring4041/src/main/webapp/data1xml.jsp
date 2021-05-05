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
				//데이터 위치한 url 적기
				url: "resources/data/dataset.xml",
				success: function(xml) {
					alert('xml연결 성공.!!!') //연결여부 확인
					list = $(xml).find('record') //dataset.xml record 가져오기
 					console.log('레코드의 개수=> ' + list.length)
					
/*					//ajax 함수를 사용할 땐 $ 붙여줘야 함
					console.log($(list[i]).find('first_name').text())
					console.log($(list[i]).find('gender').text())
					console.log($(list[i]).find('phone').text())
					
					//for문 이용해서 전체 100개 프린트!
					for (var i = 0; i < list.length; i++) {
						console.log($(list[i]).find('last_name').text())
						console.log($(list[i]).find('first_name').text())
						console.log($(list[i]).find('gender').text())
						console.log($(list[i]).find('phone').text())
					} */
					$(list).each(function(index, data) {
						console.log(index + ": " + $(data).find('phone').text())
					})
				} //success
			}) //ajax
		}) //b1
	}) //$fun

</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
</body>
</html>