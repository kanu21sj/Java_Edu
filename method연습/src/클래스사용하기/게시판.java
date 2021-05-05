package 클래스사용하기;

import java.util.ArrayList;

public class 게시판 {
	
	public String get(String title, String content) {
		return "제목은 " + title + " 내용은 " + content;
	}
	
	public String[] get() {
		String[] array = {"자바", "스프링", "장고"};
		return array;
	}
	
	
	public ArrayList<BbsVO> get(int count) {
		ArrayList<BbsVO> all = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			BbsVO vo = new BbsVO();
			vo.setContent("스프링" + i);
			vo.setTitle("봄" + i);
			vo.setId(" " + i);
			all.add(vo);
		}
		return all;
	}
}
