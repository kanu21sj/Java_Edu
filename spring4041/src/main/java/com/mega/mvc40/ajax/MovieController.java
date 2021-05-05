package com.mega.mvc40.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	//views로 넘길 주소명 설정
	@RequestMapping("movie")
	
	//views넘기기 위한 데이터 값 vo 및 Model 변수 생성
	//여러개 데이터를 받을 경우 VO사용 하는것이 좋음
	public void movie(MovieVO vo, Model model) {
		
		System.out.println("데이터 확인" + vo);
		model.addAttribute("vo", vo);
	}
}
