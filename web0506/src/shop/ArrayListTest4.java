package shop;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			//가방을 만들어서
			MemberVO bag = new MemberVO();
			//가방에 값들을 넣은 다음에
			bag.setId(String.valueOf(i)); //int i 값을 string으로 변환 (0 => "0")
			bag.setPw(i + ""); //하나라도 String이면 전체가 String으로 됨.
			bag.setName(i + "");
			bag.setTel(i + "");
			//list(컨테이너)에 넣어라
			list.add(bag);
		}
		System.out.println("리스트의 가방 개수는 " + list.size() + "개");
		
		for (int i = 0; i < list.size(); i++) {
			//컨테이너에서 순서대로 가방을 꺼내줌.
			MemberVO bag2 = list.get(i);
			//가방에 들어있는 값들을 하나씩 꺼내줌.
			System.out.println("가방에서 꺼낸 id는 " + bag2.getId());
			System.out.println("가방에서 꺼낸 pw는 " +bag2.getPw());
			System.out.println("가방에서 꺼낸 name은 " +bag2.getName());
			System.out.println("가방에서 꺼낸 tel은 " +bag2.getTel());
		}
	}

}
