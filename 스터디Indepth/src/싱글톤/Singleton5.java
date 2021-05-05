package bean;

public class Singleton5 {
	
//	5. Bill Pugh Singleton Implementaion
//	   Bill Pugh가 고안한 방식으로, inner static helper class를 사용하는 방식
//	   앞선 방식이 안고 있는 문제점들을 대부분 해결한 방식으로, 현재 가장 널리 쓰이는 싱글톤 구현 방법
	
//	장점: 1, 2번 방식과 달리 SingletonHelper 클래스는 Singleton 클래스가 Load 될 때에도 Load 되지 않다가 
//  	  getInstance()가 호출됐을 때 비로소 JVM(자바가상머신) 메모리에 로드되고, 인스턴스를 생성하게 됨. 
//        synchronized를 사용하지 않아 4번에서의 문제인 성능 저하 또한 해결
	
//	싱글톤을 구현하고자 하는 클래스 내부에 멤버변수로써 private static 객체 변수를 만듦	
    private Singleton5(){
    }
    
//  inner class를 생성하여 싱글톤 인스턴스를 갖게 함.
    private static class SingletonHelper{
     
//    	싱글톤을 구현하고자 하는 클래스 내부에 멤버변수로써 private static 객체 변수를 만듦
//    	또한 객체마다 값이 바뀌지 않는 상수이므로 선언과 동시에 초기화 해주어야 하기 때문에 final로 지정
    	private static final Singleton5 INSTANCE = new Singleton5();
    }
    
//  getInstance 메서드 호출하여 SingletonHelper클래스 내 instance객체 리턴
//  getInstance 호출시 인스턴스 생성(메모리 효율성 UP!)
    public static Singleton5 getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
