package com.mega.mvc210318;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Member2DAO {
	
	//insert CURD 중, create 기능
	public void insert(Member2VO bag) throws Exception {
		System.out.println("전달받은 가방에 들어있는 데이터 db에 넣는 처리 하면 됨.");
		
	      // 1. 커넥터 사용하겠다고 설정해야함.
	       System.out.print("===============" + bag.getTel());
//		   Class.forName("com.mysql.jdbc.Driver"); -> mysql 접속하는 커넥터 연결
	      
	       Class.forName("oracle.jdbc.OracleDriver"); // -> oracle 접속하는 커넥터 연결
	      // PrintWriter out = new PrintWriter();
	      System.out.println("1. 커넥터 사용 설정 성공. <br>");

	      // 2. db연결해보자!-shop, root, 1234
//	      String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
	      //mysql db 연결
	      
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      //oracle db 연결
	      
	      // jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
	      Connection con = DriverManager.getConnection(url, "root", "1234");

	      System.out.println("2. db연결 성공. <br>");

	      // 3. SQL문 객체로 만들기
	      String sql = "insert into member2 values (?, ?)";
	      PreparedStatement ps = con.prepareStatement(sql);
	      ps.setString(1, bag.getTel());
	      ps.setString(2, bag.getCompany());
	      System.out.println("3. SQL문을 만들기 성공. <br>");

	      // 4. SQL문을 mySQL서버로 전송함.
	      ps.executeUpdate();

		  System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public boolean check(String tel, String company) throws Exception { //void -> boolean으로 변경
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("oracle.jdbc.OracleDriver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:oracle:thin:@localhost:1521:xe";
	    //jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "select * from member where tel = ? and company = ?"; //where 조건절: 조건을 주고서 검색을 하고 싶을때
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, tel);
	    ps.setString(2, company);
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
}
