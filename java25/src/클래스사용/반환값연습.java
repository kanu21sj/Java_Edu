package 클래스사용;

import java.util.Date;

public class 반환값연습 {
	public void add2() {
		System.out.println("더하기 기능을 수행합니다.");
	}
	public int add(int x, int y) {//double 올 수 있음
		return x + y;
	}
	public double add(double x, int y) {//하나라도 double이면 double
		return x + y;
	}
	public String add(String x, String y) {
		return x + y;
	}
	public String add(int x, String y) {//하나라도 String이면 String
		return x + y;
	}
	public int[] add() {
		int[] x = {1,2,3}; //넘어가는 타입을 써주어야 함
		return x;
	}
	public Date getDate() {
		Date date = new Date();
		return date;
	}
}
