package 스터디03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 비트연산2 {

	public static void main(String[] args) throws IOException{
		
		//system.in = 콘솔에서 입력을 받는다.
		//inputstreamreader = 바이트단위 스트림데이터를 문자 단위 스트림데이터로 처리할 수 있도록 변환.
		//bufferedreader = 문자 단위 스트림데이터를 문자열데이터로 처리해줌
		
		System.out.print("문자열을 입력하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine(); //readLine = 데이터 한줄을 읽어서 string으로 꺼내줌(공백포함)
		
		//string으로 split해주기
		String[] strList = input1.split(" ");
		int x = Integer.parseInt(strList[0]);
		int y = Integer.parseInt(strList[1]);
		
		//toBinaryString = int 10진법 숫자를 2진법 string으로 반환해줌
		System.out.println("입력된 숫자 1 > " + Integer.toBinaryString(x));
		System.out.println("입력된 숫자 2 > " + Integer.toBinaryString(y));
		
		//비트연산 출력
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);

	}

}
