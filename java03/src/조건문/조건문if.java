package 조건문;

import java.util.Date;

public class 조건문if {

	public static void main(String[] args) {
		// new 키워드를 이용해서 Date틀에 대한 부품을 찍어냄.
		Date date = new Date(); //날짜와 시간에 대한 정보를 알려주는 class
		int hour = date.getHours(); //12
		System.out.println("현재시각은 " + hour + "시");
		if (hour <= 11 ) {
			System.out.println("굿모닝");
		}else if (hour <= 16) {
			System.out.println("굿애프터눈");			
		}else if (hour <= 22) {
			System.out.println("굿이브닝");			
		}else {
			System.out.println("굿나잇");
			
		}
		
	}

}
