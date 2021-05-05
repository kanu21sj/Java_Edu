package 상속문제연습ppt0708;

public class aCar extends Object { //aCar수퍼클래스 Object로 부터 상속
	 
	String color; //aCar클래스(부모)의 멤버변수 생성
	int people; //aCar클래스(부모)의 멤버변수 생성
	
	public void start() { //start 멤버메서드 생성
		System.out.println("달리다");
	}
	public void stop() { //stop 멤버메서드 생성
		System.out.println("멈추다");
	}
}
