package 조건문;

public class 연습210203 {

	public static void main(String[] args) {
		int score = 93;
		String result = "";
		
		if (score >= 90) {
			result = "A학점";
			
		} else if (score >= 80) {
			result = "B학점";
		} else if (score >= 70) {
			result = "C학점";
		} else if (score >= 60) {
			result = "D학점";
		} else {
			result = "E학점";
		}

		System.out.println("당신의 학점은 " + result);
	}

}
