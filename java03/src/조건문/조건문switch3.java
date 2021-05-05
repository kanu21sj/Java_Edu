package 조건문;

import javax.swing.JOptionPane;

public class 조건문switch3 {

	public static void main(String[] args) {
		String food = "자장면";
		switch (food) {
		case "자장면": //String이기 때문에 ""써 주어야 함, 분식으로 쓰게 되면 변수가 됨
			System.out.println("중국집으로 가요");
			break;
		case "라면": 
			System.out.println("분식집으로 가요");
			break;
		case "회": 
			System.out.println("오른쪽으로");
			break;
		default: // if문의 else에 해당
			System.out.println("그냥 안먹어요");
			break;
		}
			
		}

	}