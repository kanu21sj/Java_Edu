package com.mega.mvc40.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComController {
	
	//views로 넘길 주소명 설정
	@RequestMapping("com")
	
	//views넘기기 위한 데이터 값 vo 및 Model 변수 생성
	//여러개 데이터를 받을 경우 VO사용 하는것이 좋음
	public void com(ComVO vo, Model model) {
		
		System.out.println("컨트롤러에서 받은 값 " + vo);
		
		//sum값을 넣어주기 위한 코드
		vo.setSum(vo.getComprice() + vo.getMouseprice());
		model.addAttribute("vo", vo);
	}
}
