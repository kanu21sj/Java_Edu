package interface01;

public class KoreanCook implements ICook{
	// 인터페이스의 구현
	// 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.

	public KoreanCook() {
		System.out.println("Korean chef is ready.");
	}
	
	@Override
	public void makeRice() {
		System.out.println("Making korean style rice.");
		
	}

	@Override
	public void makeSoup() {
		System.out.println("Making korean style soup.");
		
	}

	@Override
	public void makeSalad() {
		System.out.println("Making korean style salad.");
		
	}

	@Override
	public void makeSource() {
		System.out.println("Making korean style source.");
		
	}

}
