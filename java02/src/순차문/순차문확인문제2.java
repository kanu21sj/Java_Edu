package ������;

import javax.swing.JOptionPane;

public class ������Ȯ�ι���2 {

	public static void main(String[] args) {
		// �Է� -> ó�� -> ���
		// �Է�
		int score = 88; // ���ھ� 88������ ����
		char grade = ' '; // ���ؿ� ���� ���� ǥ���� ���� ����
		// ó��
		if (score >= 90 ) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		//���
		JOptionPane.showMessageDialog(null, grade); //jop(��Ʈ��+�����̽���) ���
	}

}
