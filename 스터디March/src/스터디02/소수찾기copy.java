package 스터디02;

public class 소수찾기copy {

	// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수 반환
	// 소수란, 1과 자기 자신만으로 나누어 지는 수(1은 소수가 아님)
	public int solution(int n) {
				
		int count = 0;
		for (int i = 0; i <= n; i++) {

			for (int j = 2; j <= i; j++) {
				// 0과 1로 나누어지는 것은 제외
				// 자기 자신으로 나누었을 때 몫을 1로 가지기 때문에 
				// 굳이 1부터 할 필요가 없음
				
				if (i % j == 0) {
					// i를 j로 나누었을 때 0이 되면 소수가 되므로 카운트
					// 소수는 몫으로 1과 자기 자신만 가지고 나머지가 항상 0이기 때문에
					count++;
				}
//			}if (count ==1) { 
//				이 부분이 잘 이해가 안되어 그냥 위에서 카운트 한 값을 결과로 받음
//				answer++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		소수찾기copy s = new 소수찾기copy();
		System.out.println("10 이하 소수의 개수: " + s.solution(10));
		System.out.println("5 이하 소수의 개수: " + s.solution(5));
	}
}
