package 배열심화;

import java.util.Random;

public class 최대값찾기2 {

	public static void main(String[] args) {
		int[] num = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		int max = num[0];
		
		for (int i = 1; i < num.length; i++) { // max = num[0] 첫번째 값을 넣어놨기 때문에
			// int i = 1부터 시작
			if (max < num[i]) { //max 값이 num[i] 보다 클 때까지 계속 진행 
				max = num[i]; //반복된 값 중, max 값이 num[i] 같다면 그것이 최대값
			}
		}
		System.out.println(max);
		//최대값이 얼마인지를 먼저 찾아야 한다.
		//그 최대값이 배열에서 어디에 들어있는지를 찾아야한다.
		//어디에 => index, i
		int count = 0;
		String sum = "";
		for (int i = 0; i < num.length; i++) {
			if (max == num[i]) {
				//System.out.println("최대값의 위치: " + i);
				sum = sum + i + " ";
				count++;
			}
		}
		System.out.println("최대값의 개수: " + count);
		System.out.println("최대값의 위치: " + sum);
		String[] s = sum.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
	}
}