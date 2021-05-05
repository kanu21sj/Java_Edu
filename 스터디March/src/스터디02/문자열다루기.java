package 스터디02;

public class 문자열다루기 {

	public boolean solution1(String s) {
		//도출값이 true, false 이므로 void가 아닌 boolean
		
		boolean answer = false;
		//answer값 초기화
		
		if (s.length() == 4 || s.length() == 6) {
			//길이가 4 또는 6인지 확인
			answer = true;
			//맞을경우 true
		}
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				//문자 배열을 charAt 함수를 사용하여 낱개로 배열
				if (!(ch >=0 && ch <= '9'))
					//!: 부정연산자 true => false로, false => true로
					//ch가 0~9인 숫자 범위내에 있지 않으면 문자로 인식하고 false처리
					answer = false;
		}
			return answer;
	}
	
	public boolean solution2(String s) {
		
		boolean answer = false; //초기화
		if (s.length()==4 || s.length()==6) {
			//길이가 4 또는 6인지 확인

			answer = s.matches("^[0-9]*$");
			//matches: 특정 패턴(정규표현식)의 문자열 포함하는지 확인
			// ^: 시작
			// [0-9]: 숫자로만
			// *: 검사시작 
			// $: 패턴 종료
		}
		return answer;	
	}
	public static void main(String[] args) {
		문자열다루기 s = new 문자열다루기();
		System.out.println("a123: " + s.solution1("a123"));
		System.out.println("1234: " + s.solution1("1234"));
		System.out.println("a12345: " + s.solution1("a12345"));
		System.out.println("123456: " + s.solution1("123456"));
		System.out.println("==============================");
		System.out.println("a123: " + s.solution2("a123"));
		System.out.println("1234: " + s.solution2("1234"));
		System.out.println("12345: " + s.solution2("12345"));
		System.out.println("a12345: " + s.solution2("a12345"));
		System.out.println("a12345: " + s.solution2("123456"));	}
}
