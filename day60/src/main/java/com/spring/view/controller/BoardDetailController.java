package com.spring.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.biz.board.BoardDAO;
import com.spring.biz.board.BoardVO;

public class BoardDetailController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		BoardDAO bDAO = new BoardDAO();
		BoardVO bVO = new BoardVO();
		
		HttpSession session = request.getSession();
		
		bVO.setTitle(request.getParameter("title"));
		bVO.setContent(request.getParameter("content"));
		bVO.setWriter((String)request.getAttribute("memberId"));
		bVO.setCnt(Integer.parseInt(request.getParameter("cnt")));
		bVO = bDAO.selectOne(bVO);
		
		request.setAttribute("bdata", bVO);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main.do");
		return mav;
	}
}
