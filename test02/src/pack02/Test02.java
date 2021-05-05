package pack02;

import java.util.Random;
public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[10]; //값 10개 생성하기 위한 명령문 선언
		
		 Random r = new Random(); //랜덤한 값 생성
		 
		 for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(); //랜덤한 값 순서대로 나열
		}
		 for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " "); //랜덤값 프린트
		}
		 int sum = 0; //sum 변수 선언
		 double average = 0.0;
		 for (int i = 0; i < num.length; i++) {
			 sum = sum + i; //합계 값 구하기 위하여 합계에 i만큼 더함
			 average = (double)sum/num.length; //평균 값 구하기 위하여 합계에 개수만큼 나눔
		}
			System.out.println(sum); //합계값 프린트
			System.out.println(average); //평균값 프린트
	}
}
