package 반복문;

import javax.swing.JOptionPane;

public class 반복문확인문제 {

	public static void main(String[] args) {
		
		int count90 = 0;
		int count80 = 0;
		int count70 = 0;
		int count60 = 0;
		int count60down = 0;
		int count = 0; //횟수
		int sum = 0; //입력 점수 누적
		
		while (true) { // 입력을 받아서 0이면 무한루프를 끝낸다.
			String data = JOptionPane.showInputDialog("점수입력 : 종료0");
			if (data.equals("0")) {
				System.out.println("시스템 종료!");
				break; //while문의 break;
			}
			int data2 = Integer.parseInt(data);
			sum = sum + data2; //점수 누적 계산
			if (data2 >= 90) { //큰수부터 작은수로 해결하는게 좋음
				count90++;
			} else if (data2 >= 80) {
				count80++;
			} else if (data2 >= 70) {
				count70++;
			} else if (data2 >= 60) {
				count60++;
			} else { 
				count60down++;
			}//else
		} //while
		  //while문 끝내고, 프린트를 해봅시다!
		System.out.println("60점 미만: " + count60down);
		System.out.println("60점 이상: " + count60);
		System.out.println("70점 이상: " + count70);
		System.out.println("80점 이상: " + count80);
		System.out.println("90점 이상: " + count90);
		count = count90 + count80 + count70 + count60 + count60down;
		System.out.println("전체 회수는 " + count + "회");
		System.out.println("평균은 : " + sum/(double)count + "점"); //정수, 정수 계산은 실수로 되므로 소수점까지 구해주도록 double 사용
	}//main
}//class