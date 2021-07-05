package com.sample.board.controller;

import com.sample.board.exception.CommonException;
import com.sample.board.service.UserService;
import com.sample.board.vo.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.co.jhta.mvc.annotation.Controller;
import kr.co.jhta.mvc.annotation.RequestMapping;
import kr.co.jhta.mvc.annotation.method.RequestMethod;
import kr.co.jhta.mvc.servlet.ModelAndView;

@Controller
public class UserController {

	UserService userService = UserService.getInstance();
	
	@RequestMapping(path = "/login")
	public ModelAndView loginform(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("loginform.jsp");
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("id");
		String password = request.getParameter("password");
		
		try {
			User user = userService.login(userId, password);
			HttpSession session = request.getSession();
			session.setAttribute("LOGIN_USER", user);
			
			return new ModelAndView("redirect:home");
			
		} catch (CommonException e) {
			request.setAttribute("errorType", "로그인 오류");
			request.setAttribute("errorMessage", e.getMessage());
			return new ModelAndView("loginform.jsp");
		}
	}
	
	@RequestMapping(path = "/register")
	public ModelAndView registerform(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("registerform.jsp");
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		try {
			User user = new User(name, id, password);
			userService.addNewUser(user);
			
			return new ModelAndView("redirect:home");
		} catch (CommonException e) {
			request.setAttribute("errorType", "회원가입 오류");
			request.setAttribute("errorMessage", e.getMessage());
			return new ModelAndView("registerform.jsp");
		}
	}
	
	@RequestMapping(path = "/logout")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		
		return new ModelAndView("redirect:home");
	}
}
