package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 반복확인문제2 {

	public static void main(String[] args) {
		//Random r = new Random();
		//int answer = r.nextInt(100); //-21억 ~ 21억, 괄호안 숫자 미만 랜덤으로 생성
		int answer = 55;
		int count = 0; // 총 입력 누적 횟수
		
		while (true) { //입력을 받아서 55면 무한루프를 끝낸다.
			String data = JOptionPane.showInputDialog("정답을 입력하세요 : "); //입력값을 가져오기 위해 JOptionpane실행
			int data2 = Integer.parseInt(data); //String data로 저장된 값을 int로 변경
			count++;
			
			if (data2 == answer) { // 정답일 경우
				System.out.println("축하드립니다.");
				System.out.println("정답을 맞추셨군요.");
				System.out.println("전체 회수는 " + count + "회"); 
				break;
			}else {
				System.out.println("정답이 아닙니다.");
			}if (data2 > answer) { //data2 변수의 값이 55 초과일 경우
				System.out.println("정답보다 큰값입니다.");
			}else { // data2 변수값이 55보다 작을 경우
				System.out.println("정답보다 작은값입니다.");	
			}
		}
	}
}