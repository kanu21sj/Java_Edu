package �迭�⺻;

import java.util.Iterator;

public class �迭�־�� {

	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t"); 
			// ���η� �迭�Ϸ��� System.out.println() -> ln ����
			// �� ��ŭ ����� �迭�Ϸ��� ��������t �߰�
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 100;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " \t");
		}

	}

}
