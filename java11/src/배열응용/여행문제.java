package �迭����;

import javax.swing.JOptionPane;

public class ���๮�� {

	public static void main(String[] args) {
		String [] s = new String [3];
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("�۳⿡ ���� �;��� ��� �Է�");
		}
		for (String x : s) {
			System.out.print(x + " ");
		}
		String [] t = new String [3];
		for (int i = 0; i < t.length; i++) {
			t[i] = JOptionPane.showInputDialog("���� ���� �;��� ��� �Է�");
		}
		for (String y : t) {
			System.out.print(y + " ");			
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(t[i])) {
				System.out.println();
				System.out.println("��ġ�ϴ� �׸��� �ֽ��ϴ�.");
				System.out.println("��ġ�� " + i);
			}
		}
	}

}
