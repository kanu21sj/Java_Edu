package 순차문;
import javax.swing.JOptionPane;
public class 순차문확인문제 {
	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 입력해주는 부분
		String dessert = JOptionPane.showInputDialog("먹고 싶은 간식은"); // 구매한 간식에 따라 메세지 팝업
		// 처리해주는 부분
		int money = 5000;
		String result = ""; // 입력된 결과에 따라 결과를 보여주기 위한 result 선언
		if (dessert.equals("과자")) {//비교연산자는 기본데이터만을 비교 함.
			result = "어린아이이군요!";
		}else if (dessert.equals("라면")) {
			result = "학생이군요!";
		}else if (dessert.equals("커피")) {
			result = "성인이군요!";
		}else {
			result = "뭔가를 샀군요!";
		}
		// vip yes or no 여부에 따라 money 액수 1000원 할인
		String vip = JOptionPane.showInputDialog("vip 입니까? yes or no");
		String result1 = ""; //vip여부에 따른 result1 선언
		if (vip.equals("yes")) {
			money = money - 1000;
			result1 = "1000원 할인되었습니다.";
		} else {
			result1 = "결재해드리겠습니다.";	
		}
		// 출력해주는 부분
		JOptionPane.showMessageDialog(null,result + result1);
	}
}