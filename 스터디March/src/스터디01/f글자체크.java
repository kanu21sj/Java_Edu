package 스터디01;

import java.util.Scanner;

public class f글자체크 {
	//aabbbcc를 입력받으면 알파벳이 각각 몇글자인지 체크하는 프로그램을 완성하시오.
	//결과: a(2), b(3), c(2)

	public static void main(String[] args) {
		
		//콘솔로 입력받아 값을 표출하기 위한 scanner 클래스 사용
		Scanner sc = new Scanner(System.in); 
		//입력받은 값을 스트링 타입으로 저장해주기 위한 변수 선언

		System.out.println("문자를 입력하세요: ");
		//sc 변수에 저장된 입력값을 next() 문자 또는 문자열 공백을 기준으로 한단어 또는 한문자씩 입력받음
		String ask = sc.nextLine();
		
		char[] ch = ask.toCharArray(); //입력받은 string을 char로 변환시켜 배열에 넣기
		//toCharArray의 반환값은 char의 배열이기때문에 반드시 char의 배열로 받아줘야 한다
		
		//개수를 카운트 하기위해 int타입 count 0으로 초기화
		int counta = 0;
		int countb = 0;
		int countc = 0;
		
		//for문 사용하여 ask로 받은 입력값의 길이내 찾을 단어 검색
		for (int i = 0; i < ask.length(); i++) {
			if (ch[i] == 'a') {
				counta++;
			}
			if (ch[i] == 'b') {
				countb++;
			}
			if (ch[i] == 'c') {
				countc++;
			}
		}
		System.out.println("검색한 a의 개수는 " + counta + "개");
		System.out.println("검색한 b의 개수는 " + countb + "개");
		System.out.println("검색한 c의 개수는 " + countc + "개");
		
		sc.close();
		//JVM(java Virtual Machine)에 의해서 자동관리 되어 상관은 없지만 오류마크 지우기 위해서
	}
	
}
