package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	
	//Connection메서드 사용을 위한 con변수 선언
	Connection con; 
	//DBConnectionMgr메서드 사용을 위한 dbcp 변수 선언
	DBConnectionMgr dbcp;
	
	//BbsDAO 생성자 정의를 위한 DBConnectionMgr클래스의 객체 사용
	public BbsDAO() throws Exception{
		
		//BbsDAO dao = new BbsDAO();
		
//	    1. 커넥터 사용 설정: 데이터베이스 mySQL 사용하기 위한 커넥션 사용 연결
//	    Class.forName("com.mysql.jdbc.Driver");
	    
//	    2. db연결: 디비 연결하여 데이터베이스를 사용할 준비 완료
//	    String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
		
//	    데이터베이스 연결하기 위한 url, id, 비밀번호 입력
//	    Connection con = DriverManager.getConnection(url, "root", "1234");
//		싱글톤 패턴을 사용하게 되면 위와 같은 코딩의 번거로움, 불필요한 메모리 효율성 향상 및 유지보수 용이 등이 가능 
		
//		dbcp 변수를 재정의하여 DBConnectionMgr 클래스의 getInstance 메서드 호출 
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public BbsVO read(String no) throws Exception {
		
		//bag 객체 생성
		BbsVO bag = new BbsVO();
		con = dbcp.getConnection();
		String sql = "select * from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, Integer.parseInt(no));
		System.out.println("3. sql문 객체로 생성 ok");
		
		ResultSet result = ps.executeQuery();	
		System.out.println("4. sql문 mysql로 전송 ok");
		if (result.next()) {
			String title = result.getString(2);
			String content = result.getString(3);
			String writer = result.getString(4);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
		}
		return bag;
	}
}