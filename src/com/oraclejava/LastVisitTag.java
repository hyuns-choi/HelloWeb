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
		String msg="당신은 이곳을 처음 방문...";
		boolean found = false;
		// pageContext는 범용적인 ServletRequest, ServletResponse를 돌려주며 쿠키는 지원안함
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
			// 쿠키를 새로 생성 후 만료일을 표시
			info = new Cookie("MyCookie", newValue);
			info.setMaxAge(60*1);
			info.setPath("/");
			
			((HttpServletResponse)pageContext.getResponse()).addCookie(info);
		}
		else {
			long conv = new Long(info.getValue()).longValue();
			msg = "당신의 마지막 방문은 " + new Date(conv);
			
			info.setValue(newValue);
			info.setMaxAge(10*24*60*60); // 10일
			info.setPath("/");
			((HttpServletResponse)pageContext.getResponse()).addCookie(info);
		}
		
		JspWriter out = getJspContext().getOut();
		out.print(msg);
	}
}
