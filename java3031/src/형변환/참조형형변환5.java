package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//자동형변환 Object으로 변환!
		//자동 형변환의 단점: 부가적으로 추가된 기능들을 쓸 수 없다. 
		
		list.add("홍길동"); //0번 인덱스
		list.add(100); 
		//int(기본형) --> auto-boxing --> Integer(참조형) --> upcasting --> Object
		list.add(11.22); 

		int num = (Integer)list.get(1);
		//int(기본형) --> auto-unboxing --> Integer(참조형) --> downcasting --> Object
		System.out.println(list);
	}

}
