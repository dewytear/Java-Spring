package com.douzone.di_ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1. 읜존관계
//		MyGetSum mgs = new MyGetSum();	//main과 MyGetSum은 의존관계에 있다.
//
//		mgs.setGetsum(new GetSum());
//		mgs.setA(10);
//		mgs.setB(100);

		// 2. 설정파일을 이용하여 의존성 주입
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		MyGetSum mgs = ctx.getBean("myGetSum", MyGetSum.class);

		mgs.sum();
	}
}
