package 상속문제연습ppt0708;

public class aTruck extends aCar { //Car부모 클래스로부터 상속받음

	int weight; //멤버변수 생성
	
	public void load() { //멤버메서드 생성
		System.out.println("짐을 싣다.");
	}

	@Override //toString으로 재정의
	public String toString() {
		return "[트럭의 무게는 " + weight + ", 색상은 " + color + ", 합승 가는인원은 " + people + "명 입니다.]";
	}


	
}
