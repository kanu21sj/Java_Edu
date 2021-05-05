package bean;

public class DBCP {
	//DBCP(Database Connection Pool): DB와 커넥션을 맺고 있는 객체를 관리하는 역할
	
	static DBCP instance;
	
	//객체가 생성되기 전에 클래스 이름으로 특정하여 사용하는 방법
	//외부에서 DBCP객체를 만들 수 없음. 생성자를 외부 클래스에서 접근할 수 없도록
	//private으로 접근제어 지정(new 객체 생성 불가)
	private DBCP() {
	}
	public static DBCP getInstance() {
		//getInstance라는 static 메소드를 이용하여 싱글톤 객체를 받을 수 있음
		//하지만 싱글톤은 객체를 하나만 가질 수 있으므로 
		//최초 getInstance가 호출되면 instance는 null이므로 new에 의해 DBCP객체가 생성된다.
		//한번 객체가 생성이 되고 나면 instance는 static 변수이기 때문에 그 이후로는 null이 아니다.
		//이후 다시 getInstance 메서드가 호출되면 instance값은 항상 null이 아니므로 이미
		//만들어진 싱글톤 객체인(new DBCP) instance를 리턴하게 된다.
		
		if (instance == null) {
			instance = new DBCP();
		}
		return instance;
	}
}
