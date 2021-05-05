package com.mega.mvc210318;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Member2Controller {

	@RequestMapping("member2.mega")
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	public void insert(Member2VO bag, Member2DAO dao) throws Exception {

		//컨트롤러에 있는 메서드에 변수를 선언하면,
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new Member();
		
		dao.insert(bag); //dao로 bag에 있는 데이터가 전달됨
		
		System.out.println("컨트롤러에서 받은 id: " + bag.getTel());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getCompany());

	}
	
	//login.jsp에서 MemberController 넘어오게 하는 함수
	//pc는 login만 인식하고 mega는 인식못함
	@RequestMapping("login2.mega")
	//'주소'로 들어오는 url을 특정 controller클래스나 메소드로 연결시키는 역할
	//주소는 임의로 아무거나 생성할 수 있음
	
	public String login(String id, String pw, String pw2) {
		//void -> String으로 변환하는 이유, 
		//로그인 성공, 실패에 따라 연결해주기 위한 string타입으로 변환
		//String id = request.getParameter("id");
		//할 필요없이 login()안에 넣어주면 받아와 줌
		
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw확인: " + pw2);
	
    	boolean result = false; //로그인 안되었을때
    	if(id.equals("root") && pw.equals("1234") && pw2.equals("1234")) {
    		result = true;
    	}
    	if (result) {
			return "ok"; //views 아래에 있는 ok.jsp를 호출함.
		}else {
			return "no";
		}
	}
	
}
