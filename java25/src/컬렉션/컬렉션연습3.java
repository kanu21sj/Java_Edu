package 컬렉션;

import java.util.ArrayList;

public class 컬렉션연습3 {

	public static void main(String[] args) {
		ArrayList com = new ArrayList();
		com.add("박스키");
		com.add("송스키");
		com.add("김스키");
		com.add("정스키");
		com.remove(2);
		for (int i = 0; i < com.size(); i++) {
			System.out.println((i+1) + "등 : " + com.get(i));
		}
	}
}