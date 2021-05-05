package pack04; //pack04 패키지

public class ComputerUse { //ComputerUse 클래스 생성

	public static void main(String[] args) {
		
		//com1 객체 생성 및 변수값 입력
		Computer com1 = new Computer(100, "red", "ABC"); 
		//com2 객체 생성 및 변수값 입력
		Computer com2 = new Computer(150, "green", "CHOCO"); 
		
		//각 객체의 멤버변수값 출력
		System.out.println(com1);
		System.out.println(com2);
		
		//com1 클래스에 속한 멤버메서드 on 출력
		com1.on();
		//com2 클래스에 속한 멤버메서드 off 출력
		com2.off();
	}

}
