package com.douzone.di_ex02;

public class ExamDao {

	private String msg;

	public ExamDao() {}

	public ExamDao(String message) {
		this.msg = message;
	}// 昔切 持失切

	public void outputMsg() {
		System.out.println("Message: " + msg);
	}
}
