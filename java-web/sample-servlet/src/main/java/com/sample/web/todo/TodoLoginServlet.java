package com.sample.web.todo;

import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;

import com.sample.dao.UserDao;
import com.sample.vo.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/login")
public class TodoLoginServlet extends HttpServlet {

	// GET방식의 /todo/login 요청이 왔을 때 실행되는 메소드 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/todo/loginform.jsp").forward(req, resp);
	}
	
	// POST방식의 /todo/login 요청이 왔을 때 실행되는 메소드
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 폼 입력값을 요청파라미터로 조회
		String id = req.getParameter("userid");
		String password = req.getParameter("password");
		
		// 아이디로 사용자 정보 조회
		UserDao userDao = UserDao.getInstance();
		User savedUser = userDao.getUserById(id);
		
		// 사용자정보가 존재하지 않으면 로그인폼을 재요청
		if (savedUser == null) {
			resp.sendRedirect("/todo/login?fail=invalid");
			return;
		}
		// 탈퇴처리된 사용자라면 로그인폼을 재요청
		if (!savedUser.getStatus().equals("active")) {
			resp.sendRedirect("/todo/login?fail=invalid");
			return;
		}
		// 비밀번호가 일치하지 않으면 로그인폼을 재요청
		String shaPassword = DigestUtils.sha256Hex(password);
		if (!shaPassword.equals(savedUser.getPassword())) {
			resp.sendRedirect("/todo/login?fail=invalid");
			return;
		}
		
		// 인증이 완료된 사용자정보를 세션객체에 속성으로 저장하기
		HttpSession session = req.getSession();
		session.setAttribute("LOGIN_USER", savedUser);
		
		// 로그인된 사용자가 등록한 일정을 요청하는 URL을 재요청하게 함
		resp.sendRedirect("/todo/list");
		
	}
}








