package com.oraclejava;

public class SpellCheck {
	private String word;
	
	public SpellCheck() {
		
	}
	// ���ڿ��� ������ �޼ҵ�
	public String reverse() {
		return (new StringBuffer(word).reverse()).toString();
	}
	// ö�ڰ˻� :�׳� true�� �ѱ���
	public boolean check() {
		return true;
	}
	public String getWord() {
		return word;
	}
	// word�Ӽ��� ���� ����
	public void setWord(String word) {
		this.word = word;
	}
	
}
