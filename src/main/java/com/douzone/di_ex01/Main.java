package com.douzone.di_ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1. ��������
//		MyGetSum mgs = new MyGetSum();	//main�� MyGetSum�� �������迡 �ִ�.
//
//		mgs.setGetsum(new GetSum());
//		mgs.setA(10);
//		mgs.setB(100);

		// 2. ���������� �̿��Ͽ� ������ ����
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		MyGetSum mgs = ctx.getBean("myGetSum", MyGetSum.class);

		mgs.sum();
	}
}
