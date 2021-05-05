package 생성자;

public class 계좌사용 {

	public static void main(String[] args) {
		
		계좌 acc1 = new 계좌("홍길동", "튼튼적금", 10000);
		System.out.println(acc1);
		계좌 acc2 = new 계좌("박길동", "튼튼예근", 20000);
		System.out.println(acc2);
		계좌 acc3 = new 계좌("홍기사", "다음적금", 30000);
		System.out.println(acc3);

	}

}
