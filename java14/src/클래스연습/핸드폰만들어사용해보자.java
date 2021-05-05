package 클래스연습;

public class 핸드폰만들어사용해보자 {

	public static void main(String[] args) {
		phone p = new phone();
		//p: 참조형 변수
		//size, color: 멤버변수가 복사됨.
		//size: 기본형 변수
		//color: 참조형 변수
		p.size = 11; //p.size, color p의 주소로 접근하는 연산자 (.)
		p.color = "검정색"; 
		System.out.println("전화기 크기: " + p.size);		
		System.out.println("전화기 색: " + p.color);		
		p.text("철수", "굿모닝", 10);
		p.text("길동이", "굿에프터눈", 15);
		p.internet("네이버", 10, "어제");

	}

}
