package com.mega.mvc3000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. insert 페이지에서 넘어온 id/pw 받아주어야 함
//   => Control 부분

//컨트롤러 기능을 상속받음
@Controller
public class MemberController {
	
	//주소임의로 생성
	//insert 부분까지 인지하고 .mega 부분은 인지하지 못함
	@RequestMapping("insert.mega")
	public void login(String id, String pw, String pw2) {
		//String id = request.getParameter("id");
		//할 필요없이 login()안에 넣어주면 받아와 줌
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw check: " + pw2);
		
		boolean result = false; //로그인 안되었을때
		if (id.equals("root") && pw.equals("1234") && pw2.equals("1234")) {
			//id, pw, pw2 세개가 맞을 경우 로그인
			result = true;
		}
	}
}
