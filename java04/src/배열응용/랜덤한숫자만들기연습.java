package �迭����;

import java.util.Random;

public class �����Ѽ��ڸ���⿬�� {

	public static void main(String[] args) {
		int[] toto = new int[1000]; //toto��� ���� 1000�� �����
		Random r = new Random(42); //no.42 �������� �����Ǽ� ���� �� �ֵ��� ����
		for (int i = 0; i < toto.length; i++) { //for toto.length ������ ������
			toto[i] = r.nextInt(1000); //0~999������ ���ڸ� ����
		}
		int count600 = 0; //600�̻��� ���� ������ ī��Ʈ �ϱ� ���� ���� ����
		int count500 = 0; //500�̻��� ���� ������ ī��Ʈ �ϱ� ���� ���� ����
		int count400 = 0; //400�̻��� ���� ������ ī��Ʈ �ϱ� ���� ���� ����
		int count300 = 0; //300�̻��� ���� ������ ī��Ʈ �ϱ� ���� ���� ����
		
		for (int x : toto) { //���� toto �ȿ� �ִ� ���� for-each ��������
			if (x >= 600) { //600�̻� ���� ī��Ʈ
				count600++; //count500 �ϳ��� �����Ͽ� ī��Ʈ
			}else if (x > 500) { //500�̻� ���� ī��Ʈ
				count500++; //count500 �ϳ��� �����Ͽ� ī��Ʈ
			}else if (x > 400) { //400�̻� ���� ī��Ʈ
				count400++; //count400 �ϳ��� �����Ͽ� ī��Ʈ
			}else if (x > 300) { //300�̻� ���� ī��Ʈ
				count300++; //count300 �ϳ��� �����Ͽ� ī��Ʈ
			}
		}
		System.out.println("600 �̻��� ������ : " + count600 + " ��"); //���� ���� connt600 ī�����Ͽ� ���
		System.out.println("500 �̻��� ������ : " + count500 + " ��"); //���� ���� connt500 ī�����Ͽ� ���
		System.out.println("400 �̻��� ������ : " + count400 + " ��"); //���� ���� connt400 ī�����Ͽ� ���
		System.out.println("300 �̻��� ������ : " + count300 + " ��"); //���� ���� connt500 ī�����Ͽ� ���
	}
}