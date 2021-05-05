package 컬렉션;

import java.util.HashSet;

public class 리스트형중복제거2 {

	public static void main(String[] args) {
		
		String [] food = {"감자", "양파", "고구마", "감자", "고구마"};
		
		HashSet set = new HashSet();
		for (int i = 0; i < food.length; i++) {
			set.add(food[i]);
		}
		System.out.println(set);
	}
}