package 상속;

public class Company {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.name = "홍길동";
		e.address = "서울시";
		e.salary = 300;
		//e.rrn = 19890528;
		System.out.println(e);
		
		Manager m = new Manager();
		m.name = "김길동";
		m.address = "경기도";
		m.salary = 500;
		//m.rrn = 19790528;
		//m.bonus: 외부 다른 클래스에서 안보이게 할 수 있음.
		System.out.println(m);
		m.test();
	}
}
