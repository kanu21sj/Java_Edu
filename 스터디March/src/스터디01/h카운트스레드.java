package 스터디01;

public class h카운트스레드 extends Thread {
	//h카운트스레드 클래스 Thread로부터 상속받음.(Thread가 가지고 있는 메서드 사용)
	
	@Override //메서드 재정의
	public void run() { //500까지 1씩 증가하는 count 설정
		for (int i = 0; i <= 500; i++) {
			System.out.println("Plus count: " + i);
			try {
				Thread.sleep(500); //0.5초마다 1번씩 증가하도록 설정
			} catch (InterruptedException e) {
				//인터럽트(방해, 중단): esc, ctrl+c, power-off
			}
		}
	}

}