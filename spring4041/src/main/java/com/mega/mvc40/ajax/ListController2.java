package com.mega.mvc40.ajax;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController2 {
	//Plain Old Java Object: POJO파일
	//평범한 옛날부터 쓰던 자바 객체
	
	@RequestMapping("fruits")
	public void furits(Model model) {
		
		//String 타입 fruit 변수명으로 리스트 생성
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("메론");
		fruits.add("딸기");
		fruits.add("참외");
		
		//모델 메서드 사용하여 views로 넘김
		model.addAttribute("fruits", fruits);
	}
}
