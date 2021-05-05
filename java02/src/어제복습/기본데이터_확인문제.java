package 어제복습;

public class 기본데이터_확인문제 {

	public static void main(String[] args) {
		
		int a = 66;
		int b = 77;
		int c = 88;
		int d = 99;
		
		int sum = a + b + c + d;
		//int avg = sum / 4;
		//자바는 int와 int 계산은 결과가 항상 int!
	
		System.out.println("합계는 " + sum + "점");
		//System.out.println("평균은 " + avg);
		//자바는 하나라도 double 이면 무조건 항상  double!
		
		double avg = (double)sum / 4;
		System.out.println("평균은" + avg + "점");

		//데이터 타입을 내가 원하는 타입으로 변경해주는 것을 캐스팅!!
		//ram에는 원래 타입이 그대로 있고,
		//cpu가 ram에 들어있던 데이터를 가져다가 강제 캐스팅함.
		//(변경하고자하는 타입명) 변수 => (double)sum
		
		final double PI = 3.14; //변경 불가능한 값 final(상수) => 변수명 가독성을 위해 대문자로 씀 (pi -> PI)
		double r = 2.2;
		double mul = PI * r * r;
		System.out.println("원의 면적은" + mul);

	}

}
