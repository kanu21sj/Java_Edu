package com.mega.mvc37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //MemberDAO dao = new MemberDAO(); 한개만 객체 생성!
public class MemberDAO {
	
	//myBatis싱글톤 주소를 주입!!
	@Autowired
	SqlSessionTemplate my;
	
	public void create(MemberVO bag) throws Exception {
//		mapper파일의 namespace이름.태그의 id와 일치해야함.
//		<mapper namespace="member">
//					<select id = "">
		my.insert("member.insert", bag);
		
	}
	
	public void delete(MemberVO bag) {
		//myBatis에 시길 커예요.
		my.delete("member.delete", bag);
	}
	
	public MemberVO login(MemberVO bag) {
		return my.selectOne("member.login", bag);
	}
}
