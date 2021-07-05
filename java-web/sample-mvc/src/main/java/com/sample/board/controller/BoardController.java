package com.sample.board.controller;

import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

import com.sample.board.dto.BoardDto;
import com.sample.board.service.BoardService;
import com.sample.board.vo.Board;
import com.sample.board.vo.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.co.jhta.mvc.annotation.Controller;
import kr.co.jhta.mvc.annotation.RequestMapping;
import kr.co.jhta.mvc.annotation.method.RequestMethod;
import kr.co.jhta.mvc.servlet.ModelAndView;
import kr.co.jhta.util.pagination.Pagination;

@Controller
public class BoardController {
	
	private BoardService boardService = BoardService.getInstance();

	@RequestMapping(path = "/board/list")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
		
		int page = NumberUtils.toInt(request.getParameter("page"), 1);
	
		Pagination pagination = boardService.getPagination(page);
		
		int beginIndex = (page - 1)*pagination.getSize() + 1;
		int endIndex = page*pagination.getSize();
		List<BoardDto> boards = boardService.getBoardList(beginIndex, endIndex);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/list.jsp");
		mav.addAttribute("boards", boards);
		mav.addAttribute("pagination", pagination);
		
		return mav;
	}
	
	@RequestMapping(path = "/board/register")
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("board/form.jsp");
	}
	
	@RequestMapping(path = "/board/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("LOGIN_USER");
		if (user == null) {
			request.setAttribute("errorType", "서비스 거부");
			request.setAttribute("errorMessage", "게시글 작성은 로그인 후 가능합니다.");
			return new ModelAndView("/loginform.jsp");
		}
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Board board = new Board();
		board.setTitle(title);
		board.setContent(content);
		board.setUserNo(user.getNo());
		
		boardService.addNewBoard(board);
		
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping(path = "/board/detail")
	public ModelAndView detail(HttpServletRequest request, HttpServletResponse response) {
		int boardNo = NumberUtils.toInt(request.getParameter("no"));
		
		BoardDto board = boardService.getBoardDetail(boardNo);
		if (board == null) {
			request.setAttribute("errorType", "글번호 오류");
			request.setAttribute("errorMessage", "존재하지 않는 글번호입니다.");
			return new ModelAndView("/list.jsp");
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/detail.jsp");
		mav.addAttribute("board", board);
		
		return mav;
	}
	
	@RequestMapping(path = "/board/delete")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("LOGIN_USER");
		if (user == null) {
			request.setAttribute("errorType", "서비스 거부");
			request.setAttribute("errorMessage", "게시글 삭제는 로그인 후 가능합니다.");
			return new ModelAndView("/loginform.jsp");
		}
		
		int boardNo = NumberUtils.toInt(request.getParameter("no"));
		int page = NumberUtils.toInt(request.getParameter("page"), 1);
		
		boardService.deleteBoard(boardNo);
		
		return new ModelAndView("redirect:list?page=" + page);
	}
	
	@RequestMapping(path = "/board/modify")
	public ModelAndView modifyform(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("LOGIN_USER");
		if (user == null) {
			request.setAttribute("errorType", "서비스 거부");
			request.setAttribute("errorMessage", "게시글 수정은 로그인 후 가능합니다.");
			return new ModelAndView("/loginform.jsp");
		}
		
		int boardNo = NumberUtils.toInt(request.getParameter("no"));
		Board board = boardService.getBoard(boardNo);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/modifyform.jsp");
		mav.addAttribute("board", board);
		
		return mav;
	}
	
	@RequestMapping(path = "/board/modify", method = RequestMethod.POST)
	public ModelAndView modify(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("LOGIN_USER");
		if (user == null) {
			request.setAttribute("errorType", "서비스 거부");
			request.setAttribute("errorMessage", "게시글 수정은 로그인 후 가능합니다.");
			return new ModelAndView("/loginform.jsp");
		}
		
		int page = NumberUtils.toInt(request.getParameter("page"), 1);
		int no = NumberUtils.toInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Board board = new Board();
		board.setNo(no);
		board.setTitle(title);
		board.setContent(content);
		board.setUserNo(user.getNo());
		
		boardService.updateBoard(board);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:detail?no=" + no + "&page=" + page);
		
		return mav;
	}
}
