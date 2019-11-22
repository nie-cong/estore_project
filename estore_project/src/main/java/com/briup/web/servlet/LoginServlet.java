package com.briup.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.common.exception.UserException;
import com.briup.service.LoginService;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	LoginService loginService = new LoginService();
	String selectPasswordByUsername=null;
	selectPasswordByUsername = loginService.selectPasswordByUsername(username);
	if(selectPasswordByUsername!=null) {
		System.out.println(selectPasswordByUsername);
		//判断密码
		if(selectPasswordByUsername.equals(password)) {
			//密码和用户都正确
			HttpSession session = req.getSession();
			session.setAttribute("username", username);;
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("usenamefalse.html").forward(req, resp);
			new UserException("密码不正确");
		}
		
	}else {
		req.getRequestDispatcher("passwordfalse,html").forward(req, resp);
		new UserException("用户不存在不正确");
	}
	
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	
}
}
