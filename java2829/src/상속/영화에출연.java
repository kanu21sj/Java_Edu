package 상속;

public class 영화에출연 {

	public static void main(String[] args) {
		수퍼맨 sMan = new 수퍼맨();
		sMan.name = "클라크"; //사람 class
		sMan.age = 30000; //사람 class
		sMan.speed = 1000; //맨 class
		sMan.fly = true; //수퍼맨 class
		
		sMan.먹다(); //사람 class
		sMan.달리다(); //맨 class
		sMan.우주를날다(); //수퍼맨 class
		
		System.out.println(sMan);
	}
}
