package 그래픽;

import java.util.Timer;

public class Timer테스트 {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		Timer작동 time작동 = new Timer작동();
		System.out.println("5초동안 게임을 할 수 있습니다.");
		timer.schedule(time작동, 5000);
		System.out.println("안녕히 가세요.");
	}	

}
