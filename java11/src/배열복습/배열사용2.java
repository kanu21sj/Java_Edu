package �迭����;

public class �迭���2 {

	public static void main(String[] args) {
		// ���� �˰� �ִ� ���
		String [] name = {"ȫ�浿", "�ڱ浿", "���浿", "�̱浿"};
		char [] gender = {'��', '��', '��', '��'};
		Boolean [] breakfast = {true, false, true, true};
		double[] eye = {1.2, 1.5, 0.1, 0.5};
		int [] age = {80, 60, 70, 50};
		
		System.out.println("�̸�" + "  " + "����" + "  " + "��ħ" + "  " + "�÷�" + "  " + "����");
		System.out.println("-------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " "  + gender[i] + " " + breakfast[i] + " " + eye[i] + " " + age[i] + " ");
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (String s : name) { //for-each
			System.out.print(s + " ");
		}
		System.out.println();
		//char �����ְ�, ���
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		for (char a : gender) {
			System.out.print(a + " ");
		}
		System.out.println();
		//boolean ��ħ �Ծ��� �ְ�, ���
		for (int i = 0; i < breakfast.length; i++) {
			System.out.print(breakfast[i] + " ");
		}
		for (Boolean b : breakfast) {
			System.out.println(b + " ");
		}
		System.out.println();
		//double �÷³ְ�, ���
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		for (double d : eye) {
			System.out.print(d + " ");
		}
		System.out.println();
		//int ���ְ̳�, ���
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		//��������
		//�� �����ȿ��� ��������� ������ ���� �ۿ����� �ν� �Ұ�
		//������ ��������� ��ġ, ���� �ȿ����� ��� ����!
		//������ ���� ��������°�? Ÿ�� ������; = �����Ҷ�! 
		
//		System.out.println(test);
		//test�� ���Ұ� 54���ο����� ���� test�� ��������� ����
		//1. ��Ÿ Ȯ���ϱ�, �ش� ������ �����ϴ��� Ȯ��
		//2. Ư���� �����ȿ��� �� �� �ִ� ���������� �ƴ��� Ȯ��
		//3. ����Ϸ��� �ϴ� ���κ��� �Ʒ����� ����������� �ƴ��� Ȯ��
		int test = 100; //�ش� ���ο��� ������
		System.out.println();
		for (int i : age) {
			System.out.print(i + " ");
			System.out.print(test);
		}
	}
}