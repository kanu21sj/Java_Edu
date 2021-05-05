package com.mega.mvc210318;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Member1DAO {
	
	//myBatis 싱글톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;
	
	//insert CURD 중, create 기능
	public void insert(Member1VO bag) throws Exception {
		
		//myBatis에 시킴
		my.insert("member1.insert", bag);
		
	}
}
