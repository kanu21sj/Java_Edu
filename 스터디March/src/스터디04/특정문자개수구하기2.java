package 스터디04;

import java.util.Scanner;

public class 특정문자개수구하기2 {

	public static void main(String[] args) {
		
		System.out.print("문자열을 입력하세요 :");
		
		//스캐너로 입력받기
		Scanner sc = new Scanner(System.in);
		
		//엔터를 치기전까지 입력된 데이터들을 string으로 리턴
		String str = sc.nextLine();
		
		//글자가 50글자를 넘을경우 다시 입력받음
		while (str.length()> 50) {
			
			System.out.print("50자보다 많습니다. 다시 입력하세요 :");
			str = sc.nextLine();
		}
		
		//개수를 세고싶은 문자 입력받기
		System.out.print("찾을 문자를 입력하세요 : ");	
		
		char a =sc.nextLine().charAt(0);
		
		int count = 0;
		
		//문자열의 길이만큼 for문 반복
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		System.out.println("문자의 개수는 : " + count);
		sc.close(); 

	}

}
