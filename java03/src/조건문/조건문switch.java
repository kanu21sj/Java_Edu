package ���ǹ�;

import java.util.Date;

public class ���ǹ�switch {

	public static void main(String[] args) {
		// ������ ���� �� ��� ������ Ư���� ���� ���
		Date date = new Date();
		int month = date.getMonth() + 1; //2
		System.out.println(month);
		//switch(����) => ����, ����1(Char), String ������ �ǰ� �������� �ȵȴ�.
		switch (month) {
		case 2:
			System.out.println("28�ϱ��� ����"); //break;
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30�ϱ��� ����");
			break;
		default:
			System.out.println("31�ϱ��� ����");
			break;
		}

	}

}
