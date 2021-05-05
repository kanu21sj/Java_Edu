package 연습;

public class 게시판사용 {

	public static void main(String[] args) {
		게시판 b1 = new 게시판("java","fun java","park");
		b1.writing();		
		System.out.println(b1);
		
		게시판 b2 = new 게시판("jsp","fun jsp","hong");
		b2.reading();
		System.out.println(b2);
		
		게시판 b3 = new 게시판("spring","fun spring","kim");
		b3.reading();
		System.out.println(b3);

	}

}
