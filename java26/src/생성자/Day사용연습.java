package 생성자;

public class Day사용연습 {

	public static void main(String[] args) {
		
		Day연습 day1 = new Day연습("자바공부", 10, "강남");
		System.out.println(day1);
		Day연습 day2 = new Day연습("여행", 15, "강원도");
		System.out.println(day2);
		Day연습 day3 = new Day연습("운동", 11, "피트니스");
		System.out.println(day3);
		
		//전체 하는 일의 시간은?
		int sum = day1.time + day2.time + day3.time;
		System.out.println("전체 하는 일의 시간은 " + sum + "시간");
		
		//평균 하는 일의 시간은?
		double average = sum/3;
		System.out.println("평균 하는 일의 시간은 " + average + "시간");
		
		//매일 무엇을 얼마나 어디에서 했는지 프린트
		System.out.println("첫째날 " + day1.task + "를 " + day1.time + "시간동안 " + day1.place + "에서 했다.");
		System.out.println("둘째날 " + day2.task + "을 " + day2.time + "시간동안 " + day2.place + "에서 했다.");
		System.out.println("셋째날 " + day3.task + "을 " + day3.time + "시간동안 " + day3.place + "에서 했다.");
		
		//며칠 간 했는지?
		
	}

}
