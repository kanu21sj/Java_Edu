package com.mega.mvc210318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Member1Controller {
	
	@Autowired
	Member1DAO dao;
	
	@RequestMapping("member1.mega")
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	public void insert(Member1VO bag) throws Exception {

		//컨트롤러에 있는 메서드에 변수를 선언하면,
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new Member();
		
		dao.insert(bag); //dao로 bag에 있는 데이터가 전달됨
		
		System.out.println("컨트롤러에서 받은 id: " + bag.getName());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getLocation());

	}
	
}
