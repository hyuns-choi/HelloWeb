package com.oraclejava;

import java.io.IOException;
import java.net.PasswordAuthentication;
import java.time.chrono.MinguoEra;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import sun.security.krb5.internal.Authenticator;

public class SendMailTag extends SimpleTagSupport {
	
	private String from="";
	private String to="";
	private String subject="";
	
	private String contents="";
	private String result="";
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
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
		sendMail();
		JspWriter out = getJspContext().getOut();
		out.println(result);
		
	}
	
	public void sendMail() {
		try {
			Properties property = new Properties();
			property.put("mail.smtp.auth", "true");
			property.put("mail.smtp.starttls.enable", "true");
			property.put("mail.smtp.host", "smtp.gmail.com");
			property.put("mail.smtp.port", "587");
			property.put("mail.smtp.debug", "true");
			
			Session session = Session.getInstance(property, 
					new javax.mail.Authenticator() {
						protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
							return new javax.mail.PasswordAuthentication("storytohs", "12313");
						}				
			});	
			
			MimeMessage mimeMessage = new MimeMessage(session);
			
			InternetAddress toAddress = new InternetAddress(to, to);
			
			mimeMessage.setRecipient(Message.RecipientType.TO, toAddress);
			
			InternetAddress fromAddress = new InternetAddress(from, from);
			mimeMessage.setFrom(fromAddress);
			
			mimeMessage.setSubject(subject);
			mimeMessage.setText(contents);
			
			Transport.send(mimeMessage);
			
			result="메일이 성공적으로 전송되었습니다.";
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			result = "편지가 배달되지 못했습니다.";
		} 
	}
	
	
	

}
