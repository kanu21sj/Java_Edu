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
			url: "resources/data/dataset.xml",
			success: function(xml) {
				alert("연결 성공!!")
				list = $(xml).find('record')
				console.log("레코드의 개수 " + list.length)
				
				$(list).each(function(index, data) {
				
				email = $(data).find('email').text()
				gender = $(data).find('gender').text()				
				phone = $(data).find('phone').text()
				
					console.log(index + " : " + email + gender + phone)
				})
			}
		})
	})
	$('#b2').click(function() {
		$.ajax({
			url: "resources/data/MOCK_DATA.json",
			success: function(json) {
				alert("연결 성공!! " + "레코드의 개수 " + json.length)
				
				$(json).each(function(index, person) {
					
	                id = person.id
	                first_name = person.first_name
	                last_name = person.last_name
	                email = person.email
	                gender = person.gender
	                phone = person.phone
	                  
					console.log(id, first_name, last_name, email, gender, phone)
					$.ajax({
						url: "insertperson1",
						async: false, //데이터 순서대로 정렬
						data: {
	                        ID : id,
	                        FIRST_NAME : first_name,
	                        LAST_NAME : last_name,
	                        EMAIL : email,
	                        GENDER : gender,
	                        PHONE : phone
	                     }, 
	                     success: function(result) {
	                        console.log(result)
						},
					})
				})
			}
		})
	})	
})
</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
</body>
</html>