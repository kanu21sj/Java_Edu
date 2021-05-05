package bean;

public class SingletonUsage {

	public static void main(String[] args) {
		
		//Singleton singleton = new Singleton();
		//싱글톤에서는 new메서드를 통한 객체 생성이 불가
		//getInstance 메서드를 통해 객체를 생성할 수 있다.
		Singleton1 singleton1 = Singleton1.getInstance();
		Singleton1 singleton2 = Singleton1.getInstance();

		Singleton2 singleton3 = Singleton2.getInstance();
		Singleton2 singleton4 = Singleton2.getInstance();
		
		Singleton3 singleton5 = Singleton3.getInstance();
		Singleton3 singleton6 = Singleton3.getInstance();
		
		Singleton4 singleton7 = Singleton4.getInstance();
		Singleton4 singleton8 = Singleton4.getInstance();
		
		Singleton5 singleton9 = Singleton5.getInstance();
		Singleton5 singleton10 = Singleton5.getInstance();

		
		//싱글톤의 경우 객체 생성은 하나만 가능하기 때문에
		//각각의 변수에 담긴 주소의 값도 동일한 주소를 가짐.
		
		// => 싱글톤을 활용하여 한번의 객체 생성으로 재사용이 가능하여 메모리 낭비를 방지할 수 있음.
		//	  또한 한번 생성으로 전역성을 띄기 때문에 다른 객체와 공유가 용이하다.
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println("=========================");
		System.out.println(singleton3);
		System.out.println(singleton4);
		System.out.println("=========================");
		System.out.println(singleton5);
		System.out.println(singleton6);
		System.out.println("=========================");
		System.out.println(singleton7);
		System.out.println(singleton8);
		System.out.println("=========================");
		System.out.println(singleton9);
		System.out.println(singleton10);
	}
}
