package ���ǹ�;

public class ����210203 {

	public static void main(String[] args) {
		int score = 93;
		String result = "";
		
		if (score >= 90) {
			result = "A����";
			
		} else if (score >= 80) {
			result = "B����";
		} else if (score >= 70) {
			result = "C����";
		} else if (score >= 60) {
			result = "D����";
		} else {
			result = "E����";
		}

		System.out.println("����� ������ " + result);
	}

}
