package 상속문제연습ppt0708;

public class bMain2 {

	public static void main(String[] args) {
		bMonitor m = new bMonitor();
		m.price = 100;
		m.type = "Desktop";
		m.size = 5;
		m.영화보다();
		m.작업하다();
		m.출력();
		System.out.println(m);
		
		System.out.println("-------------------------------------------");
		
		bSpeaker s = new bSpeaker();
		s.price = 50;
		s.type = "Laptop";
		s.volume = 10;
		s.영화보다();
		s.작업하다();
		s.소리();
		System.out.println(s);
	}

}
