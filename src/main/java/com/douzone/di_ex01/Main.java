package com.douzone.di_ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1. 읜존관계
//		MyGetSum myGetSum = new MyGetSum();	//main과 MyGetSum은 의존관계에 있다.
//
//		myGetSum.setGetsum(new GetSum());
//		myGetSum.setA(10);
//		myGetSum.setB(100);

		// 2. DI이용
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		MyGetSum myGetSum = ctx.getBean("myGetSum", MyGetSum.class);

		myGetSum.sum();
	}
}
