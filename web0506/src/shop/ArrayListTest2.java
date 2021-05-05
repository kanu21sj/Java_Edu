package shop;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("늦잠자기");
		list.add("여행가기");
		list.add("운동하기");
		list.add(100);
		list.add(110.110);
		System.out.println(list.size()); //크기 가져오는 메서드 size
		list.remove(4);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
	}
}
