package 스터디01;

public class h동시프로그램실행 extends Thread{

	public static void main(String[] args) {

		h카운트스레드 count = new h카운트스레드();
		h이미지스레드 img = new h이미지스레드();
		h날짜스레드 date = new h날짜스레드();
		
		//cpu한테 스레드 2개 만든 것 스레드 등록
		count.start();
		img.start();
		date.start();
		
		
	}
}
