package com.oraclejava;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FontTag extends SimpleTagSupport {
	private int size = 0; // ÇÈ¼¿
	private String face = ""; //±Û²Ã
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	
	StringWriter sw = new StringWriter();
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		if(size == 0) size = 12;
		if("".equals(face)) face="µ¸¿ò";
		
		getJspBody().invoke(sw);
		getJspContext().getOut().println("<span style=\"font-size:"+size+
				"px;font-family:" + face + "\">" + sw.toString() + "</span>"
				);
		
	}
	
	
			

}
