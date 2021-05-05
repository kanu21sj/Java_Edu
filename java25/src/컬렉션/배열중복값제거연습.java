package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 배열중복값제거연습 {

	public static void main(String[] args) {
		
		ArrayList run = new ArrayList();
		run.add("박소정");
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");
		System.out.println("2등이 반칙해서 탈락함");
		run.remove(2);
		for (int i = 0; i < run.size(); i++) {
			System.out.println((i+1) + "등: " + run.get(i));
		}
		HashMap data = new HashMap();
		data.put(100, "김데이");
		data.put(200, "김사전");
		data.put(300, "김구조");
		data.put(400, "김자료");
		System.out.println("200번 고객 탈퇴 300번 고객 개명(김충성)");
		data.remove(200);
		data.put(300, "김충성");
		System.out.println(data);
		
		HashSet team = new HashSet();
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("프로젝트매니저");
		team.add("웹디자이너");
		System.out.println(team);
		
		String [] place = {"유럽","일본","필리핀","캐나다","미국"};
		HashSet set = new HashSet();
		for (int i = 0; i < place.length; i++) {
			set.add(place[i]);
		}
		System.out.println(set);
	}

}
