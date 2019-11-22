package com.briup.web.servlet;


import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.SUser;
import com.briup.common.exception.UserException;
import com.briup.service.RegisterService;


@WebServlet("/register")
public class RegisterServlet  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String zip = req.getParameter("zip");
		String address = req.getParameter("address");
		String telephone = req.getParameter("telephone");
		String email = req.getParameter("email");
		//将用户输入的信息放到对象中，让你后给Service进行判断
		SUser user = new SUser(username,password,zip,address,telephone,email,new Date());
		
		System.out.println(user);
		
		RegisterService service = new RegisterService();
		//判断用户是否存在
		
		String passwordByUsername=null;
		passwordByUsername = service.selectPasswordByUsername(username);
		if(passwordByUsername!=null) {
			new UserException("用户已存在");
			req.getRequestDispatcher("usenamealreadyin.html").forward(req, resp);
			
		}else {
			service.addUser(user);
			System.out.println("用户注册成功");
			req.getRequestDispatcher("login.html").forward(req, resp);
		}	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
		
}
