package 형변환;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 참조형형변환4 {

	public static void main(String[] args) {
		//객체설계할 때 2대 원칙(이를 지켜야 좋은코드!)
		//하나의 클래스안에는 하나의 역할만을 정의해야 한다. => 응집도(cohesion) 높게!
		//결합시 특정한 클래스만 지정하여 설계하면 안된다. => 결합도(Coupling) 낮게!
		맨 m = new 맨(); 
		
		//하나의 이름으로 다양한 형태를 구현하여 사용하는 자바의 특징
		//자동 형변환으로 가능, 오버로딩(다형성)
		사람 m2 = new 맨(); //권장하는 코드! => 결합도가 낮은 코드!
		m2 = new 우먼();
		m2 = new 수퍼맨();
		//결합도가 낮은 코드는 유지보수 하기 좋고, 더 좋은 성능을 가진 클래스로 변경도 용이!
		//작업량도 줄일 수 있다.
		
		ArrayList list2 = new ArrayList();
		
		List list = new ArrayList(); //더 좋은 코드, ArrayList가 가진 메서드를 전부 사용할 수 있음
		list = new LinkedList();
	}

}
