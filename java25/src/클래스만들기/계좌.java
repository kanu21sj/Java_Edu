package 클래스만들기;

public class 계좌 {

	public String name;
	public String type;
	public int amount;
	
	public void input(String name, String type, int amount) {
		System.out.println(name + " " + type + " " + amount);
	}
	
	public void input(String name, int amount) {
		System.out.println(name + " " + amount);
	}
	
	public void output(int amount) {
		System.out.println(amount);
	}

	@Override
	public String toString() {
		return "계좌 [name=" + name + ", type=" + type + ", amount=" + amount + "]";
	}
	
}
