package 스터디01;

public class b이중for문사용 {
	//이중 for문을 이용한 구구단 찍기 1~9단까지 정렬해서 찍히도록	

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) { 
			//i=1부터 숫자1씩 증가하여 9까지 반복되는 for문 사용
			System.out.print("[" + i + "단]\t" + "\t");
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i++) { 
			//i=1부터 숫자1씩 증가하여 9까지 반복되는 for문 사용
			for (int j = 1; j <= 9; j++) {
				//i가 n일때 j부터 숫자1씩 증가하여 9까지 반복되는 for문 사용
				System.out.print(j + " x " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
		

	}

}
