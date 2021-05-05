package 조건문;

import java.util.Date;

public class 조건문switch {

	public static void main(String[] args) {
		// 조건이 많을 때 사용 조건이 특정한 값인 경우
		Date date = new Date();
		int month = date.getMonth() + 1; //2
		System.out.println(month);
		//switch(변수) => 정수, 문자1(Char), String 까지만 되고 나머지는 안된다.
		switch (month) {
		case 2:
			System.out.println("28일까지 있음"); //break;
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있음");
			break;
		default:
			System.out.println("31일까지 있음");
			break;
		}

	}

}
