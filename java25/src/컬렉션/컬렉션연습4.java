package 컬렉션;

import java.util.HashMap;

public class 컬렉션연습4 {

	public static void main(String[] args) {
		
		HashMap com = new HashMap();
		com.put(1, "엄마");
		com.put(2, "아빠");
		com.put(3, "친구");
		com.put(4, "동생");
		System.out.println(com.get(2));
	}

}
