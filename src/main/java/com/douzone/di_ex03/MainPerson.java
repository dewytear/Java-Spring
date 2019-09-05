package com.douzone.di_ex03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {

		// �������Ͽ��� PersonInfoŬ������ �����ͼ� DP
		String confLoc = "classpath:person.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		PersonInfo pi = ctx.getBean("personInfo", PersonInfo.class);
		pi.getPerson();

		// �������Ͽ��� PersonŬ������ �����ͼ� ����� �� DP
		Person ps = ctx.getBean("person2", Person.class);
		pi.setPerson(ps);
		pi.getPerson();

		// Spring container ��ü�� close �޼ҵ带 ���� �Ҹ�ȴ�.
		ctx.close();
	}
}
