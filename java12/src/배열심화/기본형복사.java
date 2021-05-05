package 배열심화;

public class 기본형복사 {

	public static void main(String[] args) {
		int x = 100;
		int y = x; //기본형 복사
		System.out.println("변경전  x: " + x);
		System.out.println("변경전  y: " + y);
		x = 200; //x = 200으로 변환되고 y는 100 그래도 (코드 순서를 봐야 한다!!)
		System.out.println();
		System.out.println("변경후  x: " + x);
		System.out.println("변경후  y: " + y); //기본형의 경우 x = y, 선언된 당시에만 적용

	}

}
