package com.mega.mvc40;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//1. 앞페이지에서 넘어온 id/pw를 받아주어야 함. => Control부분!

//어노테이션, 표시 
// 1) 스프링 프레임워크에 해당 클래스를 Controller역할을 하도록 등록
// 2) 싱글톤 객체로 생성

@Controller 
public class BbsController {
//클라이언트의 요청에 대한 데이터를 받아 전달하기 쉽게 데이터를 가공하는 역할
	
	//싱글톤으로 만들어진 객체의 주소를 넣어주세요.(주입, Injection)
	//@Component 사용하여 PC를 뒤져서 싱글톤을 찾아서 사용한다.
	//@Autowired 없을경우, NullPointerException 주소를 못넣어서 실행이 불가함
	
	@Autowired 
	BbsDAO bbs; 
	
	@Autowired 
	BbsDAO bbs2;
	
	@RequestMapping("sunday")
	public void sunday() {
		
	}
	
	@RequestMapping("all")
	@ResponseBody //view를 안거치고 바로 브라우저로 간다.
	public List<BbsVO> all() { //많은양의 데이터를 넘길때 사용
		List<BbsVO> all = bbs.all();
	    return all;
	   }
	
//	@RequestMapping("all")
//	
//	public void all(Model model) {
//		List<BbsVO> list = bbs.all2();
//		System.out.println("목록의 개수: " + list.size() + "개의 목록이 있음");
//		model.addAttribute("list", list);
//	}
	
	@RequestMapping("select")
	
	public void select(BbsVO bbsVO, Model model) {
		BbsVO vo = bbs.read(bbsVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model으로 속성으로만 등록하면 됨.
		model.addAttribute("vo", vo);	
	}
	
	@RequestMapping("insert2")
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	
	public void insert(BbsVO bbsVO) throws Exception {
		//bbsVO를 model 속성으로 자동 등록해줌.
		
		System.out.println("(싱글톤)dao의 주소 " + bbs);
		System.out.println("(프로토타입)vo의 주소 " + bbsVO);
		//public void name(String id, String pw, String name, String tel)
		//컨트롤러에 있는 메서드에 변수를 선언하면,
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new Memeber();
		
		bbs.create(bbsVO);
	}
}
