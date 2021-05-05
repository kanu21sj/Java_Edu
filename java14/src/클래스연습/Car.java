package 클래스연습;

public class Car {
//성질:색
	String color; //아직 색이 어떤건지 모르기 때문에, 나중에 가져다 쓰기 위해서 틀을 만들어 놓음.
	
//동작:달리다, 속도를 높이다.(멤버메서드)
	public void run() {
		System.out.println("자동차가 달리다."); //실행시킬 내용(멤버메서드)를 적음
	}
	public void up() {
		System.out.println("자동차의 속도를 높이다."); //실행시킬 내용(멤버메서드)를 적음
	}
	
}
