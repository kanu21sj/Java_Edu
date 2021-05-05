package com.mega.mvc40;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class PersonDAO {
	
	//myBatis싱글톤 주소를 주입!!
	@Autowired
	SqlSessionTemplate my;
	
	public void create(PersonVO bag) throws Exception {
		
		//myBatis가 대신 해줌
		my.insert("person.insert", bag);
	}
	
	public List<PersonVO> all2(){
	
		return my.selectList("person.all2");
	}
}
