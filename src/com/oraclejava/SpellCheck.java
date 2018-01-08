package com.oraclejava;

public class SpellCheck {
	private String word;
	
	public SpellCheck() {
		
	}
	// 문자열을 뒤집는 메소드
	public String reverse() {
		return (new StringBuffer(word).reverse()).toString();
	}
	// 철자검사 :그냥 true를 넘기자
	public boolean check() {
		return true;
	}
	public String getWord() {
		return word;
	}
	// word속성의 값을 설정
	public void setWord(String word) {
		this.word = word;
	}
	
}
