package 스터디01;

public class c구구단문제 {
	//구구단 3단에서 4의 배수를 제외하고 출력

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			//i가 1~9까지 숫자로 하나씩 입력되도록 for문 사용
			for (int j = 3; j <= 3; j++) {
				//i가 9까지 입력되는동안 j가 3의 배수로 설정되기 위한 for문 설정
				if (i % 4 == 0) { 
					//i가 4의 배수일 경우
					continue; 
					//continue문을 사용하여 다음으로 넘어감
				}
				System.out.print(j + " x " + i + " = " + i*j + "\t");
			}

		}	

	}

}
