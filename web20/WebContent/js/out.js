/**
 * 최종수정날짜: 2021. 02. 23
 * 작성자: 홍길동
 * 수정내용: 함수 추가함.
 */
function site(name) {
	//변수를 선언하지 않아도 됨. var!
	//site = prompt('사이트 명을 입력하세요.')

	if(name == "naver"){
		location.href = "http://www.naver.com"
	}else if(name == "daum"){
		location.href = "http://www.daum.net"
	}else{
		alert('해당 사이트가 없습니다.')
	}
}
function data() {
	s1 = prompt('숫자1입력')
	s2 = prompt('숫자2입력')
	
	n1 = parseInt(s1)
	n2 = parseInt(s2)
	
	alert(n1 + n2)
	
}