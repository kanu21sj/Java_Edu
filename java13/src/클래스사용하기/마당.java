package 클래스사용하기;

import 클래스만들기.강아지;

public class 마당 {

	public static void main(String[] args) {
		//dog1, dog2에는 주소가 들어가 있음
		강아지 dog1 = new 강아지();
		//dog1, dog1의 멤버 변수인 color, type 만들어진다.
		//dog1 안에 color, type을 가르키고 있는 주소가 저장됨.
		
		강아지 dog2 = new 강아지();
		//dog2, dog2의 멤버 변수인 color, type 만들어진다.
				
		dog1.color = "갈색";
		dog1.type = "진돗개";
		dog1.bark();
		//public으로 선언하지 않으면 다른 패지기에서 not visible!
		
		dog2.color = "흰색";
		dog2.type = "비숑";
		dog2.walk();

		System.out.println(dog1.color);
		System.out.println();
	}

}