package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���Ȯ�ι��� {

	public static void main(String[] args) {
		
		int count90 = 0;
		int count80 = 0;
		int count70 = 0;
		int count60 = 0;
		int count60down = 0;
		int count = 0; //Ƚ��
		int sum = 0; //�Է� ���� ����
		
		while (true) { // �Է��� �޾Ƽ� 0�̸� ���ѷ����� ������.
			String data = JOptionPane.showInputDialog("�����Է� : ����0");
			if (data.equals("0")) {
				System.out.println("�ý��� ����!");
				break; //while���� break;
			}
			int data2 = Integer.parseInt(data);
			sum = sum + data2; //���� ���� ���
			if (data2 >= 90) { //ū������ �������� �ذ��ϴ°� ����
				count90++;
			} else if (data2 >= 80) {
				count80++;
			} else if (data2 >= 70) {
				count70++;
			} else if (data2 >= 60) {
				count60++;
			} else { 
				count60down++;
			}//else
		} //while
		  //while�� ������, ����Ʈ�� �غ��ô�!
		System.out.println("60�� �̸�: " + count60down);
		System.out.println("60�� �̻�: " + count60);
		System.out.println("70�� �̻�: " + count70);
		System.out.println("80�� �̻�: " + count80);
		System.out.println("90�� �̻�: " + count90);
		count = count90 + count80 + count70 + count60 + count60down;
		System.out.println("��ü ȸ���� " + count + "ȸ");
		System.out.println("����� : " + sum/(double)count + "��"); //����, ���� ����� �Ǽ��� �ǹǷ� �Ҽ������� �����ֵ��� double ���
	}//main
}//class