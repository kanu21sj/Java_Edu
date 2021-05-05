package 연습;

public class 게시판 {
	
		 String title;
		 String content;
		 String writer;
		 

	public 게시판(String title, String content, String writer) {
			this.title = title;
			this.content = content;
			this.writer = writer;
		}
	
		public void writing() { //멤버메서드
		System.out.println("게시글을 작성하다.");
		}
		public void reading() { //멤버메서드
		System.out.println("게시글을 읽어보다.");
		}
		public void deleting() { //멤버메서드
		System.out.println("게시글을 삭제하다.");
		}

		@Override
		public String toString() {
			return "게시판 [title=" + title + ", content=" + content + ", writer=" + writer + "]";
		}
		
}
