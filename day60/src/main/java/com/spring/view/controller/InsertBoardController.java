package com.spring.view.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.biz.board.BoardDAO;
import com.spring.biz.board.BoardVO;

@Controller
public class InsertBoardController {
	
	@RequestMapping(value="/insertBoardPage.do")
	public String insertBoardPage() {
		return "redirect:insertBoard.jsp";
	}

	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO bVO, BoardDAO bDAO) {
		
		System.out.println("InsertBoardController 로그");
		
		if(bDAO.insert(bVO)) {
			return "redirect:main.do";
		}
		return "redirect:insertBoard.jsp";
	}

}
