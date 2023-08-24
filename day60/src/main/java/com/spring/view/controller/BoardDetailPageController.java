package com.spring.view.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.biz.board.BoardDAO;
import com.spring.biz.board.BoardVO;

@Controller
public class BoardDetailPageController {

	@RequestMapping(value="/boardDetailPage.do")
	public String handleRequest(BoardDAO bDAO, BoardVO bVO) {
		
		System.out.println("BoardDetailController 로그");
		bVO = bDAO.selectOne(bVO);
		
		return "redirect:boardDetail.jsp";
	}

}
