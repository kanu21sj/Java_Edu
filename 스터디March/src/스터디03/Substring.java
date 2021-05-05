package 스터디03;

public class Substring {

	public static void main(String[] args) {
		
		String str = "I Love Goorm !";
		
		//str.substring(start) => start위치부터 끝까지 문자열 자르기
		System.out.println(str.substring(0));
		
		//str.substring(start, end) => start위치 부터 end전까지 문자열 발췌
		System.out.println(str.substring(2, 12));
		
		String str2 = "I Love You";
		System.out.println(str2.substring(2, 6));
		
		String str3 = "Goorm EDU";
		System.out.println(str3.substring(2, 7));


	}

}
