package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ����210203_2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int answer = r.nextInt(20); // 20 �̸��� ���� �������� �����Ͽ� ������ ���ߴ� ��
		int count = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("������ �Է��ϼ���: ");
			int data2 = Integer.parseInt(data); //String data ���� int�� ��ȯ
			count++; // �õ� Ƚ�� 1�� ����
			
			if (data2 == answer) {
				System.out.println("�����Դϴ�. ���ϵ帳�ϴ�.");
				System.out.println("�õ� Ƚ���� " + count + "ȸ");
				break;
			} else {
				System.out.println("������ �ƴմϴ�. �ٽ� �õ��غ�����.");
			} if (data2 > answer) {
				System.out.println("���亸�� ū ���Դϴ�.");
			} else {
				System.out.println("���亸�� ���� ���Դϴ�.");
			}
			
		}

	}

}
