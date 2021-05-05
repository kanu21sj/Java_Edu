package com.mega.mvc37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
//ProductDAO dao = new MemberDAO(); 한개만 객체 생성!
public class ProductDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void create(ProductVO bag) throws Exception {
		//myBatis에 시킴
		my.insert("product.insert", bag);
		
	}

	
}
