package com.sample.web.todo;

import java.io.IOException;
import java.util.Date;

import com.sample.dao.TodoDao;
import com.sample.vo.Todo;
import com.sample.vo.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/del")
public class TodoDeleteServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인한 사용자인지 체크
		HttpSession session = request.getSession();
		User loginedUser = (User) session.getAttribute("LOGIN_USER");
		if (loginedUser == null) {
			response.sendRedirect("/todo/login?fail=deny");
			return;
		}
		// 요청파라미터에서 삭제처리할 일정번호 조회
		int no = Integer.parseInt(request.getParameter("no"));
		
		// 일정정보 조회
		TodoDao todoDao = TodoDao.getInstance();
		Todo todo = todoDao.getTodoByNo(no);
		
		// 일정정보의 상태를 삭제 상태로 변경, 삭제일 추가
		todo.setStatus("삭제");
		todo.setDeletedDate(new Date());
		
		// 변경된 일정정보를 데이터베이스에 반영
		todoDao.updateTodo(todo);
		
		// 나의 일정목록을 재요청하는 URL을 응답으로 보내기
		response.sendRedirect("/todo/list");
	}
}







