<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/out.js" ></script>
<script type="text/javascript">
	//site('naver') // out.js 파일에서 site 함수 불러오기
	//data()
	function cal() {
		//alert('나는 계산기 기능이예요.')
		console.log('나는 계산기 기능이예요...')
	}
</script>
</head>
<body>
<button type="button" onclick="site('naver')">네이버 사이트로 이동해보자.</button>
<button type="button" onclick="site('daum')">다음 사이트로 이동해보자.</button>
<button type="button" onclick="cal()">계산기 기능을 사용해보자.</button>
</body>
</html>