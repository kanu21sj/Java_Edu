package 상속문제연습ppt0708;

public class bSpeaker extends bPC{
	
	int volume;
	
	public void 소리() {
		System.out.println("스피커로 소리를 내보내다.");
	}

	@Override
	public String toString() {
		return "Speaker [volume=" + volume + ", type=" + type + ", price=" + price + "]";
	}
	
}
