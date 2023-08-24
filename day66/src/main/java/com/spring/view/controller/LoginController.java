package com.spring.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.biz.member.MemberDAO;
import com.spring.biz.member.MemberVO;

@Controller
public class LoginController { // 비슷한 로직끼리 같은 파일에서 관리하기때문에 응집도가 높아짐
	
	@RequestMapping(value="/login.do")
	public String login(MemberVO mVO, MemberDAO mDAO, HttpSession session) {
		System.out.println("LoginController 로그"); // 1. 개발자용 로그
		
		// 2.
		// 권한 확인 단계 위치
		// 보안, 인증, 허가 등등
		
		mVO=mDAO.selectOne(mVO); // 3. 비즈니스 메소드 실행
		if(mVO!=null){
			session.setAttribute("member", mVO.getMid());
		}
		
		// 4. 보안 관제 로그 위치
		
		return "redirect:main.do";
	}
	
	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session){
		System.out.println("LogoutController 로그");
		
		session.removeAttribute("member");
		
		return "redirect:main.do";
	}

}