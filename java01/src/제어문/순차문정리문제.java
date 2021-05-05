package 제어문;

import javax.swing.JOptionPane;

public class 순차문정리문제 {

	public static void main(String[] args) {
		
		String place = JOptionPane.showInputDialog("여행지를 입력하세요"); 
		String hobby = JOptionPane.showInputDialog("취미를 입력하세요"); 
		
		String place1 = place + "로 ";
		String hobby1 = hobby + "를 즐기러 간다.";
		
		JOptionPane.showMessageDialog(null, "당신은 " + place1 + hobby1);

	}

}
