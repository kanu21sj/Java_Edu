package 클래스연습;

public class 우리가족계좌사용 {

	public static void main(String[] args) {
		account d = new account();
		account d2 = new account();
		//d, d2: 참조형 변수
		//name, aName, money: 멤버변수가 복사됨.
		//name: 참조형변수
		//aName: 참조형 변수
		//money: 기본형 변수
		d.name = "홍길동";
		d.aName = "튼튼적금";
		d.money = 1000;
		d.deposit(5000);
		
		d2.name = "홍기사";
		d2.aName = "튼튼예금";
		d2.money = 3000;
		d2.withdraw(1000);

	}

}
