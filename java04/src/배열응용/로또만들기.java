package 배열응용;

import java.util.Random;

//많은 양의 자동 import: 컨트롤+쉬프트+o
public class 로또만들기 {

	public static void main(String[] args) {
		int[] lotto = new int[1000];
		Random r = new Random(42);//seed 값 넣어주면 고정된 랜덤 값을 구할 수 있음
		for (int i = 0; i < lotto.length; i++) { //6번 자동완성	
			lotto[i] = r.nextInt(45) + 1; //0부터 45까지
		}
		for (int x : lotto) {
			System.out.print(x + " "); 
		}
		System.out.println();
		int count = 0;
		for (int x : lotto) {
			if (x >= 30) {
				count++;
			}
		}
		System.out.println(count);
	}

}
