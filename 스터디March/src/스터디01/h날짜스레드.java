package 스터디01;

import java.util.Date;

public class h날짜스레드 extends Thread{ 
	//해당 클래스 Thread 상속받아 사용

	@Override //메서드 재정의
	public void run() {
		for (int i = 0; i < 1000; i++) { //index 값 만큼 for문으로 반복
			Date date = new Date(); //date 클래스 호출
			System.out.println("날짜: " + date); 
			try { //예외처리를 해주어 에러없이 지속될 수 있도록 설정
				Thread.sleep(1000); //밀리세컨즈 1000 = 1초
			} catch (InterruptedException e) {
				//인터럽트(방해, 중단): esc, ctrl+c, power-off
			}
		}
	}

}
