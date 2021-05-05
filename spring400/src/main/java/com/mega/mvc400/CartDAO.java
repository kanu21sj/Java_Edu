package com.mega.mvc400;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component 사용하여 PC내 싱글톤을 찾아서 사용한다.
@Component 
public class CartDAO {
	
	//myBatis싱글톤 주소를 주입!!
	@Autowired
	SqlSessionTemplate my;
		
	//create기능 생성, 클라이언트로부터 받은 값들을 bag에 저장
	public void create(CartVO bag) throws Exception {
		
		//myBatis가 대신 해줌
		my.insert("cart.insert", bag);
	}
}
