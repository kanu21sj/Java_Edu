package 배열기본;

public class 배열만들기2 {

	public static void main(String[] args) {
		double[] num = new double[3];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " : " + num[i]);
		}
		
		for (double y : num) {
			//for-each 문에서 y는 num.length 만큼 재사용
	}

}
}