package ������;
import javax.swing.JOptionPane;
public class ������Ȯ�ι��� {
	public static void main(String[] args) {
		// �Է� -> ó�� -> ���
		// �Է����ִ� �κ�
		String dessert = JOptionPane.showInputDialog("�԰� ���� ������"); // ������ ���Ŀ� ���� �޼��� �˾�
		// ó�����ִ� �κ�
		int money = 5000;
		String result = ""; // �Էµ� ����� ���� ����� �����ֱ� ���� result ����
		if (dessert.equals("����")) {//�񱳿����ڴ� �⺻�����͸��� �� ��.
			result = "������̱���!";
		}else if (dessert.equals("���")) {
			result = "�л��̱���!";
		}else if (dessert.equals("Ŀ��")) {
			result = "�����̱���!";
		}else {
			result = "������ �򱺿�!";
		}
		// vip yes or no ���ο� ���� money �׼� 1000�� ����
		String vip = JOptionPane.showInputDialog("vip �Դϱ�? yes or no");
		String result1 = ""; //vip���ο� ���� result1 ����
		if (vip.equals("yes")) {
			money = money - 1000;
			result1 = "1000�� ���εǾ����ϴ�.";
		} else {
			result1 = "�����ص帮�ڽ��ϴ�.";	
		}
		// ������ִ� �κ�
		JOptionPane.showMessageDialog(null,result + result1);
	}
}