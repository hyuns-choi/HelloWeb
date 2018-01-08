package com.oraclejava;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SampleSessionListener implements HttpSessionListener, HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub

		System.out.println("���� �Ӽ� �߰�");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���� �Ӽ� ����");

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���� �Ӽ� ����");
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		String sId = arg0.getSession().getId();
		System.out.println("�ű�id: "+sId+ " ����");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		String sId = arg0.getSession().getId();
		System.out.println("����id: "+sId+ " ����");
	}

}
