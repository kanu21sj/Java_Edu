package 스터디01;

import java.util.HashSet;
import java.util.Random;

public class a로또문제 {
	//로또 1~45중 6개의 임의의 숫자를 추출
	
	public static void main(String[] args) {
		//로또 번호(난수) 생성을 위한 Random 클래스 생성
		Random r = new Random();

		//중복체크 해서 넣어주는 HashSet클래스 사용
		HashSet lotto = new HashSet();
		
		while (lotto.size() < 6) { //while문을 사용하여 lotto번호 6개 추출할때 까지 반복
			int num = r.nextInt(45) + 1; //랜덤한 1~45까지의 숫자를 사용
			System.out.println("로또번호: " + num);
			lotto.add(num); //추출된 번호를 lotto변수에 저장
		}
		System.out.println(lotto);
	}

}
