package bean;

public class Singleton3 {

//	3. Lazy Initialization
//	   1, 2번 방식과 달리 나중에 초기화 하는 방법
//	   전역적으로 접근한 getInstance() 메소드를 호출할 때에 인스턴스가 없다면 생성함.
	
//  장점: 1, 2번이 가진 문제(사용하지 않을 경우 인스턴스 낭비)에 대한 해결책
//	단점: multi-thread 환경에서 동기화 문제, 만약 인스턴스가 생성되지 않은 시점에서 
//		  여러 쓰레드가 동시에 getInstance()를 호출시 예상치 못한 결과를 얻을 수 있으며,
//		  단 하나의 인스턴스를 생성한다는 싱글톤 패턴에 위반하는 문제점이 야기될 수 있다.
//        그렇기에 이 방법으로 구현을 해도 괜찮은 경우는 single-thread 환경이 보장됐을 때 사용가능!
	
//	싱글톤을 구현하고자 하는 클래스 내부에 멤버변수로써 private static 객체 변수를 만듦	
	 private static Singleton3 instance;
	 
//		생성자를 외부 클래스에서 접근할 수 없도록 private로 접근 제어 지정
	    private Singleton3(){
	    }
	    
	    public static Singleton3 getInstance(){
//		getInstance라는 static 메소드를 이용하여 싱글톤 객체를 받을 수 있음
//		하지만 싱글톤은 객체를 하나만 가질 수 있으므로 
//		최초 getInstance가 호출되면 instance는 null이므로 new에 의해 Singleton3 객체가 생성된다.
//		한번 객체가 생성이 되고 나면 instance는 static 변수이기 때문에 그 이후로는 null이 아니다.
//		이후 다시 getInstance 메서드가 호출되면 instance값은 항상 null이 아니므로 이미
//		만들어진 싱글톤 객체인(new Singleton3) instance를 리턴하게 된다.
	    	
	        if(instance == null){
	            instance = new Singleton3();
	        }
	        return instance;
	    }
}
