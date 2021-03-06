package com.douzone.di_ex02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ExamMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:examDao.xml");
		ExamDao ed = ctx.getBean("examDao", ExamDao.class);

		ed.outputMsg();

		// Spring container 객체는 close 메소드를 통해 소멸된다.
		ctx.close();
	}

}
