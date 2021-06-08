package com.sample.web.todo;

import java.io.IOException;
import java.util.List;

import com.sample.dao.TodoDao;
import com.sample.vo.Todo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/todo/main")
public class TodoMainServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 가장 최근에 등록된 일정 5개 조회하기
		TodoDao todoDao = TodoDao.getInstance();
		List<Todo> todos =  todoDao.getNewTodos();
		
		// 요청객체에 조회된 데이터를 속성으로 저장한다.
		request.setAttribute("newTodos", todos);

		// main.jsp로 내부이동시킨다.
		request.getRequestDispatcher("/WEB-INF/views/todo/main.jsp").forward(request, response);
	}

}
