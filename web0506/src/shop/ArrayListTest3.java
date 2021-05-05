package shop;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) { //3번 하고 싶은일 입력하게 하기
			String data = JOptionPane.showInputDialog("하고 싶은 일 입력");
 			list.add(data); //입력된 data 값을 list에 집어넣기
		}
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) { //입력 개수 만큼 돌려서 출력하기
			System.out.println(i + ": " + list.get(i));
		}
	}

}
