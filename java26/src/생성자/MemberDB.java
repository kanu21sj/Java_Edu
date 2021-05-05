package 생성자;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//자바에서 자동 import 컨트롤 + 쉬프트 + o
public class MemberDB {
	
	//공통된 코드가 보인다 => 객체생성시 반드시 해주어야 하는 작업!
	//1. 클래스 이름과 동일한 메서드가 객체생성시 자동 호출
	//2. 프로그래머가 클래스이름과 동일한 메서드가 자동으로 만들어진다.(메서드가 비어있음) 
	//3. 객체 생성시 클래스 이름과 동일한 메서드로 자동 호출되는 메서드를, 생성자 메서드/생성자
	//   객체 생성시 자동 호출되는 메서드라고 해서 '생성자 메서드'(constructor)
	Connection con; //변수 선언된 위치가 중요, 선언된 위치안에서만 사용 가능!
	
	public MemberDB() throws Exception {
		System.out.println("내가 객체 생성시 자동 호출됩니다.");
		
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    //jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	}
	
	public ArrayList<MemberVO> list() throws Exception { 
		//return되는 타입 -> void 자리에 ArrayList<MemberVO>가져와서 복붙
		ArrayList<MemberVO> list = new ArrayList<>(); //전체를 담은 컨테이너 생성
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "select * from member";
	    PreparedStatement ps = con.prepareStatement(sql);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ResultSet rs = ps.executeQuery();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	    
	    //1. 검색결과가 있는지 체크해야한다.
	    //System.out.println(rs.next());//true이면 있다라는 얘기
	    //2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
	    while (rs.next()) {
	    	//rs.next()를 호출할 때마다 한 행씩 내려가서 그 행이 있는지를 체크: boolean
	    	//있으면 true, 없으면 false
	    	//true이면 각 항목의 값들을 꺼내주어야 한다.
	    	
	    	//꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
	    	String id2 = rs.getString("id"); //"apple"
	    	String pw = rs.getString(2); 
	    	String name = rs.getString(3); 
	    	String tel = rs.getString(4); 
	    	
	    	//가방을 만들어서 꺼내준 값들을 가방에 넣는다.
	    	MemberVO bag = new MemberVO();
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			
			//가방들을 넣어줄 컨테이너에 하나씩 넣어준다.
			list.add(bag);
		}
	    return list; //list: 가방이 들어간 컨테이너 역할
	}
	public boolean check(String id, String pw) throws Exception { //void -> boolean으로 변경
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "select * from member where id = ? and pw = ?"; //where 조건절: 조건을 주고서 검색을 하고 싶을때
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    ps.setString(2, pw);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ResultSet rs = ps.executeQuery();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	    
	    boolean result = false; //boolean(1byte) 초기화 시킬때는 false, int로(4byte) 초기화는 0
	    if (rs.next()) {
	    	result = true; //제일 많이 사용하는 방법!
		} 
	    return result; //result의 타입은 boolean
	}
	
	//crud기능
	public void create(MemberVO bag) throws Exception {
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "insert into member values(?, ?, ?, ?)";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getId());
	    ps.setString(2, bag.getPw());
	    ps.setString(3, bag.getName());
	    ps.setString(4, bag.getTel());
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(String id) throws Exception {
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "delete from member where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void update(MemberVO bag) throws Exception {
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "update member set pw = ?, tel = ? where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getPw());
	    ps.setString(2, bag.getTel());
	    ps.setString(3, bag.getId());
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	public MemberVO read(String id) throws Exception {
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "select * from member where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ResultSet rs = ps.executeQuery();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	    
	    //1. 검색결과가 있는지 체크해야한다.
	    //System.out.println(rs.next());//true이면 있다라는 얘기
	    //2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
	    MemberVO bag = new MemberVO();
	    if (rs.next()) {
	    	//꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
	    	String id2 = rs.getString("id"); //"apple"
	    	String pw = rs.getString(2); 
	    	String name = rs.getString(3); 
	    	String tel = rs.getString(4); 
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		}
	    return bag;
	}

}
