package interface01;

public class ChineseCook implements ICook{
	// 인터페이스의 구현
	// 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.

	public ChineseCook() {
		System.out.println("Chinese chef is ready.");
	}
	
	@Override
	public void makeRice() {
		System.out.println("Making chinese style rice.");
		
	}

	@Override
	public void makeSoup() {
		System.out.println("Making chinese style soup.");
		
	}

	@Override
	public void makeSalad() {
		System.out.println("Making chinese style salad.");
		
	}

	@Override
	public void makeSource() {
		System.out.println("Making chinese style source.");
		
	}

}
