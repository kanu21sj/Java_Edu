<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function plus() {
	
	num1 = document.getElementById('x').value
	num2 = document.getElementById('y').value
	//결과를 result1 변수에 넣기
	result1 = document.getElementById('result1')
	//num1, num2 int 타입으로 변형하기 위한 parseInt 함수 사용
	result1.innerHTML = parseInt(num1) + parseInt(num2)
	//브라우저에 sum값 표출

}
function img() {
	img = document.getElementById('pic').value
	//img 변수에 이미지 resources/img에 저장된 이미지를 불러옴
	result2 = document.getElementById('result2')
	result2.innerHTML = '<img src = "resources/img/' + img + '.jpg">'
	//브라우저에 img1값 표출
}
</script>
</head>
<body>
Num1: <input type="text" id="x"><br>
Num2: <input type="text" id="y"><br>
<button onclick="plus()">더하기 구하기</button><br><br>
<div id="result1" style="background:yellow; width:500px; height:200px; font-size:50px;"></div>
<hr>

Image: <input id="pic"><br>
<button onclick="img()">이미지 나타내기</button><br><br>
<div id="result2" style="background:yellow; width:500px; height:200px; font-size:50px;"></div>
</body>
</html>