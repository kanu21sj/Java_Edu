package 배열기본;

import java.util.Iterator;

public class 배열넣어보자 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t"); 
			// 가로로 배열하려면 System.out.println() -> ln 삭제
			// 탭 만큼 띄워서 배열하려면 역슬러쉬t 추가
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 100;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " \t");
		}

	}

}
