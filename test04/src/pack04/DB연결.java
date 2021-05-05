package pack04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB연결 {

	public void create(String[] args) throws Exception {
		String id = "window";
		String pw = "window";
		String name = "window";
		String tel = "window";
		
	    //1. 커넥터 사용 설정
		  //데이터베이스 mySQL 사용하기 위한 커넥션 사용 연결
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

	    //2. db연결
	      //디비 연결하여 데이터베이스를 사용할 준비 완료
	    	//?useUnicode=true&characterEncoding=utf8"; 한글 설정 해주기 위한 코드 추가
		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
		//데이터베이스 연결하기 위한 url, id, 비밀번호 입력
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");
		
		//3. member 테이블에 입력값 저장
		String sql = "insert into member(id, pw, name, tel) values (?, ?, ?, ?);";
		//PreparedStatement메서드 사용하여 ps 객체 생성
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		//setString 메서드 사용하여 입력값 저장
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}

}
