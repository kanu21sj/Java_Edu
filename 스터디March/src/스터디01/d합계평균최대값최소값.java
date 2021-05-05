package 스터디01;

import java.util.Arrays;

public class d합계평균최대값최소값 {
	//배열 {3, 12, 45, 32, 54, 22}가 있을 때 합계, 평균, 최대값, 최소값 구하기

	public static void main(String[] args) {
		
		int [] num = {3, 12, 45, 32, 54, 22};

		int sum = 0;
		double average = 0.0;
		int max = num[0];
		int min = num[0];
		

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("num 배열의 합계는 " + sum);
		average = (double)sum/num.length;
		
		System.out.println("num 배열의 평균은 " + average);
		System.out.println("-----------------------------");
		
		Arrays.sort(num); 
		//배열을 정렬된 순서로 변경
		System.out.println("최대값은 " + num[num.length - 1]); 
		//마지막 자리에 위치한 숫자 출력
		System.out.println("최소값은 " + num[0]); 
		//가장 첫번째 자리에 위치한 숫자 출력
		System.out.println("-----------------------------");
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > max) { 
				//num변수안 숫자들 반복 비교하여 더 이상의 큰 수가 없을때까지 추출
				max = num[i]; 
				//마지막 남은 숫자가 max
			}
			else if (num[i] < min) { 
				//num변수안 숫자중 반복 비교하며 더 이상의 작은수가 없을때까지 추출
				min = num[0]; 
				//마지막 남은 숫자가 min
			}
		}
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
	}

}
