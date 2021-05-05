package 스레드;

public class 스레드연습실행 {

	public static void main(String[] args) {
		스레드연습1 t1 = new 스레드연습1();
		스레드연습2 t2 = new 스레드연습2();
		스레드연습3 t3 = new 스레드연습3();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
