package 스터디03;

import java.util.Scanner;

public class 거스름돈 {

	public static void main(String[] args) {

		//system.in => 화면에서 입력을 받겠다.
		Scanner sc = new Scanner(System.in); 
		
		//물건 가격
		//nextInt() => int를 입력 받을 때,
		//(char)System.in.read() => char를 입력 받을 때
		//nextLine() => char를 여러개 입력 받을 때
		int cost = sc.nextInt();
		
		//잔돈은 1000원 이하의 물건에서 비용을 뺀 것
		int change = 1000 - cost;
		System.out.println("잔돈은 " + change);

		//동전 배열에 넣기
		int coin[] = {500, 100, 50, 10};  
		
		//동전 개수의 변수 생성
		int [] result;
		
		//동전의 개수(4개) 담을 결과 배열 생성
		result = new int[4];
		
		//잔돈이 계산 할수록 줄어들 수 있도록 반영
		//나머지는 음수가 있을 수 없으므로

		for (int i = 0; i < coin.length; i++) {
			if (change >= coin[i]) { //잔돈이 각 동전하나의 값보다 큰 경우
				result[i] = change/coin[i]; //result(동전개수)는 잔돈 나누기 각 동전금액 나눈 값
				change = change%coin[i]; //연산후 남은 잔돈은 잔돈에서 동전금액으로 나눈 나머지
			}
			System.out.print(result[i] + " ");
		}
	}
}