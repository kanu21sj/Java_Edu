package 어제복습;

public class 문자한개조건비교 {

	public static void main(String[] args) {
		//한글자이면 char를 사용하는 것이 좋다.
		
		char pw1 = 'p';
		char pw2 = 'q';
		//비교연산자는 기본형만 쓸 수 있음.
		if (pw1 == pw2) { //true 이면 밑에를 실행해라
			System.out.println("PASS");
		} else { //false 이면 밑에를 실행해라
			System.out.println("재입력");
			
		double change = 2.2;
		if (change > 2) {
			System.out.println("다이어트 성공");	
			} 
						
		if (pw1 == pw2 && change > 2) {
			System.out.println("오늘은 성공!");
			
		} else {
			System.out.println("아니면 내일 다시 도전!");
		}

		}//else end
				
	}//main end

}//class end