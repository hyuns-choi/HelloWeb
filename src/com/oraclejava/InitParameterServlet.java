package com.oraclejava;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitParameterServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		System.out.println("����� ���̴� " + config.getInitParameter("age"));
	}
}
