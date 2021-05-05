package interface01;

public class CookTest {

	public CookTest() {
		//CookTest 메서드 사용
		CookManager cm = new CookManager(new ChineseCook());
		//CookManager가 ChineseCook 메서드를 사용(의존)
		cm.orderRice();
		cm.orderSoup();
		
		System.out.println("===========================");
		
		cm.setCook(new KoreanCook());
		cm.orderRice();
		cm.orderSoup();
	}
	
	public static void main(String[] args) {
		new CookTest();
		//CookTest 객체 생성하여 사용
	}
}
