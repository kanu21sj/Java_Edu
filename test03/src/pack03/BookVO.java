package pack03;

public class BookVO {
	//테이블에 입력한 항목명을 변수로하여 가방을 만들어 주어야 함 
	String id; 
	String title;
	String story;
	String company;
	//각 변수마다 넣는 기능, 꺼내는 기능이 필요(메서드로 구현), getters and setters(Source 메뉴에서 자동 생성 가능)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}