package com.douzone.di_ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1. ��������
//		MyGetSum myGetSum = new MyGetSum();	//main�� MyGetSum�� �������迡 �ִ�.
//
//		myGetSum.setGetsum(new GetSum());
//		myGetSum.setA(10);
//		myGetSum.setB(100);

		// 2. DI�̿�
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		MyGetSum myGetSum = ctx.getBean("myGetSum", MyGetSum.class);

		myGetSum.sum();
	}
}
