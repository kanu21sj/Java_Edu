package bean;

public class Singleton2 {
	
//	2. Static Block Initialization
//	   Eager Initializaion과 유사하지만 static block을 통해서 Exception Handling에 대한 옵션을 제공
//	   (Eager Initialization과 동일하게 큰 리소스를 다루는 경우 적합하지 않음)
	
//	싱글톤을 구현하고자 하는 클래스 내부에 멤버변수로써 private static 객체 변수를 만듦
	private static Singleton2 instance;
	
//	생성자를 외부 클래스에서 접근할 수 없도록 private로 접근 제어 지정
	private Singleton2() {	
	}
	
// 	예외처리
	static {
		try {

//			오류가 없을 경우 인스턴스 객체 생성
			instance = new Singleton2();
			
//			오류가 있을 경우 아래와 같이 처리
		} catch (Exception e) {
			throw new RuntimeException("싱글톤 인스턴스 생성시 예외가 발생함");
		}
	}

//  getInstance 메서드 호출하여 instance객체 리턴
    public static Singleton2 getInstance(){
        return instance;
    }
}
