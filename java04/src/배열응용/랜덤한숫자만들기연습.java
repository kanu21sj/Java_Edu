package 배열응용;

import java.util.Random;

public class 랜덤한숫자만들기연습 {

	public static void main(String[] args) {
		int[] toto = new int[1000]; //toto라는 변수 1000개 만들기
		Random r = new Random(42); //no.42 변수값이 고정되서 나올 수 있도록 고정
		for (int i = 0; i < toto.length; i++) { //for toto.length 값까지 돌리기
			toto[i] = r.nextInt(1000); //0~999까지의 숫자를 생성
		}
		int count600 = 0; //600이상의 숫자 개수를 카운트 하기 위한 변수 생성
		int count500 = 0; //500이상의 숫자 개수를 카운트 하기 위한 변수 생성
		int count400 = 0; //400이상의 숫자 개수를 카운트 하기 위한 변수 생성
		int count300 = 0; //300이상의 숫자 개수를 카운트 하기 위한 변수 생성
		
		for (int x : toto) { //변수 toto 안에 있는 값을 for-each 꺼내오기
			if (x >= 600) { //600이상 개수 카운트
				count600++; //count500 하나씩 누적하여 카운트
			}else if (x > 500) { //500이상 개수 카운트
				count500++; //count500 하나씩 누적하여 카운트
			}else if (x > 400) { //400이상 개수 카운트
				count400++; //count400 하나씩 누적하여 카운트
			}else if (x > 300) { //300이상 개수 카운트
				count300++; //count300 하나씩 누적하여 카운트
			}
		}
		System.out.println("600 이상의 개수는 : " + count600 + " 개"); //최종 개수 connt600 카운팅하여 출력
		System.out.println("500 이상의 개수는 : " + count500 + " 개"); //최종 개수 connt500 카운팅하여 출력
		System.out.println("400 이상의 개수는 : " + count400 + " 개"); //최종 개수 connt400 카운팅하여 출력
		System.out.println("300 이상의 개수는 : " + count300 + " 개"); //최종 개수 connt500 카운팅하여 출력
	}
}