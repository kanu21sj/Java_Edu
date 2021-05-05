package 스터디01;

import javax.swing.ImageIcon;

public class h이미지스레드 extends Thread{
	//해당 클래스 Thread 상속받아 사용	
	
		@Override //메서드 재정의
		public void run() {
			String[] list = {"1.png, 2.png, 3.png, 4.png, 5.png, 6.png"}; //이미지 배열
			for (int i = 0; i < list.length; i++) { //이미지 개수만큼 for문 돌림
				System.out.println("이미지: " + list[i]);
				try {
					//초를 설정할 때는 밀리세컨즈 , 1/1000설정.
					Thread.sleep(500); 
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단): esc, ctrl+c, power-off
				}
	
			}
		}
}
