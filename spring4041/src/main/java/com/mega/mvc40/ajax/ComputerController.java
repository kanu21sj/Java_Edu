package com.mega.mvc40.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComputerController {
	
	@RequestMapping("computer")
	public void computer(ComVO vo, Model model) {
		
		System.out.println("컨트롤러에서 보낸 데이터 " + vo);
		
		vo.setSum(vo.getComprice() + vo.getMouseprice());
		model.addAttribute("vo", vo);
	}
}
