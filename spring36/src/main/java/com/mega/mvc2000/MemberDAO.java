package com.mega.mvc2000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	public void create(MemberVO bag) throws Exception {
		System.out.println("전달받은 가방에 들어있는 데이터 db에 넣는 처리 하면 됨.");
		
		      // 1. 커넥터 사용하겠다고 설정해야함.
		       System.out.print("===============" + bag.getId());
//			   Class.forName("com.mysql.jdbc.Driver"); -> mysql 접속하는 커넥터 연결
		      
		       Class.forName("oracle.jdbc.OracleDriver"); // -> oracle 접속하는 커넥터 연결
		      // PrintWriter out = new PrintWriter();
		      System.out.println("1. 커넥터 사용 설정 성공. <br>");

		      // 2. db연결해보자!-shop, root, 1234
//		      String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
		      //mysql db 연결
		      
		      String url = "jdbc:oracle:thin:@localhost:1521:xe";
		      //oracle db 연결
		      
		      // jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		      Connection con = DriverManager.getConnection(url, "apple", "1234");

		      System.out.println("2. db연결 성공. <br>");

		      // 3. SQL문 객체로 만들기
		      String sql = "insert into member values (?, ?, ?, ?)";
		      PreparedStatement ps = con.prepareStatement(sql);
		      ps.setString(1, bag.getId());
		      ps.setString(2, bag.getPw());
		      ps.setString(3, bag.getName());
		      ps.setString(4, bag.getTel());
		      System.out.println("3. SQL문을 만들기 성공. <br>");

		      // 4. SQL문을 mySQL서버로 전송함.
		      ps.executeUpdate();

			  System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(MemberVO bag) throws Exception {
		System.out.println("전달받은 가방에 들어있는 데이터 db에 넣는 처리 하면 됨.");
		
		      // 1. 커넥터 사용하겠다고 설정해야함.
//			   Class.forName("com.mysql.jdbc.Driver"); -> mysql 접속하는 커넥터 연결
		       Class.forName("oracle.jdbc.OracleDriver"); // -> oracle 접속하는 커넥터 연결
		      // PrintWriter out = new PrintWriter();
		      System.out.println("1. 커넥터 사용 설정 성공. <br>");

		      // 2. db연결해보자!-shop, root, 1234
//		      String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
		      //mysql db 연결
		      
		      String url = "jdbc:oracle:thin:@localhost:1521:xe";
		      //oracle db 연결
		      
		      // jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		      Connection con = DriverManager.getConnection(url, "apple", "1234");

		      System.out.println("2. db연결 성공. <br>");

		      // 3. SQL문 객체로 만들기
		      String sql = "delete from member where id = ?";
		      PreparedStatement ps = con.prepareStatement(sql);
		      ps.setString(1, bag.getId());
		      System.out.println("3. SQL문을 만들기 성공. <br>");

		      // 4. SQL문을 mySQL서버로 전송함.
		      ps.executeUpdate();

		      System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		
	}
	
}
