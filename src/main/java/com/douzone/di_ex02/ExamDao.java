package com.douzone.di_ex02;

public class ExamDao {

	private String msg;

	public ExamDao() {}// �⺻ ������

	public ExamDao(String message) {
		this.msg = message;
	}// ���� ������

	public void outputMsg() {
		System.out.println("Message: " + msg);
	}
}
