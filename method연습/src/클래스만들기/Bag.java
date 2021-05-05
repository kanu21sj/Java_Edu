package 클래스만들기;

public class Bag {
	String name;
	int age;
	double weight;
	
	//ctrl + shift + s + r
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "Bag [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
