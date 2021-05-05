package 배열응용;

import javax.swing.JOptionPane;

public class 여러개숫자입력 {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0, 0, 0}
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력하세요"); //"100"
			// num[i] = data; 캐스팅은 기본형=기본형끼리, 참조형=참조형끼리만 가능
			//String --> int : Integer.parseInt로 캐스팅 필요
			int data2 = Integer.parseInt(data); //"100" -> 100
			//실수인 경우, double d = Double.parseDouble(data);
			num[i] = data2;
		}
		for (int x : num) { //for-each문 사용하여 하나씩 출력
			System.out.print(x + " "); //변수 x값 출력
		}
		//초기화되지 않은 변수의 상태 : 쓰레기 상태
		int sum = 0; //변수만들어서 처음값을 넣어주는 것 => 초기화!
		//변수만들 때 초기화를 꼭 해주어야 한다.
		
		for (int x : num) { 
			sum = x + sum; //합계 값을 구하기 위해 sum 선언
		}
		System.out.print(String.format("%.2f", sum / (double)num.length)); //%.2f 소수점 2자리까지 반올림 해줌
		
		
	}

}
