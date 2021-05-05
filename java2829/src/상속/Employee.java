package 상속;

public class Employee {
	
	public String name; //public 아무곳이나 접근 가능
	String address; //default(x) 같은 패키지 내에서만 접근 가능
	protected int salary; //상속받은곳에서 가능
	private int rrn; //클래스안에서만 접근 가능 
	//rrn: 주민번호
	
	//1. 아무것도 상속받지 않은 클래스는 무조건 Object틔 상속을 받는다.
	//2. 원래 toString()는 기본형인 경우에 값을, 참조형인 경우에 "주소"를 프린트해줌
	//3. 참조형인 경우 주소말고 내가 원하는 멤버변수값을 프린트하고자 하는 경우, 재정의해주세요!
	//4. 오버라이드: 원래 부모가 가지고 있던 모양과 똑같이 써줌.
	@Override
	public String toString() {
		return "Emplyoee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
