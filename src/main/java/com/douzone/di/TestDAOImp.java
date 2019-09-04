package com.douzone.di;

public class TestDAOImp implements TestDAO {
	// @Override: jdk5에서부터 추가된 annotion의 하나이다. 말그대로 상위 클래스에서 오버라이드한 메소드라는 것을 지칭
	@Override
	public void printMsg() {
		System.out.println("TestDAO_Imp의 printMsg()메소드 입니다.");
	}
}
