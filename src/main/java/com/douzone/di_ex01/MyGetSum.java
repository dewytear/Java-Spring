package com.douzone.di_ex01;

public class MyGetSum {
	GetSum getsum;
	private int a;
	private int b;

	public MyGetSum() {

	}

	public void sum() {
		getsum.sum(a, b);
	}

	// setter �����޼ҵ带 ����Ͽ� ������ ����
	public void setGetsum(GetSum gs) {
		this.getsum = gs;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}
}
