package com.mega.mvc38;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //BbsDAO dao = new MemberDAO(); 한개만 객체 생성!
public class ProductDAO {
	
	//myBatis싱글톤 주소를 주입!!
	@Autowired
	SqlSessionTemplate my;
	
	public void create(ProductVO bag) throws Exception {
		System.out.println("전달받은 가방에 들어있는 데이터 db에 넣는 처리 하면 됨.");
		
		//myBatis가 대신 해줌
		my.insert("bbs.insert", bag);
	}
	
	public ProductVO select(ProductVO vo3) {
		return my.selectOne("product.select", vo3);
	}
	
}
