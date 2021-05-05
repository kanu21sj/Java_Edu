package 반복문;

import javax.swing.JOptionPane;

public class 연습210203_1 {

	public static void main(String[] args) {
		
		int count90 = 0;
		int count80 = 0;
		int count70 = 0;
		int count60 = 0;
		int count60down = 0;
		int count = 0; // 입력한 횟수를 알아보기 위한 카운트 변수 선언
		int sum = 0; // 입력된 점수들의 누적된 총합을 알아보기 위한 변수 선언
		
		while (true) {
			String data = JOptionPane.showInputDialog("점수입력 : 종료0 ");
			if (data.equals("0")) { 
				System.out.println("시스템 종료!"); //0 누르고 종료일 경우 시스템 종료창 팝업
				break;
			}
			int data2 = Integer.parseInt(data);
			sum = sum + data2; //점수 누적계산 저장하기 위한 sum
			if (data2 >= 90) {//90,80,70... 이런 경우 큰수부터 먼저 나열하는 것이 좋음
				count90++; // 90이상 점수를 입력할때 마다 count90에 1씩 누적됨
			} else if (data2 >= 80) {
				count80++;
			} else if (data2 >= 70) {
				count70++;
			} else if (data2 >= 60) {
				count60++;
			} else {
				count60down++;
			}
		}
		System.out.println("60점 미만: " + count60down);
		System.out.println("60점 이상: " + count60);
		System.out.println("70점 이상: " + count70);
		System.out.println("80점 이상: " + count80);
		System.out.println("90점 이상: " + count90);
		count = count90 + count80 + count70 + count60 + count60down; // 입력 횟수를 최종적으로 합산
		System.out.println("전체 횟수는 " + count + "회");
		System.out.println("평균은 : " + sum/(double)count + "점"); 
		//평균값은 전체 점수 합계에서 입력횟수를 나누어야 하므로
		//정수와 정수의 계산은 정수로 나오게 되므로 소수점까지 표현해주기 위해서는 double써야 함
	}

}
