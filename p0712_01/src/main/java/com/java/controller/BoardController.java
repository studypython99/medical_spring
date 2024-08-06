package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.BoardDto;
import com.java.service.BoardService;


@Controller
public class BoardController {

	//객체선언
//	BoardServiceImpl b = new BoardServiceImpl();
	//버전이 새롭게 나올때마다 만들면 귀찮다;;
//	BoardServiceImplVer2 b2 = new BoardServiceImplVer2();
	//이렇게 해주면 버전을 새롭게 바꿔도 그대로 사용가능
	//BoardServiceImpl의 @service 를 버전1에서 버전2로 바꿔주면 된다
	
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/board/list")
	public ModelAndView list() {
		
		//게시판 전체 가져오기
		ArrayList<BoardDto> list = boardService.selectList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("board/list");
		
		return mv;
	}
}
