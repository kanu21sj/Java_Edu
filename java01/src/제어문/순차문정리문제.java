package ���;

import javax.swing.JOptionPane;

public class �������������� {

	public static void main(String[] args) {
		
		String place = JOptionPane.showInputDialog("�������� �Է��ϼ���"); 
		String hobby = JOptionPane.showInputDialog("��̸� �Է��ϼ���"); 
		
		String place1 = place + "�� ";
		String hobby1 = hobby + "�� ��ⷯ ����.";
		
		JOptionPane.showMessageDialog(null, "����� " + place1 + hobby1);

	}

}
