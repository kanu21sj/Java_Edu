package ��������;

public class �⺻������_Ȯ�ι��� {

	public static void main(String[] args) {
		
		int a = 66;
		int b = 77;
		int c = 88;
		int d = 99;
		
		int sum = a + b + c + d;
		//int avg = sum / 4;
		//�ڹٴ� int�� int ����� ����� �׻� int!
	
		System.out.println("�հ�� " + sum + "��");
		//System.out.println("����� " + avg);
		//�ڹٴ� �ϳ��� double �̸� ������ �׻�  double!
		
		double avg = (double)sum / 4;
		System.out.println("�����" + avg + "��");

		//������ Ÿ���� ���� ���ϴ� Ÿ������ �������ִ� ���� ĳ����!!
		//ram���� ���� Ÿ���� �״�� �ְ�,
		//cpu�� ram�� ����ִ� �����͸� �����ٰ� ���� ĳ������.
		//(�����ϰ����ϴ� Ÿ�Ը�) ���� => (double)sum
		
		final double PI = 3.14; //���� �Ұ����� �� final(���) => ������ �������� ���� �빮�ڷ� �� (pi -> PI)
		double r = 2.2;
		double mul = PI * r * r;
		System.out.println("���� ������" + mul);

	}

}
