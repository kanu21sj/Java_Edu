package �迭����;

import javax.swing.JOptionPane;

public class �����������Է� {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0, 0, 0}
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("������ �Է��ϼ���"); //"100"
			// num[i] = data; ĳ������ �⺻��=�⺻������, ������=������������ ����
			//String --> int : Integer.parseInt�� ĳ���� �ʿ�
			int data2 = Integer.parseInt(data); //"100" -> 100
			//�Ǽ��� ���, double d = Double.parseDouble(data);
			num[i] = data2;
		}
		for (int x : num) { //for-each�� ����Ͽ� �ϳ��� ���
			System.out.print(x + " "); //���� x�� ���
		}
		//�ʱ�ȭ���� ���� ������ ���� : ������ ����
		int sum = 0; //�������� ó������ �־��ִ� �� => �ʱ�ȭ!
		//�������� �� �ʱ�ȭ�� �� ���־�� �Ѵ�.
		
		for (int x : num) { 
			sum = x + sum; //�հ� ���� ���ϱ� ���� sum ����
		}
		System.out.print(String.format("%.2f", sum / (double)num.length)); //%.2f �Ҽ��� 2�ڸ����� �ݿø� ����
		
		
	}

}
