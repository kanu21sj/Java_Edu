package �迭��ȭ;

public class �⺻������ {

	public static void main(String[] args) {
		int x = 100;
		int y = x; //�⺻�� ����
		System.out.println("������  x: " + x);
		System.out.println("������  y: " + y);
		x = 200; //x = 200���� ��ȯ�ǰ� y�� 100 �׷��� (�ڵ� ������ ���� �Ѵ�!!)
		System.out.println();
		System.out.println("������  x: " + x);
		System.out.println("������  y: " + y); //�⺻���� ��� x = y, ����� ��ÿ��� ����

	}

}
