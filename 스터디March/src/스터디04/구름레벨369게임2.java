package 스터디04;

import java.util.Scanner;

public class 구름레벨369게임2 {

	public static void main(String[] args) {
		
		Scanner	sc = new Scanner(System.in);
		
		//배열에 넣어 for문 반복으로 돌려서 3, 6, 9 확인
		int[] target = new int[sc.nextInt()];
		System.out.println("타겟 숫자는>> " + target);
		System.out.println("타겟 숫자의 길이는>> " + target.length);
		
		// 박수 친 횟수
		int total = 0;
		
		// for문으로 n번 까지의 박수 횟수를 파악
		for (int i = 1; i < target.length; i++) {
			target[i] = i; 
			
			if (target[i]<10) {
				if (target[i]%3 == 0 || target[i]%6 == 0 || target[i]%9 == 0) {
					total += 1 ;
					System.out.println("숫자 " + target[i] + " 짝!");
					}
				} else {
					
					// 십의 자리수 조건 판별
					boolean quo10 = false;
					// 1의 자리수 조건 판별
					boolean rem10 = false;
					
					// 10으로 나누었을 때 몫
					int quo = target[i]/10;
					// 10으로 나누었을 때 나머지 값
					int rem = target[i]%10;
					
					// 십의 자리수를 10으로 나누고 몫이 3, 6, 9일 경우 
					if (quo == 3 || quo == 6 || quo == 9) {
						quo10 = true;
					}
					
					// 10으로 나눈 나머지의 값이 3, 6, 9인 경우
					// 3, 6, 9 숫자 체크를 위해서는 몫 나머지 값으로 확인가능
					if (rem == 3 || rem == 6 || rem == 9) {
						rem10 = true;
					}
					
					// 십의 자리수와 1의 자리수에 해당할 경우 카운트, 박수 2번
					if (quo10 && rem10) {
						total += 2;
						System.out.println("숫자 " + target[i] + " 짝짝!");
						
					// 십의 자리 수 또는 1의 자리수 해당할 경우 카운트, 박수 1번
					} else if (quo10 || rem10) {
						total += 1;
						System.out.println("숫자 " + target[i] + " 짝!");
					}
				}
			}
			System.out.println("총 박수친 횟수는 " + total + "번");
			sc.close();
		}
	} 
