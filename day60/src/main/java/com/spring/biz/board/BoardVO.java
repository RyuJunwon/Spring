package com.spring.biz.board;

public class BoardVO {
	private int bid;
	private String title;
	private String content;
	private String writer;
	private int cnt;
	
	
	private String SearchCondition;
	private String SearchContent;
	
	
	public String getSearchConditions() {
		return SearchCondition;
	}

	public void setSearchConditions(String searchCondition) {
		SearchCondition = searchCondition;
	}

	public String getSearchContent() {
		return SearchContent;
	}

	public void setSearchContent(String searchContent) {
		SearchContent = searchContent;
	}

	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
		}

	@Override
	public String toString() {
		return "BoardVO [ bid = " + bid + ", title = " + title + ", content = " + content + ", writer = " + writer + ", cnt = "
				+ cnt + " ]";
	}
	
	
}
