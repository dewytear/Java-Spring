package com.douzone.di_ex04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMyBatis {

	public static void main(String[] args) {

		String confLoc = "classpath:myBatis.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		MyBatisService serv = ctx.getBean("service", MyBatisService.class);
		serv.myBatisTest();

		// Spring container 객체는 close 메소드를 통해 소멸된다.
		ctx.close();
	}

}
