package bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionMgr {
// 5번(Bill Pugh Singleton Implementaion) 방식으로 싱글톤 객체 생성
	
//  생성자 외부에서 접근 할 수 없도록 제어
	private DBConnectionMgr() {
	}

//	inner class 생성하여 DBConnectionMgr 인스턴스(객체) 생성
	private static class SingletonHelper {
		private static final DBConnectionMgr INSTANCE = new DBConnectionMgr();
	}
	
//	getInstance 메서드 호출시 SingletonHelper내 INSTANCE 객체 리턴
	public static DBConnectionMgr getInstance() {
		return SingletonHelper.INSTANCE;
	}

//	DAO에서 Connection 메서드 사용할 수 있도록 정의
//	외부 데이터 접근을 위해서는 Exception 설정 필요
	public Connection getConnection() throws Exception{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "1234");
	}
}