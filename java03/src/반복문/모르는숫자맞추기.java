package 반복문;

import java.util.Random;

public class 모르는숫자맞추기 {

	public static void main(String[] args) {
		// 랜덤
		Random r = new Random();
		int num = r.nextInt(100); //-21억 ~ 21억, 사이의 숫자를 알려줌 ()값을 넣으면 그 미만 값을 랜덤으로 생성
		System.out.println(num);

	}

}
