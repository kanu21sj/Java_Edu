package pack02;

public class Test01 {

	public static void main(String[] args) {
		int[] num = new int[1000]; //int값이 1000개 들어갈 수 있는 배열 선언
		
		num[1] = 100; //첫번째 위치헤 100
		num[5] = 200; //다섯번째 위치에 200
		num[10] = 300;//열번째 위치헤 300
		num[num.length-1] = 500; //마지막 위치에 500을 넣음
		
		int count = 0; 
		for (int i = 0; i < num.length; i++) { //배열에 들어있는 값들의 개수를 카운트 위해 for문 선언
			if (num[i] > 0) { //0보다 큰 값이 있을 경우 카운트 하기
				count++;
			}
		}
		System.out.println("배열에 들어있는 값들의 개수는 " + count + "개");
		for (int i = 0; i < num.length; i++) { //for문을 선언하여 위치별 값이 들어있는 것 프린트
			if (num[i] == 100) { //100이 들어있는 경우 위치와 값 프린트
				count++;
				System.out.println(i + "번째 위치: " + num[i]);
			}
			if (num[i] == 200) {//200이 들어있는 경우 위치와 값 프린트
				count++;
				System.out.println(i + "번째 위치: " + num[i]);
			}
			if (num[i] == 300) {//300이 들어있는 경우 위치와 값 프린트
				count++;
				System.out.println(i + "번째 위치: " + num[i]);
			}
			if (num[i] == 500) {//500이 들어있는 경우 위치와 값 프린트
				count++;
				System.out.println(i + "번째 위치: " + num[i]);
			}
		}
	}
}