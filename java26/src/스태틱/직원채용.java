package 스태틱;

public class 직원채용 {

	public static void main(String[] args) {
		
		직원 t1 = new 직원("홍길동", "남", 25);
		직원 t2 = new 직원("김길동", "여", 26);
		직원 t3 = new 직원("송길동", "남", 27);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println("모든 직원의 수는 " + 직원.count + "명");
//		System.out.println("모든 직원의 평균 나이는 " + (double)직원.sum/직원.count + "세");
		직원.getAvg();
	}

}
