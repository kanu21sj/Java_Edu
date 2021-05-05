package com.mega.mvc40;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//1. 앞페이지에서 넘어온 id/pw를 받아주어야 함. => Control부분!

@Controller 
public class PersonController {
	
	@Autowired 
	PersonDAO dao; 
	
	@RequestMapping("insertperson")
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	
	public void insert(PersonVO bag) throws Exception {
		//bbsVO를 model 속성으로 자동 등록해줌.

		dao.create(bag);
	}
	@RequestMapping("all2")
	@ResponseBody
	public List<PersonVO> all() { //많은양의 데이터를 넘길때 사용
		List<PersonVO> all2 = dao.all2();
	    return all2;
	   }
	
//	@RequestMapping("all2")
//	@ResponseBody //view를 안거치고 바로 브라우저로 간다.
//	public String all2(String food) {
//		if (food.equals("아이스크림")) {
//			return "go!!";
//		} else {
//			return "home!!";
//		}
//	}
}
