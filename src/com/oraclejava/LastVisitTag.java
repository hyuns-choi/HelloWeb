package com.oraclejava;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class LastVisitTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		Cookie info = null;
		String msg="����� �̰��� ó�� �湮...";
		boolean found = false;
		// pageContext�� �������� ServletRequest, ServletResponse�� �����ָ� ��Ű�� ��������
		PageContext pageContext = (PageContext)getJspContext();
		Cookie[] cookies= ((HttpServletRequest)pageContext.getRequest()).getCookies();
		
		for(int i=0; i<cookies.length; i++) {
			info = cookies[i];
			if(info.getName().equals("MyCookie")) {
				found = true;
				break;
			}
		}
		String newValue = "" + System.currentTimeMillis();
		if(!found) {
			// ��Ű�� ���� ���� �� �������� ǥ��
			info = new Cookie("MyCookie", newValue);
			info.setMaxAge(60*1);
			info.setPath("/");
			
			((HttpServletResponse)pageContext.getResponse()).addCookie(info);
		}
		else {
			long conv = new Long(info.getValue()).longValue();
			msg = "����� ������ �湮�� " + new Date(conv);
			
			info.setValue(newValue);
			info.setMaxAge(10*24*60*60); // 10��
			info.setPath("/");
			((HttpServletResponse)pageContext.getResponse()).addCookie(info);
		}
		
		JspWriter out = getJspContext().getOut();
		out.print(msg);
	}
}
