package �ݺ���;

import javax.swing.JOptionPane;

public class ���������� {

	public static void main(String[] args) {
		String place = JOptionPane.showInputDialog("���� ���� ��������"); // jop ��Ʈ��+�����̽��� input �Լ� Ŭ���Ͽ� �Է�
		String result = ""; // �Է°��� ���� result ���� ����
		if (place.equals("����")) { //Ű���忡 ���� ����� ram�� ����
			result = "���ֵ��� ���� �;� �ϴ±���!"; //'����'�� ���� ����� result �����
		}else if (place.equals("����")) { //Ű���忡 ���� ����� ram�� ����
			result = "�ڷγ��� ������ �� �� �ְڳ׿�!"; //'����'�� ���� ����� result �����
		}else { 
			result = "�����ϼ���"; //else�� �ش��ϴ� ����� ����
		}

		JOptionPane.showMessageDialog(null,result); //jop ��Ʈ��+�����̽��� ������ �޼��� ����� ���
	}

}
