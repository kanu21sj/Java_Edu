package interface01;

public class CookMain {

	public static void main(String[] args) {
		
		CookManager2 m = new CookManager2(new ChineseCook());
		
		m.orderRice();
		m.orderSoup();
		
		System.out.println("================================");
		
		m.setCook(new KoreanCook());
		m.orderRice();
		m.orderSoup();
	}

}
