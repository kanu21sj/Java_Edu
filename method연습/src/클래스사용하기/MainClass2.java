package 클래스사용하기;

import java.util.ArrayList;

import 클래스사용하기.BbsVO;
import 클래스사용하기.게시판;

public class MainClass2 {

	public static void main(String[] args) {
		
		게시판 board = new 게시판();
		
		String a = board.get("스프링", "봄");
		System.out.println(a);
		
		String[] a2 = board.get();
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + a2.length);
		}
		
		System.out.println();
		 ArrayList<BbsVO> vo = board.get(5);
		 for (BbsVO bbsVO : vo) {
			System.out.println(bbsVO);
		}
	}
}
