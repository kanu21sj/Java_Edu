package �ݺ���;

import javax.swing.JOptionPane;

public class ����210203_1 {

	public static void main(String[] args) {
		
		int count90 = 0;
		int count80 = 0;
		int count70 = 0;
		int count60 = 0;
		int count60down = 0;
		int count = 0; // �Է��� Ƚ���� �˾ƺ��� ���� ī��Ʈ ���� ����
		int sum = 0; // �Էµ� �������� ������ ������ �˾ƺ��� ���� ���� ����
		
		while (true) {
			String data = JOptionPane.showInputDialog("�����Է� : ����0 ");
			if (data.equals("0")) { 
				System.out.println("�ý��� ����!"); //0 ������ ������ ��� �ý��� ����â �˾�
				break;
			}
			int data2 = Integer.parseInt(data);
			sum = sum + data2; //���� ������� �����ϱ� ���� sum
			if (data2 >= 90) {//90,80,70... �̷� ��� ū������ ���� �����ϴ� ���� ����
				count90++; // 90�̻� ������ �Է��Ҷ� ���� count90�� 1�� ������
			} else if (data2 >= 80) {
				count80++;
			} else if (data2 >= 70) {
				count70++;
			} else if (data2 >= 60) {
				count60++;
			} else {
				count60down++;
			}
		}
		System.out.println("60�� �̸�: " + count60down);
		System.out.println("60�� �̻�: " + count60);
		System.out.println("70�� �̻�: " + count70);
		System.out.println("80�� �̻�: " + count80);
		System.out.println("90�� �̻�: " + count90);
		count = count90 + count80 + count70 + count60 + count60down; // �Է� Ƚ���� ���������� �ջ�
		System.out.println("��ü Ƚ���� " + count + "ȸ");
		System.out.println("����� : " + sum/(double)count + "��"); 
		//��հ��� ��ü ���� �հ迡�� �Է�Ƚ���� ������� �ϹǷ�
		//������ ������ ����� ������ ������ �ǹǷ� �Ҽ������� ǥ�����ֱ� ���ؼ��� double��� ��
	}

}
