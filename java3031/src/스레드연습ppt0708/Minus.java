package 스레드연습ppt0708;

public class Minus extends Thread {
	//Minus클래스 Thread로부터 상속받음.(Thread가 가지고 있는 메서드 사용)
	
	@Override //Minus클래스의 메서드 재정의
	public void run() { //500까지 1씩 감소하는 count 설정
		for (int i = 500; i >= 0; i--) {
			System.out.println("Minus count: " + i);
			try {
				Thread.sleep(500); //0.5초마다 1번씩 증가하도록 설정
			} catch (InterruptedException e) {
				//인터럽트(방해, 중단): esc, ctrl+c, power-off
			}
		}
	}
}