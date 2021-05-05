package com.mega.mvc40.ajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextController {
	
	//싱글톤 사용하기 위한 변수 생성
	@Autowired
	TextService text;
	
	@RequestMapping("text")
	
	//views(ajax3.jsp)넘기기 위한 Model 변수 생성
	public void text(String tel, Model model) {
		
		//text(String tel) = request.getParameter("tel"); 와 동일
		System.out.println("컨트롤러까지 요청됨. 도착한 데이터는 " + tel);
		
		int num2 = text.text(tel);
		
		//views에 보낼 속성 및 변수 생성
		model.addAttribute("num2", num2);
	}
}
