package com.sample.board.web.board;

import java.io.IOException;
import java.net.URLEncoder;

import com.sample.board.dao.BoardDao;
import com.sample.board.vo.Board;
import com.sample.board.vo.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/board/register")
public class RegisterServlet extends HttpServlet {

	BoardDao boardDao = BoardDao.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인여부를 체크하기
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("LOGIN_USER");
		if (loginUser == null) {
			response.sendRedirect("../user/login?fail=deny&job=" + URLEncoder.encode("글쓰기", "utf-8"));
			return;
		}
		// 게시글 입력폼 페이지로 내부이동 시키기
		request.getRequestDispatcher("/WEB-INF/views/board/form.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인여부를 체크하기
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("LOGIN_USER");
		if (loginUser == null) {
			response.sendRedirect("../user/login?fail=deny&job=" + URLEncoder.encode("글등록", "utf-8"));
			return;
		}
		
		// 한글처리를 위한 인코딩 설정하기
		request.setCharacterEncoding("utf-8");
		// 요청파라미터에서 폼입력값 조회하기
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		// Board객체를 생성해서 새 게시글 제목, 작성자아이디, 내용을 저장하기
		Board board = new Board();
		board.setTitle(title);
		board.setUserId(loginUser.getId());
		board.setContent(content);
		// 새 게시글정보를 데이터베이스에 저장하기
		boardDao.insertBoard(board);
		
		// 게시글 목록을 재요청하는 URL을 응답으로 보내기
		response.sendRedirect("list");
	}
}
