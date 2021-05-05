package 배열기본;

public class 배열만들기연습2 {

	public static void main(String[] args) {
		//2. 스트링 3개 크기의 배열을 만들어서 자바, 스프링, jsp를 순서대로 넣는다.
		// => "자바 보다는 스프링"로 출력
		String [] array = new String[3];
		array[0] = "자바";
		array[1] = "스프링";
		array[2] = "jsp";		
		for (int i = 0; i < array.length; i++) {
			
	}
		System.out.println(array[0] + " 보다는 " + array[1]);
}
}