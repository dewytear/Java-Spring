package com.douzone.spring;

public class main {

	public static void main(String[] args) {

		GetSum gs = new GetSum();	//main과 GetSum은 의존관계에 있다.

		gs.setI(100);
		gs.setJ(200);

		gs.sum();

	}

}
