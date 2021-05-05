package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//자바에서 자동 import 컨트롤 + 쉬프트 + o
public class BoardDB {
	//crud기능
	public void create(BoardVO bag) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    //jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "insert into board values(?, ?, ?, ?)";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getId());
	    ps.setString(2, bag.getTitle());
	    ps.setString(3, bag.getContent());
	    ps.setString(4, bag.getWriter());
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(String id) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    //jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "delete from board where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void update(BoardVO bag) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    //jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "update board set title = ?, content = ? where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getTitle());
	    ps.setString(2, bag.getContent());
	    ps.setString(3, bag.getId());
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	public BoardVO read(String id) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    //jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "select * from board where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ResultSet rs = ps.executeQuery();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	    
	    //1. 검색결과가 있는지 체크해야한다.
	    //System.out.println(rs.next());//true이면 있다라는 얘기
	    //2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
	    BoardVO bag = new BoardVO();
	    if (rs.next()) {
	    	//꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
	    	String id2 = rs.getString("id"); //"apple"
	    	String title = rs.getString(2); 
	    	String content = rs.getString(3); 
	    	String writer = rs.getString(4); 
			bag.setId(id2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
		}
	    return bag;
	}

}
