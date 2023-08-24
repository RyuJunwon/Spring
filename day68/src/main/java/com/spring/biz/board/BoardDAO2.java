package com.spring.biz.board;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.biz.common.JDBCUtil;

@Repository("boardDAO") // @Component를 상속받은 @
public class BoardDAO2 {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String insert="INSERT INTO BOARD (BID,TITLE,CONTENT,WRITER) VALUES((SELECT NVL(MAX(BID),0)+1 FROM BOARD),?,?,?)";
	private final String selectOne="SELECT * FROM BOARD WHERE BID=?"; // getOne
	private final String selectAll="SELECT * FROM BOARD ORDER BY BID DESC"; // getAll
	private final String selectAll_TITLE="SELECT * FROM BOARD WHERE TITLE LIKE '%'||?||'%' ORDER BY BID DESC";
	private final String selectAll_WRITER="SELECT * FROM BOARD WHERE WRITER LIKE '%'||?||'%' ORDER BY BID DESC";
	private final String update="UPDATE BOARD SET TITLE=?,CONTENT=? WHERE BID=?";
	private final String update_CNT="UPDATE BOARD SET CNT=CNT+1 WHERE BID=?";
	private final String delete="DELETE FROM BOARD WHERE BID=?";

	public BoardVO selectOne(BoardVO bVO) {
		System.out.println("BoardDAO2 로그 selectOne() 메서드");
		Object[] args = { bVO.getBid() };
		return jdbcTemplate.queryForObject(selectOne, args, new BoardRowMapper());
	}
	
	public List<BoardVO> selectAll(BoardVO bVO) {
		System.out.println("BoardDAO2 로그 selectAll() 메서드");
		return jdbcTemplate.query(selectAll ,new BoardRowMapper());
	}

	public boolean insert(BoardVO bVO) {
		System.out.println("BoardDAO2 로그 insert() 메서드");
		
		int result = jdbcTemplate.update(insert, bVO.getBid(), bVO.getTitle(), bVO.getContent(), bVO.getWriter());
		
		if(result <= 0) {
			return false;
		}
		return true;
	}
	
	public boolean update(BoardVO bVO) {
		System.out.println("BoardDAO2 로그 update() 메서드");
		int result = jdbcTemplate.update(update, bVO.getTitle(), bVO.getContent(), bVO.getBid());
		
		if(result <= 0) {
			return false;
		}
		return true;

	}
	public boolean delete(BoardVO bVO) {
		System.out.println("BoardDAO2 로그 delete() 메서드");
	int result = jdbcTemplate.update(delete, bVO.getBid());
		
		if(result <= 0) {
			return false;
		}
		return true;
	}
}

class BoardRowMapper implements RowMapper<BoardVO> {

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO data = new BoardVO();
		data.setBid(rs.getInt("BID"));
		data.setCnt(rs.getInt("CNT"));
		data.setContent(rs.getString("CONTENT"));
		data.setTitle(rs.getString("TITLE"));
		data.setWriter(rs.getString("WRITER"));
		return data;
	}
	
}



