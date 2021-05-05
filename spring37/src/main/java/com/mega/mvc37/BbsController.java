package com.mega.mvc37;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. 앞페이지에서 넘어온 id/pw를 받아주어야 함. => Control부분!

@Controller //어노테이션, 표시 
// 1) 스프링 프레임워크에 해당 클래스를 Controller역할을 하도록 등록
// 2) 싱글톤 객체로 생성

//클라이언트의 요청에 대한 데이터를 받아 전달하기 쉽게 데이터를 가공하는 역할
public class BbsController {
	
	@Autowired 
	//싱글톤으로 만들어진 객체의 주소를 넣어주세요.(주입, Injection)
	//@Component 사용하여 PC를 뒤져서 싱글톤을 찾아서 사용한다.
	//@Autowired 없을경우, NullPointerException 주소를 못넣어서 실행이 불가함
	
	BbsDAO bbs; 
	
	@RequestMapping("insert2.mega")
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	
	public void insert(BbsVO bag) throws Exception {
		System.out.println("(싱글톤)dao의 주소 " + bbs);
		System.out.println("(프로토타입)vo의 주소 " + bag);
		//public void name(String id, String pw, String name, String tel)
		//컨트롤러에 있는 메서드에 변수를 선언하면,
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new Memeber();
		
		bbs.create(bag);
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getTitle());
		System.out.println("컨트롤러에서 받은 name: " + bag.getContent());
		System.out.println("컨트롤러에서 받은 tel: " + bag.getWriter());
	}
}
