//동적으로 처리하라 기능을 정의하면 됨.

//기능정의 => JS: function(함수), JAVA: 메서드

function add(x, y) { 
	sum = x + y //x = 300, y = 200, sum = 500 
	alert(sum + '원 최종 지불 금액을 더하는 처리함.')
	return sum
}

function minus(z) { //z = 500
	if (z >= 500) {
		z = z - 100
	}
	alert(z + '원 최종 지불 금액을 빼주는 처리함.')
}