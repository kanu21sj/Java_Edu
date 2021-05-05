package 스터디04;

import java.util.Scanner;

public class 특정문자개수구하기 {

	public static void main(String[] args) {
		
		// 임의의 문장에서 입력된 문장내 특정 문자의 개수 구하기
		
		// 문자열 입력
		Scanner sc = new Scanner(System.in);
		// 문자열 검색을 위해 스트링 타입으로 캐스팅
		String word = sc.nextLine();
		
		// 문자열을 배열로 넣은 뒤 입력받은 word 변수를 split 함수를 사용해 단어 하나씩 쪼갠다.
		// charAt으로 단어 하나씩 분리
		String[] word1 = word.split("");
		
		// 검색할 문자 임력
		Scanner sc2 = new Scanner(System.in);
		// 검색할 문자를 스트링 타입으로 캐스팅
		String find = sc2.nextLine();

		int count = 0;
		
		// 배열에 넣은 문자열을 for문으로 돌리고 검색할 문자가 문자열에 있으면 카운트
		for (int i = 0; i < word1.length; i++) {
			if (word1[i].equals(find)) {
				count++;
			}
		}
		System.out.println("문자>> " + word + "에 문자 " + find + " 가 포함된 개수는 총" + count + " 개");
		sc.close();
	}
}
