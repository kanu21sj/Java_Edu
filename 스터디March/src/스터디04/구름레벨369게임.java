package 스터디04;

import java.util.Scanner;

public class 구름레벨369게임 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//숫자 입력
		System.out.print("숫자 입력>> ");
		int n = scan.nextInt();
		int count = 0;
		
		//369게임은 첫번째 사람 부터 for 1~ , n 이전까지 이므로 부등호는 <
		for (int i = 1; i < n; i++) {
			
			//입력받은 정수를 문자로 형변환
			//valueOf(String) new integer()으로 객체를 반환
			//parseInt(String) int 기본 자료형을 반환
			String nstr = String.valueOf(i);
			
			//각 자리수에 3,6,9 있으면 박수 (두개 있으면 박수 두번)
			for (int j = 0; j < nstr.length(); j++) {
				
				if (nstr.charAt(j)=='3'||nstr.charAt(j)=='6'||nstr.charAt(j)=='9') {
					count++;
					
				}//if문 끝
				
			}//하나의 n에 대한 박수 for문 끝
			
		}//입력받은 숫자만큼 반복하는 for문 끝
		System.out.print("박수 친 횟수>> " + count);
	}
}
