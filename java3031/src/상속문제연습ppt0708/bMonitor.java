package 상속문제연습ppt0708;

public class bMonitor extends bPC{
	
	int size;
	
	public void 출력() {
		System.out.println("모니터로 화면을 출력하다.");
	}

	@Override
	public String toString() {
		return "Monitor [size=" + size + ", type=" + type + ", price=" + price + "]";
	}
	
}
