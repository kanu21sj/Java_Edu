package �迭����;

import javax.swing.JOptionPane;

public class ���๮�������Թ��� {

	public static void main(String[] args) {
		 String[] last = new String[3];
		 String[] year = new String[3];
		 for (int i = 0; i < year.length; i++) {
			last[i] = JOptionPane.showInputDialog("�۳⿡ ���� �;��� ��"); //���ֵ�, ���, ����
			year[i] = JOptionPane.showInputDialog("���� ���� �;��� ��"); //���ֵ�, �λ�, ���
		}
		for (int i = 0; i < year.length; i++) {
			System.out.println(last[i] + " " + year[i]);
		}
		int count = 0;
		for (int i = 0; i < year.length; i++) {
			if(last[i].equals(year[i])) {
				count++;
				System.out.println("���� ��ġ�� " + i);
			}
		}
		System.out.println("���� ��ġ�� ������ " + count);
	}

}