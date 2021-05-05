package 상속문제연습ppt0708;

public class aSedan extends aCar{ //Car 부모클래스로 부터 상속받음

	int speed; //Sedan멤버변수 생성
	
	public void velocity() { //Sedan의 멤버메서드 생성
		System.out.println("빠르게 달리다");
	}

	@Override //toString으로 재정의
	public String toString() {
		return "[세단의 속력은 " + speed + ", 색상은 " + color + ", 합승 가능인원은 " + people + "명 입니다.]";
	}



}
