package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class �ݺ�Ȯ�ι���2 {

	public static void main(String[] args) {
		//Random r = new Random();
		//int answer = r.nextInt(100); //-21�� ~ 21��, ��ȣ�� ���� �̸� �������� ����
		int answer = 55;
		int count = 0; // �� �Է� ���� Ƚ��
		
		while (true) { //�Է��� �޾Ƽ� 55�� ���ѷ����� ������.
			String data = JOptionPane.showInputDialog("������ �Է��ϼ��� : "); //�Է°��� �������� ���� JOptionpane����
			int data2 = Integer.parseInt(data); //String data�� ����� ���� int�� ����
			count++;
			
			if (data2 == answer) { // ������ ���
				System.out.println("���ϵ帳�ϴ�.");
				System.out.println("������ ���߼̱���.");
				System.out.println("��ü ȸ���� " + count + "ȸ"); 
				break;
			}else {
				System.out.println("������ �ƴմϴ�.");
			}if (data2 > answer) { //data2 ������ ���� 55 �ʰ��� ���
				System.out.println("���亸�� ū���Դϴ�.");
			}else { // data2 �������� 55���� ���� ���
				System.out.println("���亸�� �������Դϴ�.");	
			}
		}
	}
}