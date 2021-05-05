package 반복문;

public class 반복문for {

	//range(0:5) => 0, 1, 2, 3, 4
	public static void main(String[] args) {
		int[] num = new int[1000];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("win");
		}
		 //    시작값        조건식     증감식
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " 나는 프로그래머");
		} 
		
		int s = 0;
		while (s < 5) {
			s++; // for문 while 버전
		}
	}

}
