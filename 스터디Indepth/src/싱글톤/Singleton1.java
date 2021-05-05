package bean;

public class Singleton1 {
	
//	1. Eager Initialization
//	   가장 간단한 형태의 구현 방법이며, 싱글톤 클래스의 인스턴스를 클래스 로딩 단계에서 생성하는 방법.
//	   그러나 어플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 낭비가 발생할 수 있음.
	
//	싱글톤을 구현하고자 하는 클래스 내부에 멤버변수로써 private static 객체 변수를 만듦
//	또한 객체마다 값이 바뀌지 않는 상수이므로 선언과 동시에 초기화 해주어야 하기 때문에 final로 지정
	private static final Singleton1 instance = new Singleton1();
	
//	생성자를 외부 클래스에서 접근할 수 없도록 private로 접근 제어 지정
	private Singleton1() {
	}
	
//  getInstance 메서드 static 메소드를 이용하여 싱글톤 객체를 받을 수 있음
//	하지만, 싱글톤을 객체를 하나만 가질 수 있으므로 최초 getInstance가 호출되면 instance는 null이다.
//	그러나 new에 의해 Singleton 객체가 생성되고 한번 객체가 생성되고 나면
//	instance는 static 변수이기 때문에 그 이후로 다시 getInstance 메서드가 호출되면
//	instance값은 null이 아니게 되므로 이미 만들어진 싱글톤 객체인 instance를 리턴하게 됨.
	public static Singleton1 getInstance() {
		return instance;
	}
}