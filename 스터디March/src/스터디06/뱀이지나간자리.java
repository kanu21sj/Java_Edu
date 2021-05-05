package 스터디06;

import java.util.Scanner;

public class 뱀이지나간자리 {

	public static void main(String[] args) {
		
//	N행 M열 평면에서 뱀이 지나간 자리 시각화
//	뱀은 1,1에서 시작하여 행 끝에서 밑으로 2칸 이동하고 다시 왼쪽 끝으로 가고 행렬의 끝에 다다르면 끝
//	평면의 크기는 두 정수 N, M이 공백으로 구분(단, 3 <= N, M <= 100)
//	뱀이 지나간 자리는 #으로, 지나가지 않은 자리는 .으로 출력

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

//		배열로 들어간 값들의 공백 제거
		String[] num = input.split(" ");	
		
//		문자열을 숫자로 변환하고 두 개의 숫자(행, 렬)로 쪼개어
//		첫번째 두번째 수를 각각 n, m변수에 넣어줌
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);	

		if (n >= 3 && n <= 100 && m >= 3 && m <= 100) { // n, m
			
			for (int i = 1; i <= n; i++) { // 1행부터 시작 ex) 5행 5열
			
				if (i%4 == 0) { // 4의 배수일 경우
					System.out.print("#"); // 가장 앞에 #을 찍어줌
										   // ex) 1열에 # 찍힘
					
					for (int j = 1; j < m; j++) { // 2부터 .이 시작되므로 j=1 이고 m보다 작을 때 까지 반복
												  // ex) 2 ~ 5까지 . 찍힘(if문에서 1열에 # 찍혔기 때문에, 2부터 시작)
						System.out.print(".");												
					}

				}
				
				else if (i%2 == 0) { // 2의 배수일 경우
					
					for (int j = 1; j < m; j++) { // 1부터 .시작이므로 j=1 m보다 작은 수 만큼 반복 
						                          // ex) 1 ~ 4까지 . 찍힘
						System.out.print(".");
					}
					System.out.print("#"); // 맨 오른쪽에 #찍혀야 함
										   // ex) 맨 마지막 수, 5열에서 # 찍힘
					
				}
				
				else { // 홀수일 경우(2의 배수도, 4의 배수도 아닐경우)
					
					for (int j = 1; j <= m; j++) { // m의 수 만큼 # 반복
												   // ex) 1 ~ 5까지 # 찍힘
						System.out.print("#");
					}
				}
				
				System.out.println(""); //조건을 만족하고 # or . 찍었을 경우 한칸 띄워줌
			}
			
		} else {
			System.out.println("n, m행은 3이상 100이하의 정수입니다.");
			
		} 
		sc.close();
	}
}
