package com.xuejun.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuejun.entity.User;
import com.xuejun.service.CheckUserService;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CheckUserService cku=new  CheckUserService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
		RequestDispatcher rd=null;
		String forw=null;
		
		if(uname==null ||upwd == null){
			request.setAttribute("msg","输入用户名或者密码为空");
			forw="/03/Error.jsp";
			rd=request.getRequestDispatcher(forw);
			rd.forward(request, response);
			
		}else{
			User user=new User();
			user.setName(uname);
			user.setPassword(upwd);
			boolean bool=cku.check(user);
			if(bool){
				forw="/03/Sucess.jsp";
				
			}else{
				forw="/03/Error.jsp";
				request.setAttribute("msg","输入用户名或者密码错误");
				
			}
			rd=request.getRequestDispatcher(forw);
			rd.forward(request, response);
		}
		
	}

}
