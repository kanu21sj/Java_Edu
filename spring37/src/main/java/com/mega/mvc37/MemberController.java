package com.mega.mvc37;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. 앞페이지에서 넘어온 id/pw를 받아주어야 함. => Control부분!

@Controller //어노테이션, 표시 
// 1) 스프링 프레임워크에 해당 클래스를 Controller역할을 하도록 등록
// 2) 싱글톤 객체로 생성

//클라이언트의 요청에 대한 데이터를 받아 전달하기 쉽게 데이터를 가공하는 역할
public class MemberController {
	
	@Autowired //@Component 사용하여 PC를 뒤져서 싱글톤을 찾아서 사용한다.
	//@Autowired 없을경우, NullPointerException 주소를 못넣어서 실행이 불가함
	
	MemberDAO dao; //싱글톤으로 만들어진 객체의 주소를 넣어주세요.

	@RequestMapping("insert.mega")
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	public void insert(MemberVO bag) throws Exception {
		System.out.println("(싱글톤)dao의 주소 " + dao);
		System.out.println("(프로토타입)vo의 주소 " + bag);
		//public void name(String id, String pw, String name, String tel)
		//컨트롤러에 있는 메서드에 변수를 선언하면,
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new Memeber();
		
		dao.create(bag);
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());
		System.out.println("컨트롤러에서 받은 name: " + bag.getName());
		System.out.println("컨트롤러에서 받은 tel: " + bag.getTel());
	}
	
	//login.jsp에서 MemberController 넘어오게 하는 함수
	//pc는 login만 인식하고 mega는 인식못함
	@RequestMapping("login")
	//'주소'로 들어오는 url을 특정 controller클래스나 메소드로 연결시키는 역할
	//주소는 임의로 아무거나 생성할 수 있음
	
	public void login(MemberVO bag, HttpSession session) {
		//session 사용하고 싶을 때, login()괄호안에 값을 넣으면 됨
		
		MemberVO vo = dao.login(bag);
		if(vo != null) {
			//!(not) => != null은 null이 아닐때
			System.out.println("해당 id/pw가 있음");
			session.setAttribute("userId", vo.getId());
		}else {
			System.out.println("해당 id/pw가 없음");
		}
	}
	
		@RequestMapping("delete.mega")
		//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
		public void delete(MemberVO bag, MemberDAO dao) throws Exception {
			//public void name(String id, String pw, String name, String tel)
			//컨트롤러에 있는 메서드에 변수를 선언하면,
			//스프링이 객체를 생성해준다.
			//MemberDAO dao = new Member();
			
			dao.delete(bag);
			
			System.out.println("컨트롤러에서 받은 id: " +bag.getId());
		}
}
