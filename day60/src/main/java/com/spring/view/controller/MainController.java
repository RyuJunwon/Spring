package com.spring.view.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.biz.board.BoardDAO;
import com.spring.biz.board.BoardVO;
import com.spring.biz.member.MemberVO;

@Controller
public class MainController {
	
	// 실행 순서는 searchMap() --> main() 순으로 진행됨.
	// Command 객체로 쓰는 것 보단 위에 선언하는 것이 훨씬 많고 보편적이다. (코드 가독성)
	
	@ModelAttribute("searchMap")
	public Map<String, String> searchMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("제목", "TITLE");
		map.put("작성자", "WRITER");
		return map;
	}

	@RequestMapping(value="/main.do")
	public String main(/* @RequestParam(value="/searchCondition", defaultValue="TITLE", required=false)String searchConditions, @RequestParam(value="searchContent", defaultValue="CONTENT", required=false)String searchContent,*/ 
			@ModelAttribute("mem")MemberVO mVO, BoardDAO bDAO, BoardVO bVO ,Model model) {
		// String searchCOndition = request.getParameter("searchCondion"); 
		// 	--> @RequestParam(value="/searchCondition")String searchConditions 와 동일함
		
		System.out.println("searchCondition = " + bVO.getSearchConditions());
		System.out.println("searchContent = " + bVO.getContent());
		System.out.println("MainController 로그");
		// Command 객체를 사용해보자 ! --> 따라서 mav.addObject() 를 사용하지 않음 [ MemberVO 사용해보기 ]
		
		mVO.setMid("test");
		mVO.setMpw("1234");
		
		// model.addAttribuet("mem", mVO);
		model.addAttribute("datas", bDAO.selectAll(null));
		// mav.addObject("bdatas", bDAO.selectAll(null));
		// mav.setViewName("main.jsp");
		//return "main"; // --> main.jsp --> 즉 View로 가려고 함
		return "login.jsp";
	}

}
