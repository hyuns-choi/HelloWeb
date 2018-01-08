package com.oraclejava;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class OlympicTag extends SimpleTagSupport {

	private String date="";

	private String result="";


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		checkDate();
		JspWriter out = getJspContext().getOut();
		out.println(result);

	}

	public void checkDate() {
		try {
			Calendar today = Calendar.getInstance();
			Calendar dday1 = Calendar.getInstance();	// ��â

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			dday1.setTime(formatter.parse(date));


			long day1 = dday1.getTimeInMillis() / 86400000;

			long tday = today.getTimeInMillis() / 86400000;
			long nDay = (day1 - tday) + 1;

			result="��â�ø��ȱ��� " + nDay + "�Դϴ�.";

		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			result = "��â�ø��ȱ��� ���� ���߽��ϴ�.";
		} 
	}
}
