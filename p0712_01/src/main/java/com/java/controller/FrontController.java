package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.service.BoardService;
import com.java.service.BoardServiceImpl;

@Controller
public class FrontController {

	//객체선언
//	BoardServiceImpl b = new BoardServiceImpl();
	//버전이 새롭게 나올때마다 만들면 귀찮다;;
	//이렇게 해주면 버전을 새롭게 바꿔도 그대로 사용가능
	//BoardServiceImpl의 @service 를 버전1에서 버전2로 바꿔주면 된다

	
	
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
