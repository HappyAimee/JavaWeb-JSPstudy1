package com.xuejun.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9214985182093507801L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget方法");	
		String userName=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用户名==》"+userName);
		System.out.println("用户名==》"+password);	
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost方法");	
		String userName=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用户名==》"+userName);
		System.out.println("用户名==》"+password);	
		String forw=null;
		if(userName.equals("123")&& password.equals("123")){
			forw="/03/Sucess.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forw);
			rd.forward(req, resp);
					
			//resp.sendRedirect(req.getContextPath()+"/03/Sucess.jsp");
		}else{
			forw="/03/Error.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forw);
			rd.forward(req, resp);
			//resp.sendRedirect(req.getContextPath()+"/03/Error.jsp");
		}

	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String userName=req.getParameter("uname");
//		String password=req.getParameter("upwd");
//		System.out.println("用户名==》"+userName);
//		System.out.println("用户名==》"+password);		
//}
	
	}
