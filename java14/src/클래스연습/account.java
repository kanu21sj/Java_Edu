package 클래스연습;

public class account {
	//계좌를 사용하기 위해서 필요한 속성값
	String name;//이름
	String aName;//계좌이름
	int money;//금액
	//자바에서 변수는 언제 만들어지나?
	//타입 변수명;(선언) -> 선언할 때 변수가 만들어진다.
	//선언의 위치가 변수를 사용할 수 있는 범위가 된다.
	//클래스 아래에서 선언됨 -> 클래스 전역에서 사용 가능(전역변수, 글로벌 변수)
	//전역변수는 자동초기화 됨.
	
//동작:입급하다, 출금하다.(멤버메서드)
	public void deposit(int x) {
		System.out.println("계좌로 입금하다."); //실행시킬 내용(멤버메서드)를 적음
		System.out.println(money + x + "원"); 
	}
	public void withdraw(int x) {
		System.out.println("계좌에서 출금하다."); //실행시킬 내용(멤버메서드)를 적음
		System.out.println(money - x + "원");
	}
}
