package 반복문;

import javax.swing.JOptionPane;

public class 순차문정리 {

	public static void main(String[] args) {
		String place = JOptionPane.showInputDialog("가고 싶은 여행지는"); // jop 컨트롤+스페이스바 input 함수 클릭하여 입력
		String result = ""; // 입력값에 따라 result 변수 저장
		if (place.equals("국내")) { //키워드에 따라 결과값 ram에 저장
			result = "제주도를 가고 싶어 하는군요!"; //'국내'를 누를 경우의 result 결과값
		}else if (place.equals("국외")) { //키워드에 따라 결과값 ram에 저장
			result = "코로나가 끝나야 갈 수 있겠네요!"; //'국외'를 누를 경우의 result 결과값
		}else { 
			result = "방콕하세요"; //else에 해당하는 결과값 저장
		}

		JOptionPane.showMessageDialog(null,result); //jop 컨트롤+스페이스바 눌러서 메세지 결과값 출력
	}

}
