package com.spring.view.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.biz.member.MemberDAO;
import com.spring.biz.member.MemberVO;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do") 
	public String login(MemberVO mVO, MemberDAO mDAO, HttpSession session) { // 로그인
		System.out.println("LoginController 로그");
		mVO = mDAO.selectOne(mVO);
		if(mVO != null) {
			session.setAttribute("memberId", mVO.getMid());
		}
		return "redirect:main.do";
	}
	
	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session) { // 로그아웃
		System.out.println("LogoutController 로그");
		session.removeAttribute("memberId");
		//return "main.do";
		return "redirect:main.do";
	}

}
