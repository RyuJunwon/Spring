package com.spring.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	// Service 레이어가 개념적(관념적)으로 존재하는데, 그것을 구현한 클래스
	// Service 레이어에서는 DAO를 사용함
	// 	ㄴ> Service 레이어는 C 파트 영역임
	// DAO를 사용할 것이기 때문에
	// DAO와 메소드 시그니처를 맞추면 유리하다
	// 메소드 시그니처를 강제하는 것이 유리하기 때문에 인터페이스를 만들어야 한다.
	
	@Autowired // --> 의존 관계니까 의존 주입을 해야함
	private BoardDAO boardDAO;
	
	@Override
	public BoardVO selectOne(BoardVO bVO) {
		return boardDAO.selectOne(bVO);
	}

	@Override
	public List<BoardVO> selectAll(BoardVO bVO) {
		return boardDAO.selectAll(bVO);
	}

	@Override
	public boolean insert(BoardVO bVO) {
		return boardDAO.insert(bVO);
	}

	@Override
	public boolean update(BoardVO bVO) {
		return boardDAO.update(bVO);
	}

	@Override
	public boolean delete(BoardVO bVO) {
		return boardDAO.delete(bVO);
	}

}
