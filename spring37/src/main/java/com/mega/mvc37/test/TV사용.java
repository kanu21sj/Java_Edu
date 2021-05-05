package com.mega.mvc37.test;

public class TV사용 {

	public static void main(String[] args) {
		TV tv1 = new TV(100, "검정"); 
		//TV클래스 안에서 int ch, String color 변수 설정해주었기 때문에 
		//new TV() -> 괄호안에 변수에 대한 실제값을 입력해주어야 한다.
		//TV tv1 = new TV(100, "검정"); 생성된 변수의 개수는?
		// => tv1 참조형변수, TV클래스안 int ch, String color 변수 3개
		
		System.out.println(tv1);

		TV tv2 = new TV(200, "빨강"); 
		System.out.println(tv2);
	}

}
