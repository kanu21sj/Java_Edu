package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 연습210203_2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int answer = r.nextInt(20); // 20 미만의 수를 랜덤으로 생성하여 정답을 맞추는 것
		int count = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("정답을 입력하세요: ");
			int data2 = Integer.parseInt(data); //String data 값을 int로 변환
			count++; // 시도 횟수 1씩 누적
			
			if (data2 == answer) {
				System.out.println("정답입니다. 축하드립니다.");
				System.out.println("시도 횟수는 " + count + "회");
				break;
			} else {
				System.out.println("정답이 아닙니다. 다시 시도해보세요.");
			} if (data2 > answer) {
				System.out.println("정답보다 큰 값입니다.");
			} else {
				System.out.println("정답보다 작은 값입니다.");
			}
			
		}

	}

}
