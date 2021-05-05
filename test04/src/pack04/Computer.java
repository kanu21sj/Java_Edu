package pack04; //pack04 패키지명

public class Computer { //Computer 클래스
	
	int price; //int 타입 price 멤버변수 설정
	String color; //String 타입 color 멤버변수 설정
	String company; //String 타입 company 멤버변수 설정
	
	public Computer(int price, String color, String company) {
		this.price = price;
		this.color = color;
		this.company = company;
		//멤버변수 초기화할 수 있는 파라메터 생성자 정의
	}
	
	public void on() { //on멤버 메서드 설정
		System.out.println("컴퓨터가 켜지다.");
	}
	public void off() { //off멤버 메서드 설정
		System.out.println("컴퓨터가 꺼지다.");
	}
	@Override //toString 타입으로 재정의하여 멤버변수값 출력될 수 있도록 설정
	public String toString() {
		return "Computer [price=" + price + ", color=" + color + ", company=" + company + "]";
	}
	
}
