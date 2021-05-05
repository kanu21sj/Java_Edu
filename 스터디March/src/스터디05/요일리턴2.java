package 스터디05;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class 요일리턴2 {

	public String getDayName(int month, int day) {
		
		// Calendar.Builder() 캘린더 클래스 사용
		// setCalendarType: ISO 8601(날씨와 시간과 관련된 국제표준) 호환, 주 매개 변수
		// setDate: 연, 월(month -1 -> 캘린더에서 0이 1월달이기 때문), 일
		Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month-1, day).build();
		
		// DAY_OF_WEEK: 일~토요일로 반환
		// SHORT: 요일 표기가 short 포맷으로 표기
		// Locale: 국가별 지역에 맞게 표기
		// toUpperCase: 문자를 대문자로 반환
		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
	}
	
	public static void main(String[] args) {
		
		요일리턴2 day2 = new 요일리턴2();
		
		System.out.println("월, 일 입력>> ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		System.out.println(month + "월 " + day + "일에 해당하는 요일은 " + day2.getDayName(month, day));
	}

}
