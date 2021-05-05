package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자: + - * / %
		// 한줄 복사 : 컨트롤 + 알트 + 화살표 아래
		// 한줄 이동 : 알트 + 화살표 방향 
		// 이전꺼 취소: 컨트롤 + z
		// 한줄 삭제 : 컨트롤 + d
		int x = 200;
		int y = 100;
		
		//연산: cpu가 하는 간단한 처리
		//연산자(기호): 간단한 처리는 코딩상에 기호로 표시
		
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
		int minus = x - y;
		System.out.println(x + " - " + y + " = " + minus);
		int mul = x * y;
		System.out.println(x + " * " + y + " = " + mul);
		int odd = x % y;
		System.out.println(x + " % " + y + " = " + odd);
		int div = x / y;
		System.out.println(x + " / " + y + " = " + div);
		

	}

}
