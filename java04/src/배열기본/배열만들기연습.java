package �迭�⺻;

public class �迭����⿬�� {

	public static void main(String[] args) {
		//1. ���� 5�� ũ���� �迭�� ���� 10, 20, 30, 40, 50�� ������� �ִ´�.
		//ù��°, ����° ���� ���ؼ� ����Ʈ
		int[] num = new int [5];
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10; //num[0] ������ ���� �ʰ� ���� 1�� �����Ҷ����� 10�� Ŀ�� ���� �ִ� ��
		}		
		System.out.println(num[0] + num[2]);
	}

}