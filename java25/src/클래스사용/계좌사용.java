package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 account = new 계좌();
		account.name = "박길동";
		account.type = "적금";
		account.amount = 1000;
		System.out.println(account);
		account.input("정길동", "예금", 10000);
		account.input("박길동", 5000);
		account.output(10000);
	}
}
