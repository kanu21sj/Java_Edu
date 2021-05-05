<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- webapp안 다른폴더에서 jsp 파일을 설정할때는 (../)상위폴더에서 불러줘야 함 -->
<script type="text/javascript" src="../resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				<!-- webapp안 다른폴더에서 jsp 파일을 설정할때는 (../)상위폴더에서 불러줘야 함 -->
				url: "../resources/data/dataset(1).xml",
				success: function(xml) {
					alert("xml연결 성공.!!!")
					list = $(xml).find('record')
					console.log('레코드의 개수=> ' + list.length)
					
					//index, record 변수에 해당하는 값을 넣어주어야 함
					$(list).each(function(index, record) {
						console.log($(record).find('keynum').text() + ": " + $(record).find('pname').text())
						console.log($(record).find('keynum').text() + ": " + $(record).find('cname').text())
						console.log($(record).find('keynum').text() + ": " + $(record).find('fname').text())
						console.log($(record).find('keynum').text() + ": " + $(record).find('lname').text())
						console.log($(record).find('keynum').text() + ": " + $(record).find('phone').text())
					})
				} //success
			}) //ajax
		}) //b1
		$('#b2').click(function() {
			$.ajax({
				url: "../resources/data/MOCK_DATA(1).json", 
				success: function(json) {
					alert('데이터 개수 : ' + json.length + '개')
					alert(json[0].pname)
					
					//foreach
					$(json).each(function(index, product) {//파라메터 이름은 마음대로 가능
						
						//product.value 파라메터(product)내 있는 값(value) 
						//쉽게 쓰기 위하여 변수명을 새롭게 설정
						keynum = product.keynum
						pname = product.pname
						cname = product.cname
						fname = product.fname
						lname = product.lname
						phone = product.phone
						
						console.log(keynum, pname, cname, fname, lname, phone)
					})
					console.log("------------------------------------------------------------------------------------------------")
					//for문
					//json.length 개수만큼 가지고 있는(json[i]) 값(.value명) 가져옴
					for (var i = 0; i < json.length; i++) {
						console.log(json[i].keynum, json[i].pname, json[i].cname, json[i].fname, json[i].lname, json[i].phone)
					}
				}
			}) //ajax
		}) //b2
	}) //$fun
</script>
</head>
<body>
<button id="b1">XML문서 받아오기</button>
<button id="b2">JSON문서 받아오기</button>
</body>
</html>