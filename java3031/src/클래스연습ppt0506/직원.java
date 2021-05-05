package 클래스연습ppt0506;

public class 직원 { //직원 생성자 클래스 생성
	//생성자: 객체를 생성할 때 실행되는 것으로, 객체를 초기화해주기 위해 맨 처음 실행되는 메서드.
	//        반환유무를 쓰지 않음, 무조건 void
	//생성자는 입력값을 한꺼번에 넣고 싶을 때 사용!
	//클래스이름과 동일하며, new를 할때마다 자동으로 호출됨
	
	String name; //멤버변수 생성
	int age;
	String phone;
	
	public 직원(String name, int age, String phone) {
		//멤버 변수값 초기화
		//직원 클래스 public 설정하여 다른 클래스에서 사용할 수 있도록 설정
		//파라미터 값, 멤버변수와 동일하게 설정
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override //toString으로 메서드 재정의
	public String toString() {
		return "[직원의 이름은 " + name + "이며, 나이는 " + age + "이고, 전화번호는" + phone + "입니다.]";
	}
	
}
