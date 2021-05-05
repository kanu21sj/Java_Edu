package 스터디01;

public class e배수에따른단어출력 {
	//1~100까지 중 3의 배수면 짱, 5의 배수면 킹, 3의 배수이면서 5의 배수이면 짱킹
	//이외에는 그냥 숫자를 출력하는 코드를 작성하시오.

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			//i가 100까지 돌아가는 for문 사용
			
			if (i % 3 == 0) {
				//i가 3의 배수로 떨어질 경우 출력
				System.out.println("3의배수 " + i + " 짱");
			}
			if (i % 5 == 0) {
				//i가 5의 배수로 떨어질 경우 출력
				System.out.println("5의배수 " + i + " 킹");
			}
			if ((i % 3 == 0) && (i % 5 ==0)) {
				//i가 3의 배수와 5의배수를 만족하는 경우 출력
				System.out.println("3, 5의배수 " + i + " 짱킹");
			}
			if (i % 3 == 0 || i % 5 == 0) { //3의 배수 또는 5의 배수 제외
				//|| => or 이라는 뜻
			}
			else { //그 외는 출력
				System.out.println("기타숫자 " + i);
			}
		}
	}
}	