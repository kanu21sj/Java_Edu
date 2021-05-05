package 스터디06;

import java.util.Scanner;

public class 리그경기횟수 {

	public static void main(String[] args) {

//		자신을 제외한 모든 팀과 한 경기씩 치루는 리그의 경기의 수 구하기
//		2팀이면 1경기, 3팀이면 3경기, 4팀이면 6경기 치룸
//		정답 예) 4팀 -> 6경기, 10팀 -> 45경기

		Scanner sc = new Scanner(System.in);
		int team = sc.nextInt();

//		nC2 = n(n-1)/2, n개 중 2를 뽑을 경우의 수
		int games = team*(team-1)/2;

		System.out.println(team + "개 팀이 참가한 리그의 경기수는 총 " + games + "경기");
		
		sc.close();
	}
}
