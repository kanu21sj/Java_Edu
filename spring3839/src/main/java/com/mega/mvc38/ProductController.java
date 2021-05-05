package com.mega.mvc38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//1. 앞페이지에서 넘어온 id/pw를 받아주어야 함. => Control부분!

@Controller //어노테이션, 표시 
// 1) 스프링 프레임워크에 해당 클래스를 Controller역할을 하도록 등록
// 2) 싱글톤 객체로 생성

//클라이언트의 요청에 대한 데이터를 받아 전달하기 쉽게 데이터를 가공하는 역할
public class ProductController {
	
	@Autowired 
	//싱글톤으로 만들어진 객체의 주소를 넣어주세요.(주입, Injection)
	//@Component 사용하여 PC를 뒤져서 싱글톤을 찾아서 사용한다.
	//@Autowired 없을경우, NullPointerException 주소를 못넣어서 실행이 불가함
	
	ProductDAO dao; 
	
	@RequestMapping("select3")
	
	public void select(ProductVO productVO, Model model) {
		ProductVO vo2 = dao.select(productVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model으로 속성으로만 등록하면 됨.
		model.addAttribute("vo2", vo2);
	}

}
