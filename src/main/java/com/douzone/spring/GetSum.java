package com.douzone.spring;

public class GetSum {

	private int i;
	private int j;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public void sum() {
		System.out.println("���ϱ�");
		int result = i + j;
		System.out.println("��: " + result);
	}

}
