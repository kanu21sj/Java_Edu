package interface01;

public class CookManager2 {
	//CookManager보다 더 좋은 코드
	
	ICook cook;
	//ICook의 메서드를 사용하기 위한 변수 선언
	
	public CookManager2(ICook cook) {
		//참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용(instanceof)
		//객체 + instanceof + 클래스
		if (cook instanceof KoreanCook) {
			this.cook = (KoreanCook)cook;
		}else {
			this.cook = (ChineseCook)cook;
		}
	}
	
	public void setCook(ICook cook) {
		this.cook = cook;
	}
	
	public void orderRice() {
		System.out.println("Taking an order.");
		cook.makeRice();
	}
	
	public void orderSoup() {
		System.out.println("Taking an order.");
		cook.makeSoup();
	}
}
