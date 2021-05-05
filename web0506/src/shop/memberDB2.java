package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class memberDB2 {
	//crud기능
	public void create(String id, String title, String content, String writer) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    String sql = "insert into board values(?, ?, ?, ?)";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    ps.setString(2, title);
	    ps.setString(3, content);
	    ps.setString(4, writer);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(String id) throws Exception {
		//1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    String sql = "delete from board where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	public void update(String id, String title, String content) throws Exception {

		//1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/shop";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");

	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    String sql = "update board set title = ?, content = ? where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, title);
	    ps.setString(2, content);
	    ps.setString(3, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");

	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}

}
