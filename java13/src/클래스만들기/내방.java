package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		
		전화기 p1 = new 전화기();
		//p1에는 주소가 들어있음.
		//함수(어떤 특정한 기능)을 사용하고 싶으면
		//객체 생성 후, 생성된 객체의 주소를 통해서
		//함수를 사용할 수 있다.
		p1.전화하다();
		p1.문자하다();
		p1.카톡하다();
		p1.인터넷하다();
	}

}
