package 클래스연습;

public class 자동차를만들어사용해보자 {

	public static void main(String[] args) {
		Car c1 = new Car();
		//Car에 있었던 멤버변수 color가 별도로 복사됨.
		c1.color = "빨간색"; //c1.color c1의 주소로 접근하는 연산자 (.)
						
		Car c2 = new Car();
		c2.color = "파란색";
		
		//c1, c2는 참조형 변수로 주소가 들어있음.
		//주소가 들어있는 변수가 있으면 메서드를 사용할 수 있다.
		c1.run();
		c2.up();

	}

}
