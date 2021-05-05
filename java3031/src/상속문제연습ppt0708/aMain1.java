package 상속문제연습ppt0708;

public class aMain1 {

	public static void main(String[] args) {
		
		aTruck truck = new aTruck(); 
		//Truck 객체 생성, Car로부터 상속받은 멤버변수 및 멤버메서드와 Truck 클래스의 멤버변수 및 메서드 사용
		truck.color = "black"; //Car로 부터 상속받은 멤버변수 값 설정
		truck.people = 5; //Car로부터 상속받은 멤버변수 값 설정
		truck.weight = 1000; //Truck에서 설정한 멤버변수 값 설정
		truck.start(); //Car로부터 상속받은 멤버메서드 실행
		truck.stop(); //Car로부터 상속받은 멤버메서드 실행
		truck.load(); //Truck 멤버메서드 실행
		System.out.println(truck);
		
		System.out.println("-----------------------------------------------------------------");
		
		aSedan sedan = new aSedan(); 
		//Sedan 객체 생성, Car로부터 상속받은 멤버변수 및 멤버메서드와 Sedan 클래스의 멤버변수 및 메서드 사용
		sedan.color = "white"; //Car로부터 상속받은 멤버변수 값 설정
		sedan.people = 4; //Car로부터 상속받은 멤버변수 값 설정
		sedan.speed = 100; //Sedan에서 설정한 멤버변수 값 설정
		sedan.start(); //Car로부터 상속받은 멤버메서드 실행
		sedan.stop(); //Car로부터 상속받은 멤버메서드 실행
		sedan.velocity(); //Sedan 멤버메서드 실행
		System.out.println(sedan);
	}

}
