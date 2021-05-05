package java25복습;

public class Phone {
	
	String color;
	int size;
	//멤버변수, 전역변수(자동초기화)
	
	public Phone(String color, int size) {
		//this: 해당 클래스를 의미
		//this.color: 해당 클래스 밑에 바로 선언된 color라는 의미
		//this로 전역변수를 지정할 수 있다.
		//변수명이 전역/지역이 동일할 때 전역변수를 지정할 목적으로 사용 
		this.color = color;
		this.size = size;
		
	}
	public void internet() { //멤버메서드
		System.out.println("인터넷하다.");
	}
	public void text() { //멤버메서드
		System.out.println("문자하다.");
	}
	
	@Override //재정의, 오버라이드
	public String toString() {
		return "Phone [color=" + color + ", size=" + size + "]";
	}
	
}
