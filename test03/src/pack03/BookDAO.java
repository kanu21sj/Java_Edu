package pack03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDAO {

	public void create(BookVO bag) throws Exception {
	    //커넥터 사용하기위해 설정
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    //db 연결
	    String url = "jdbc:mysql://localhost:3306/megadb"; //데이터베이스 연결
	    Connection con = DriverManager.getConnection(url, "root", "1234"); //연결하기 위해 url, id, pw 입력
	    
	    //SQL문 만듦
	    String sql = "insert into mega values(?, ?, ?, ?)"; //입력할 값 변수 4개 설정
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getId());
	    ps.setString(2, bag.getTitle());
	    ps.setString(3, bag.getStory());
	    ps.setString(4, bag.getCompany());
	    
	    //SQL문 mySQL서버로 전송
	    ps.executeUpdate();
	}
	
	public void delete(String id) throws Exception {
	    //커넥터 사용하기위해 설정
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    //db연결
	    String url = "jdbc:mysql://localhost:3306/megadb";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    
	    //SQL문 만듦
	    String sql = "delete from mega where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    
	    //SQL문 mySQL서버로 전송
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
}
