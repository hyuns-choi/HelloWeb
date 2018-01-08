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
			Calendar dday1 = Calendar.getInstance();	// 평창

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			dday1.setTime(formatter.parse(date));


			long day1 = dday1.getTimeInMillis() / 86400000;

			long tday = today.getTimeInMillis() / 86400000;
			long nDay = (day1 - tday) + 1;

			result="평창올림픽까지 " + nDay + "입니다.";

		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			result = "평창올림픽까지 알지 못했습니다.";
		} 
	}
}
