package interface01;

public class CookManager {

	ICook cook; //Interface를 매개변수로 사용할 수 있음
	//ICook 인터페이스의 기능을 사용하기 위한 cook 변수 선언
	//ChineseCook, KoreanCook 두가지 클래스의 기능을 사용하기 위함
	
	public CookManager(ICook cook) {
		//인터페이스(ICook)를 구현한 클래스만 접근 가능
		//void가 아닌 이유, CookTest에서 CookManager 객체 생성시
		//ChineseCook, KoreanCook 메서드를 매개변수로 사용하기 때문
		setCook(cook);
	}
	
	//setIcook 메서드에서 ICook 인터페이스 기능 사용을 위한 cook 매개변수 선언
	public void setCook(ICook cook) {
		this.cook = cook;
	}
	public void orderRice() {
		System.out.println("Taking an order for a rice.");
		cook.makeRice();
	}
	
	public void orderSoup() {
		System.out.println("Taking an order for a soup.");
		cook.makeSoup();
	}
}
