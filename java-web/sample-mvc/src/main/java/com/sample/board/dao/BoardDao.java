package com.sample.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.board.dto.BoardDto;
import com.sample.board.vo.Board;
import com.sample.util.MybatisUtils;

public class BoardDao {

	private SqlSessionFactory sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	
	private static BoardDao instance = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() {
		return instance;
	}
	
	public void insertBoard(Board board) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.insert("boards.insertBoard", board);
		session.close();
	}
	
	public int getTotalRows() {
		SqlSession session = sqlSessionFactory.openSession();
		int totalRows = session.selectOne("boards.getTotalRows");
		session.close();
		return totalRows;
	}
	
	public List<BoardDto> getBoards(Map<String, Object> param) {
		SqlSession session = sqlSessionFactory.openSession();
		List<BoardDto> boards = session.selectList("boards.getBoards", param);
		session.close();
		return boards;
	}
	
	public BoardDto getBoardDetailByNo(int boardNo) {
		SqlSession session = sqlSessionFactory.openSession();
		BoardDto board = session.selectOne("boards.getBoardDetailByNo", boardNo);
		session.close();
		return board;
	}
	
	public Board getBoardByNo(int boardNo) {
		SqlSession session = sqlSessionFactory.openSession();
		Board board = session.selectOne("boards.getBoardByNo", boardNo);
		session.close();
		return board;
	}
	
	public void updateBoard(Board board) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("boards.updateBoard", board);
		session.close();
	}
	
 }
