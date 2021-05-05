package 스터디03;

public class 비트연산 {

	public static void main(String[] args) {
		
//	비트연산자: 데이터를 비트 단위로 연산. 
//	0과 1로 표현이 가능한 정수 타입이나 정수형으로 캐스팅이 가능한 자료형만 비트 연산이 가능

//	1. AND: 두 비트 모두 1일 경우에만 연산 결과가 1
	System.out.println("15 & 25 = " + (15 & 25));
		
//	2. OR: 두 비트 중 하나만 1일 경우에만 연산결과가 1
	System.out.println("15 | 25 = " + (15 | 25));
		
//	3. XOR: 두 비트중 하나는 1이고 다른 하나가 0일 경우에만 연산결과가 1
	System.out.println("15 ^ 25 = " + (15 ^ 25));

	}

}
