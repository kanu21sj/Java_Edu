package 스레드연습ppt0708;

public class Main4 {
	
	//객체들이 공유하기 위해 static 설정
	public static void main(String[] args) {
		
		//Plus 클래스 호출
		Plus plus = new Plus();
		//plus 메서드 사용
		plus.start();
		
		//Minus 클래스 호출
		Minus minus = new Minus();
		//minus 메서드 사용
		minus.start();
	}
}
