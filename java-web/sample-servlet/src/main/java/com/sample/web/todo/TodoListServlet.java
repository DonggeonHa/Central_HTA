package com.sample.web.todo;

import java.io.IOException;
import java.util.List;

import com.sample.dao.TodoDao;
import com.sample.vo.Todo;
import com.sample.vo.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/list")
public class TodoListServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청한 사용자가 사용자인증이 완료된 사용자인지 확인하기
		HttpSession session = request.getSession();
		User loginedUser = (User) session.getAttribute("LOGIN_USER");
		if (loginedUser == null) {
			response.sendRedirect("/todo/login?fail=deny");	
			return;
		}
		
		// 로그인사용자정보가 존재하면 사용자아이드를 조회한다.
		String loginedUserId = loginedUser.getId();
		System.out.println("아이디: " + loginedUserId);
		
		// 로그인된 사용자가 등록한 일정정보를 조회해서 요청객체에 속성으로 저장하고,
		TodoDao todoDao = TodoDao.getInstance();
		List<Todo> todos = todoDao.getTodosByUserId(loginedUserId);
		request.setAttribute("todos", todos);
		
		// JSP페이지로 내부이동시킨다.
		request.getRequestDispatcher("/WEB-INF/views/todo/todos.jsp").forward(request, response);
	}
}
