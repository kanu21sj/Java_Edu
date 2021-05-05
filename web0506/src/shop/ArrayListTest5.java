package shop;

import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		ArrayList<BoardVO> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			//가방을 만들어서
			BoardVO bag = new BoardVO();
			//가방에 값들을 넣은 다음에
			bag.setId(i + ""); //하나라도 String이면 전체가 String으로 됨.
			bag.setTitle(i + "");
			bag.setContent(i + "");
			bag.setWriter(i + "");
			//list(컨테이너)에 넣기
			list.add(bag);
		}
		System.out.println("리스트의 가방 개수는 " + list.size() + "개");
		
		for (int i = 0; i < list.size(); i++) {
			//컨테이너에서 순서대로 가방을 꺼내줌.
			BoardVO bag2 = list.get(i);
			//가방에 들어있는 값들을 하나씩 꺼내줌.
			System.out.println("가방에서 꺼낸 id는 " + bag2.getId());
			System.out.println("가방에서 꺼낸 title은 " + bag2.getTitle());
			System.out.println("가방에서 꺼낸 content는 " + bag2.getContent());
			System.out.println("가방에서 꺼낸 writer는 " + bag2.getWriter());
		}
	}

}
