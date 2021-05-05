package 생성자;

public class Day연습 {
	
	String task;
	int time;
	String place;
	
	public Day연습(String task, int time, String place) {
		this.task = task;
		this.time = time;
		this.place = place;
	}

	@Override
	public String toString() {
		return "하루일과 [task=" + task + ", time=" + time + ", place=" + place + "]";
	}
	
	
}
