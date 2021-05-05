package 스터디05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class 요일리턴3 {

	public String solution2(int a, int b) {
	    String answer = "";
	    
	    // 캘린더 객체 사용
	    // 싱글톤
	    Calendar cal = Calendar.getInstance();
	    
	    // 연, 월(month -1 -> 캘린더에서 0이 1월달이기 때문), 일
	    // Calendar의 set 메서드 사용
	    cal.set(2016, a-1, b);
	    
	    // 캘린터 객체의 getTime 기능 사용
	    Date date = cal.getTime();
	    
	    // SimpleDateFormat: 해당 요일을 출력
	    // E: 요일, Locale.ENGLISH: 영어로 표기
	    SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
	          
	    // format: 날짜 형태를 String으로 만들어줌
	    // format(): 값으로는 date만 올 수 있음
	    // toUpperCase: 문자를 대문자로 반환
	    // date: 캘린더 객체의 date 변수
	    answer = sdf.format(date).toUpperCase();
	    return answer;
	}

	public static void main(String[] args) {
		
		요일리턴3 day3 = new 요일리턴3();
		
		System.out.println("월, 일 입력>> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "월 " + b + "일에 해당하는 요일은 " + day3.solution2(a, b));
	}
}
