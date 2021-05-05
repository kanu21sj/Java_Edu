package 순차문;

import javax.swing.JOptionPane;

public class 순차문확인문제2 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 입력
		int score = 88; // 스코어 88점으로 선언
		char grade = ' '; // 기준에 따라 성적 표기할 것을 선언
		// 처리
		if (score >= 90 ) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		//출력
		JOptionPane.showMessageDialog(null, grade); //jop(컨트롤+스페이스바) 출력
	}

}
