package com.oraclejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Counter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String message;
		MsgBean bean;
		HttpSession session = request.getSession(false);
		
		if(session == null || session.getAttribute("message") == null) {
			// 技记捞 绝促搁 积己
			session = request.getSession(true);
			//message = "1";
			bean = new MsgBean();
			bean.setMsg("1");
		} else {
			bean = (MsgBean) session.getAttribute("message");
			bean.setMsg(new Integer(Integer.parseInt(bean.getMsg()) + 1).toString());	
		}
		
		session.setAttribute("message", bean);
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Counter</title></head><body><p>" +
		bean.getMsg() + "</p></body></html>" 
				);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
