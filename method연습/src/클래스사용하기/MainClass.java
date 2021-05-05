package 클래스사용하기;

import java.util.ArrayList;

import 클래스만들기.Bag;
import 클래스만들기.계산기;

//메인은 하나만 가짐
public class MainClass {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		ArrayList<Bag> list = cal.div();
		System.out.println(list.size() + "개" );
		for (Bag bag : list) {
			System.out.println("가방에서 꺼낸 데이터: " + bag.getName());
			System.out.println("가방에서 꺼낸 데이터: " + bag.getAge());
			System.out.println("가방에서 꺼낸 데이터: " + bag.getWeight());
		}
		
		int y = cal.add(300, 100);
		
		if (y >= 300) {
			System.out.println("우수 회원입니다.");
		}
		int[] result1 = cal.minus();
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
			
		}
		for (int x : result1) {
			System.out.println(x);
		}
		System.out.println("=================");
		Bag bag = cal.mul();
		System.out.println("받은 이름: " + bag.getName());
		System.out.println("받은 이름: " + bag.getAge());
		System.out.println("받은 이름: " + bag.getWeight());
		
		
	}	

}
