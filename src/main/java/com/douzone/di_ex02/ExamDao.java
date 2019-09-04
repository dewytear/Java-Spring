package com.douzone.di_ex02;

public class ExamDao {

	private String msg;

	public ExamDao() {}// 기본 생성자

	public ExamDao(String message) {
		this.msg = message;
	}// 인자 생성자

	public void outputMsg() {
		System.out.println("Message: " + msg);
	}
}
