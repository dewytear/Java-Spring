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

	// setter 설정메소드를 사용하여 의존성 주입
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
