package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거3 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int [] num = new int[5000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50000);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " : " + num[i]);
		}
		HashSet set = new HashSet();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set);
		System.out.println(set.size());
	}
}
