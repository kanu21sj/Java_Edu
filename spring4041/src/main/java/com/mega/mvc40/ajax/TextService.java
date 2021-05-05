package com.mega.mvc40.ajax;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component //싱글톤 객체로 생성
public class TextService {
	
	//return값이 있으므로 void -> int(num2 타입이 int이므로)
	public int text(String tel) {
		
		//랜덤한 값 6자리 만들어 Controller에게 리턴
		Random r = new Random();
		
		//100000 ~ 999999안에서 숫자 6자리 랜덤하게 생성
		int num2 = r.nextInt(900000) + 100000;
		return num2;
	}
}
