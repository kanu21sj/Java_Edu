package 스터디01;

import java.util.Scanner;

public class g글자체크 {
	//나는 사람, 너도 사람, 우리도 사람, 모두다 사람을 입력받으면, "사람"단어가 몇 번 나왔는지 프린트
	//결과: 사람(4)
	//향상 문제) 각 단어가 몇 번 나왔는지 프린트
	//결과: 나는(1), 너도(1), 우리도(1), 모두다(1), 사람(4)
	
	public static void main(String[] args){
	
		//콘솔로 입력받아 값을 표출하기 위한 scanner 클래스 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원본 문자열 입력: ");
		//sc 변수에 저장된 입력값을 nextLine()문자열 전체를 입력받음
        String ask = sc.nextLine();
        //쉼표 없애주기 위하여 split 메서드 사용하고 이를 ask2 배열에 String 타입으로 저장
        String [] ask2 = ask.split(",");
        
        
        System.out.println("검색할 단어 입력: ");
        //sc 변수에 저장된 입력값을 
        //next() 문자 또는 문자열 공백을 기준으로 한단어 또는 한문자씩 입력받음
        String word1 = sc.next();
        
        System.out.println("검색할 단어 입력: ");
        String word2 = sc.next();
        System.out.println("검색할 단어 입력: ");
        String word3 = sc.next();
        System.out.println("검색할 단어 입력: ");
        String word4 = sc.next();
        System.out.println("검색할 단어 입력: ");
        String word5 = sc.next();
        
        	int counta = 0;
        	int countb = 0;
        	int countc = 0;
        	int countd = 0;
        	int counte = 0;
        	
        	//count 해주기 위하여 0으로 값 초기화
        	for (int i = 0; i < ask2.length; i++) {
        		//ask2 배열 값만큼 for문 돌림
        		if (ask2[i].contains(word1)) {
        			//입력받은 문자열에서 찾고자 하는 문자열이 
        			//포함되는지 확인하기 위하여 contains 메서드 사용
					counta++;
				}
        		if (ask2[i].contains(word2)) {
					countb++;
				}
        		if (ask2[i].contains(word3)) {
					countc++;
				}
        		if (ask2[i].contains(word4)) {
					countd++;
				}
        		if (ask2[i].contains(word5)) {
					counte++;
				}
        	}
        	System.out.println(word1 + "의 빈도수: " + counta);
        	System.out.println(word2 + "의 빈도수: " + countb);
        	System.out.println(word3 + "의 빈도수: " + countc);
        	System.out.println(word4 + "의 빈도수: " + countd);
        	System.out.println(word5 + "의 빈도수: " + counte);
        	
        	sc.close(); 
        	//JVM(java Virtual Machine)에 의해서 자동관리 되어 상관은 없지만 오류마크 지우기 위해서
        }
	}