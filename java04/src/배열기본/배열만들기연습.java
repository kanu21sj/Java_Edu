package 배열기본;

public class 배열만들기연습 {

	public static void main(String[] args) {
		//1. 정수 5개 크기의 배열을 만들어서 10, 20, 30, 40, 50을 순서대로 넣는다.
		//첫번째, 세번째 값을 더해서 프린트
		int[] num = new int [5];
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10; //num[0] 일일히 넣지 않고 변수 1씩 증가할때마다 10씩 커진 값을 넣는 것
		}		
		System.out.println(num[0] + num[2]);
	}

}