package com.oraclejava;

import java.util.Calendar;

public class OlympicCheck {
	private long pyungchang=0;
	private long tokyo=0;
	
	public void check() {
		
		Calendar today = Calendar.getInstance();
		Calendar dday1 = Calendar.getInstance();	// 평창
		Calendar dday2 = Calendar.getInstance();	// 동경
		
		dday1.set(2018,1,9);	// month = 0 base
		dday2.set(2020,6,24);	// month = 0 base
		
		long day1 = dday1.getTimeInMillis() / 86400000;
		long day2 = dday2.getTimeInMillis() / 86400000;
		
		long tday = today.getTimeInMillis() / 86400000;
		pyungchang = (day1 - tday) + 1;
		tokyo = (day2 - tday) + 1;
		
    }

	public long getPyungchang() {
		return pyungchang;
	}

	public void setPyungchang(long pyungchang) {
		this.pyungchang = pyungchang;
	}

	public long getTokyo() {
		return tokyo;
	}

	public void setTokyo(long tokyo) {
		this.tokyo = tokyo;
	}
	
	
}
