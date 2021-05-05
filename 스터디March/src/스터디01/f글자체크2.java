package 스터디01;

public class f글자체크2 {

	public static void main(String[] args) {
		
		String al = "aabbbcc";
		
		int count = 0;
		for (int i = 0; i < al.length(); i++) {
			if (al.charAt(i) == 'a') {
				count++;
			}
		}System.out.println("알파벳 a의 개수는" + count + "개");
		
	}

}
