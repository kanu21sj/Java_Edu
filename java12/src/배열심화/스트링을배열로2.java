package 배열심화;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		// 1. String[]로 바꾸어보세요.
		String[] s = all.split(",");

		// 2. 바꾸었을때 공백이 포함되어 있다면, 공백을 모두 제거 후, 다시 배열에 넣으세요
		for (int i = 0; i < s.length; i++) { // for문으로 하나씩 가져와서
			s[i] = s[i].trim(); // 공백을 없애고 변수s에 다시 집어넣는 작업 반복
		}
		// 3. 과목수는?
		System.out.println("과목수는 " + s.length + "과목");

		// 4. 컴퓨터의 위치는?
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("컴퓨터")) { // 변수s 안에 있는 "컴퓨터" index(위치) 찾기
				System.out.println("컴퓨터 위치는 인덱스 >>> " + i);
			}
			// 5. 과목명이 3글자 미만인 과목수는?
			if (s[i].length() < 3) {
				count++;
			}
		}
		System.out.println("과목명 3글자 미만인 과목수는 >>> " + count);
		System.out.println("-------------------------");

		String s1 = "나는 프로그래머야";
		String s2 = "진짜!!";
		System.out.println(s1 + s2); // 스트링 결합
		System.out.println(s1.concat(s2)); // 스트링 결합
		System.out.println(s1.charAt(0)); // 문자 1글자 추출
		System.out.println(s1.endsWith("야")); // 특정한 문자로 끝나는지 확인
		System.out.println(s1.substring(3)); // 인덱스 3이후 글자들 모두 추출
		System.out.println(s1.substring(3, 8)); // 인덱스 3~7까지 모두 추출
		System.out.println(s1.contains(s2)); // s1에 s2가 포함되어 있는지?
		System.out.println(s1.lastIndexOf("프")); // s1중 프 글자 위치
		System.out.println(s1.toUpperCase());// 대문자로
		System.out.println(s1.toLowerCase());// 소문자로
		System.out.println(s1.length()); // 글자수
		System.out.println(s1.replace("나", "너")); // s1 "나"를 "너"로 바꿈
	}
}