package com.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.util.MybatisUtils;
import com.sample.vo.Board;

public class BoardDao {
	
	private SqlSessionFactory sqlSessionFactory;

	private static BoardDao instance = new BoardDao();
	private BoardDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	
	public static BoardDao getInstance() {
		return instance;
	}
	
	public void insertBoard(Board board) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.insert("insertBoard", board);
		session.close();
	}
	
	public void updateBoard(Board board) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("updateBoard", board);
		session.close();
	}
	
	public void deleteBoard(int no) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("deleteBoard", no);
		session.close();
	}
	
	public List<Board> getAllBoards() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Board> boards = session.selectList("getAllBoards");
		session.close();
		
		return boards;
	}
	
	public Board getBoardByNo(int boardNo) {
		SqlSession session = sqlSessionFactory.openSession();
		Board board = session.selectOne("getBoardByNo", boardNo);
		session.close();
		
		return board;
	}
	
	
	
	
}
