package bean;

public class Singleton6 {

//  6. Enum Singleton
//	   Joshua Bloch가 Enum으로 싱글톤을 구현하는 방법을 제안
//	   고정된 상수들만 모아놓은 클래스, 메서드와 생성자 모두 가질 수 있음.
	
//	장점: Thread-safety 와 Serialization이 보장, 또한 Reflection을 통한 공격에 안전하여 싱글톤을 구현하는 가장 좋은 방법
//		  1~5번 싱글톤 방식은 완전히 안전할 수 없음, 왜냐하면 Java의 Reflection을 통해서 싱글톤을 파괴할 수 있기 때문
//	단점: 1, 2번과 같이 사용하지 않았을 경우의 메모리 문제를 해결하지 못한 것과 유연성이 떨어진다는 면에서의 한계
	
	public enum EnumSingleton {
		 
	    INSTANCE;
	    
	    public static void doSomething(){
	    }
	}
}
