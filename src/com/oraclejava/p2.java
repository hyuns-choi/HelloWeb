package com.oraclejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class p2
 */
@WebServlet("/p2")
public class p2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public p2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name, email;
		name = request.getParameter("txtName");
		email = request.getParameter("txtEmail");
		
		Cookie Cname = new Cookie("Cname", name);
		Cookie Cemail = new Cookie("Cemail", email);
		
		response.addCookie(Cname);
		response.addCookie(Cemail);
		
		response.sendRedirect("/HelloWeb/p3");
		
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.println(name);
//		out.println(email);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
