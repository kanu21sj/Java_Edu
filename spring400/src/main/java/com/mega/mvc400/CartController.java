package com.mega.mvc400;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. webapp jsp에서 넘어온 id/pw를 받아주어야 함. => Control부분!

@Controller //어노테이션, 표시 
// 1) 스프링 프레임워크에 해당 클래스를 Controller역할을 하도록 등록
// 2) 싱글톤 객체로 생성

//클라이언트의 요청에 대한 데이터를 받아 전달하기 쉽게 데이터를 가공하는 역할
public class CartController {
	
	//싱글톤으로 만들어진 객체의 주소를 넣어주세요.(주입, Injection)
	//@Autowired 없을경우, NullPointerException 주소를 못넣어서 실행이 불가함
	@Autowired 

	//CartDAO클래스 사용을 위한 dao 변수 생성
	CartDAO dao; 
		
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	@RequestMapping("cart")
	
	//create기능 사용하여 클라이언트로부터 받은 값을 vo에 저장
	public void create(CartVO cartVO) throws Exception {

		dao.create(cartVO);
	}
}
