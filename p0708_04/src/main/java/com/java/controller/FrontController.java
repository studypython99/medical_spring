package com.java.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FrontController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/member") //회원가입 폼
	public String member() {
		return "member";
	}
	

	

	
	@RequestMapping("/doMember") //회원가입 저장
	public ModelAndView doMember(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("doMember");
		mv.addObject("id",request.getParameter("id"));
		mv.addObject("pw",request.getParameter("pw"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("phone",request.getParameter("phone"));
		mv.addObject("gender",request.getParameter("gender"));
		
		String[] hobby = request.getParameterValues("hobby");
//		mv.addObject("hobby",Arrays.toString(hobby));
		//저장위치처럼 나옴;
//		mv.addObject("hobby",request.getParameterValues("hobby"));
		String hobbys = ""; // game,golf,run,swim,soccer
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += ""+hobby[i];
			else hobbys +=","+hobby[i];
		}
		mv.addObject("hobby",hobbys);
		return mv;
	}
	
	@RequestMapping("/memUpdate") //회원정보수정
	public String memUpdate(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("doMember");
		mv.addObject("id",request.getParameter("id"));
		mv.addObject("pw",request.getParameter("pw"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("phone",request.getParameter("phone"));
		mv.addObject("gender",request.getParameter("gender"));
		
		String[] hobby = request.getParameterValues("hobby");
//		mv.addObject("hobby",Arrays.toString(hobby));
		//저장위치처럼 나옴;
//		mv.addObject("hobby",request.getParameterValues("hobby"));
		String hobbys = ""; // game,golf,run,swim,soccer
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += ""+hobby[i];
			else hobbys +=","+hobby[i];
		}
		mv.addObject("hobby",hobbys);
		return mv;
	}
	
}
