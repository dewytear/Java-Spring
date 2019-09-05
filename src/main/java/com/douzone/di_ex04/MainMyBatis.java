package com.douzone.di_ex04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMyBatis {

	public static void main(String[] args) {

		String confLoc = "classpath:myBatis.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		MyBatisService serv = ctx.getBean("service", MyBatisService.class);
		serv.myBatisTest();

		// Spring container ��ü�� close �޼ҵ带 ���� �Ҹ�ȴ�.
		ctx.close();
	}

}
