package 스터디04;

import java.util.Scanner;

public class 시험성적평균과등급구하기 {

	public static void main(String[] args) {

//	구름이는 자신의 국어 수학 영어 3과목의 시험 성적을 확인했습니다.
//	평균과 등급을 알고 싶어하는 구름이를 도와줄 수 있는 프로그램을 작성하십시오.

//	평균은 소수점 2번째 자리까지만(3번째 자리에서 반올림) 출력하며 
//	등급은 평균 90점 이상일 경우 A, 90점 미만 80점 이상인 경우 B, 
//	80점 미만 70점 이상이 C, 70점 미만 60점 이상이 D이고 60점 미만으로는 F.

	Scanner sc = new Scanner(System.in);
	
	int korean = sc.nextInt();
	System.out.println("입력한 국어 성적은>> " + korean);
	
	int math = sc.nextInt();
	System.out.println("입력한 수학 성적은>> " + math);
	
	int english = sc.nextInt();
	System.out.println("입력한 영어 성적은>> " + english);
	
//	int korean = 100;
//	int math = 100;
//	int english = 98;
	
	int sum = 0;
	
//	int [] subject = new int[3]; //입력을 한번에 3개 받아서 하면 됨
	
	int subject [] = {korean, math, english};
//	int sum = (korean + math + english);
	
	for (int i = 0; i < subject.length; i++) {
		sum += subject[i]; //sum = sum + subject[i] 같은 의미
	}
	System.out.println(sum);
	
	float average = (sum/subject.length); //float: 실수
	System.out.println(String.format("%,.2f", average)); //소수 두번째 까지 반올림
	
	// DecimalFormat 0.00 -> 소수점 두자리 까지 반올림 됨 and 0.30, 3 다음 0처럼 값이 없을 경우 0.3으로 표기
	
	char grade = ' ';
	
		for (int i = 0; i < subject.length; i++) {
			if (average >= 90) {
				grade = 'A';
				
			} else if (average >= 80) {
				grade = 'B';
				
			} else if (average >= 70) {
				grade = 'C';
				
			} else if (average >= 60) {
				grade = 'D';
			
			} else {
				grade = 'F';
			}
		}
		System.out.println("성적 등급은 " + grade);
		sc.close();
	}

}
