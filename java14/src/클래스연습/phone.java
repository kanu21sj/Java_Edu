package 클래스연습;

public class phone {
	//성질:색
		int size;
		String color;//사이즈,색 나중에 가져다 쓰기 위해서 틀을 만들어 놓음.
		
	//동작:전화하다, 문자하다.(멤버메서드)
		public void internet(String x, int y, String z) {
			System.out.println(x + "를 " + z + " " + y + "시간 서핑했다."); //실행시킬 내용(멤버메서드)를 적음
		}
		public void text(String x, String y, int z) {
			//x, y, z 파라미터(매개변수)
			//매개변수는 개수, 타입, 순서가 모두 맞아야 인식!
			System.out.println(x + "에게 " + y + "이라고 " + z + "시에 전화기로 문자하다."); //실행시킬 내용(멤버메서드)를 적음
		}
}
