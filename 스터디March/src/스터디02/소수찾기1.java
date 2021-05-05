package 스터디02;

public class 소수찾기1 {

	//1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution
	//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)
	//제한 조건 : n은 2이상 1000000이하의 자연수입니다.
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i++) {//1은 소수가 아니므로, 2부터 시작
        	int count = 0; //약수의 개수 (1 제외)
        	
        	for (int j = 2; j <= i; j++) {//1로 나누는 것 제외.
        		if(i%j == 0) {
        			count++; //count = 1 일때만 소수의 조건 만족
        		}
			}
        	if(count == 1) { //1을 제외하고, 자기 자신으로만 나누어 떨어지는 수 = 소수
        		answer++;
        	}
		}
        return answer; //소수 갯수 반환
    }
    
	public static void main(String[] args) {
		소수찾기1 s = new 소수찾기1();
		System.out.println("10 이하 소수의 개수: " + s.solution(10));
		System.out.println("5 이하 소수의 개수: " + s.solution(5));
	}
}