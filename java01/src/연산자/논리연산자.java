package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자 {

	public static void main(String[] args) {
		// &&(그리고), ||(또는), !(not)
		int id1 = 1000;
		int id2 = 2000;
		int pw1 = 2222;
		int pw2 = 2222;
		System.out.println(id1 == id2 && pw1 == pw2);
		if (id1 == id2 && pw1 == pw2) {
			JOptionPane.showMessageDialog(null, "로그인 성공함.");
			
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패함.");
		}
		

	}

}
