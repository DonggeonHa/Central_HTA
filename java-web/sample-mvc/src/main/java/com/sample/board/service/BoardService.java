package com.sample.board.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sample.board.dao.BoardDao;
import com.sample.board.dto.BoardDto;
import com.sample.board.vo.Board;

import kr.co.jhta.util.pagination.Pagination;

public class BoardService {

	private BoardDao boardDao = BoardDao.getInstance();
	
	private static BoardService instance = new BoardService();
	private BoardService() {}
	public static BoardService getInstance() {
		return instance;
	}
	
	public void addNewBoard(Board board) {
		boardDao.insertBoard(board);
	}
	
	public Pagination getPagination(int page) {
		int totalRows = boardDao.getTotalRows();
		return new Pagination(page, totalRows);
	}
	
	public List<BoardDto> getBoardList(int beginIndex, int endIndex) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("beginIndex", beginIndex);
		param.put("endIndex", endIndex);
		
		return boardDao.getBoards(param);
	}
	
	public BoardDto getBoardDetail(int boardNo) {
		Board board = boardDao.getBoardByNo(boardNo);
		board.setViewCount(board.getViewCount() + 1);
		board.setUpdatedDate(new Date());
		boardDao.updateBoard(board);
		
		return boardDao.getBoardDetailByNo(boardNo);
	}
	
	public Board getBoard(int boardNo) {
		return boardDao.getBoardByNo(boardNo);
	}
	
	public void deleteBoard(int boardNo) {
		Board board = boardDao.getBoardByNo(boardNo);
		
		Date now = new Date();
		board.setDeleted("Y");
		board.setDeletedDate(now);
		board.setUpdatedDate(now);
		
		boardDao.updateBoard(board);
	}
	
	public void updateBoard(Board board) {
		Board savedBoard = boardDao.getBoardByNo(board.getNo());
		savedBoard.setTitle(board.getTitle());
		savedBoard.setContent(board.getContent());
		savedBoard.setUpdatedDate(new Date());
		
		boardDao.updateBoard(savedBoard);
	}
}
