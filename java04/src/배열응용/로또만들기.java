package �迭����;

import java.util.Random;

//���� ���� �ڵ� import: ��Ʈ��+����Ʈ+o
public class �ζǸ���� {

	public static void main(String[] args) {
		int[] lotto = new int[1000];
		Random r = new Random(42);//seed �� �־��ָ� ������ ���� ���� ���� �� ����
		for (int i = 0; i < lotto.length; i++) { //6�� �ڵ��ϼ�	
			lotto[i] = r.nextInt(45) + 1; //0���� 45����
		}
		for (int x : lotto) {
			System.out.print(x + " "); 
		}
		System.out.println();
		int count = 0;
		for (int x : lotto) {
			if (x >= 30) {
				count++;
			}
		}
		System.out.println(count);
	}

}
