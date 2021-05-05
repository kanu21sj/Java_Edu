package 배열응용;

import javax.swing.JOptionPane;

public class 여행문제 {

	public static void main(String[] args) {
		String [] s = new String [3];
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 장소 입력");
		}
		for (String x : s) {
			System.out.print(x + " ");
		}
		String [] t = new String [3];
		for (int i = 0; i < t.length; i++) {
			t[i] = JOptionPane.showInputDialog("올해 가고 싶었던 장소 입력");
		}
		for (String y : t) {
			System.out.print(y + " ");			
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(t[i])) {
				System.out.println();
				System.out.println("일치하는 항목이 있습니다.");
				System.out.println("위치는 " + i);
			}
		}
	}

}
