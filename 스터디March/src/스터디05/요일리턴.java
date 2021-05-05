package 스터디05;

import java.util.Scanner;

public class 요일리턴 {

	public String solution(int a, int b) {

		int totalDay = 0;
		String[] day = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
		
		// a(월)에 따른 일 수 계산
		for (int i = 0; i < a; i++) {
			
			//4, 6, 9, 11월은 30일
			if (i==4 || i==6 || i==9 || i==11) {
				totalDay += 30;
				
				// 2월은 윤년이므로 29일
			} else if (i==2) {
				totalDay += 29;
			
				// 그 외는 31일
			} else {
				totalDay += 31;
			}
		}
		
		// day 배열 기준, 금요일 -> 월요일로 세팅하기 위해서 +3
		// 총 일수에서 7을 나누면 해당 월일에 대한 요일 구해줌
		System.out.println("총 요일은 " + totalDay);
		
		totalDay += b+3;
		return day[totalDay%7];
	}
	
	public static void main(String[] args) {
		
		요일리턴 day1 = new 요일리턴();
		
		System.out.println("월, 일 입력>> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "월 " + b + "일에 해당하는 요일은 " + day1.solution(a, b));
		
		sc.close();
	}

}
