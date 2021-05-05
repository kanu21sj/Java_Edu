package bean;

public class Singleton4 {
	
//	4. Thread Safe Singleton
//	   3번의 문제를 해결하기 위한 방법, getInstance() 메소드에 synchronized를 걸어두는 방식
//	   synchronized 키워드는 임계 영역(Critical Section)을 형성해 해당 영역에 오직 하나의 쓰레드만 접근 가능하게 
//	   (임계영역: 두개 이상의 쓰레드가 특정 자원을 공유하고 있을 때 한번에 하나의 쓰레드에게만 접근을 허용하고자 하는 영역을 말함)
	
//  장점: getInstance() 메소드 내에 진입하는 쓰레드가 하나로 보장받기 때문에 멀티 쓰레드 환경에서도 정상 동작하게 됨.
//  단점: synchronized 키워드 자체에 대한 비용이 크기 때문에 싱글톤 인스턴스 호출이 잦은 web, app의 성능이 떨어지게 된다.
	
//	싱글톤을 구현하고자 하는 클래스 내부에 멤버변수로써 private static 객체 변수를 만듦	
    private static Singleton4 instance;
    
//	생성자를 외부 클래스에서 접근할 수 없도록 private로 접근 제어 지정
    private Singleton4(){
    }
    
//	임계영역 처리를 위해 getInstance() 메소드명 앞 synchronized 키워드를 붙이면 
//  특정 쓰레드가 공유자원에 접근하면 바로 락을 걸어 다른 쓰레드가 접근 할 수 없도록 하고 
//  처리가 끝나면 락을 풀어 다른 쓰레드가 접근 할 수 있도록 처리됨.
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
    
//  Thread Safe Singleton 문제를 보완하기 위한 double checked locking.
//  getInstance() 메소드에 lock을 걸지 않고 instance가 null일 경우에만 synchronized가 동작하도록 구현.
//  이에 따라, web, app의 효율성이 떨어지는 것을 보완할 수 있다.
    public static Singleton4 getInstance1(){
    	
        if(instance == null){

//      싱글톤 객체인 instance가 null일 경우 Singleton4 싱글톤 클래스에 접근하여 synchronized가 동작하도록
            synchronized (Singleton4.class) {
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
