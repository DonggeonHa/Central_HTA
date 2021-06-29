package com.sample.board.web.user;

import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;

import com.sample.board.dao.UserDao;
import com.sample.board.vo.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
	
	UserDao userDao = UserDao.getInstance();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 페이지로 내부이동 시키기
		request.getRequestDispatcher("/WEB-INF/views/user/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청파라미터에서 로그인폼 입력값 조회하기
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 아이디로 사용자 정보를 조회하기
		User user = userDao.getUserById(id);
		// 사용자 정보가 존재하지 않으면 로그인 페이지를 재요청하는 URL을 응답으로 보내기
		if (user == null) {
			response.sendRedirect("login?fail=invalid");
			return;
		}
		// 비밀번호가 일치하지 않으면 로그인 페이지를 재요청하는 URL을 응답으로 보내기
		if (!user.getPassword().equals(DigestUtils.sha256Hex(password))) {
			response.sendRedirect("login?fail=invalid");
			return;
		}
		
		// 로그인을 요청한 사용자정보를 세션객체에 속성으로 저장하기
		HttpSession session = request.getSession();
		session.setAttribute("LOGIN_USER", user);
		
		// 메인 페이지를 재요청하는 URL을 응답으로 보내기
		response.sendRedirect("../main");
	}
}
