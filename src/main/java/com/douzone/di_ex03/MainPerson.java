package com.douzone.di_ex03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {

		// 설정파일에서 PersonInfo클래스를 가져와서 DP
		String confLoc = "classpath:person.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		PersonInfo pi = ctx.getBean("personInfo", PersonInfo.class);
		pi.getPerson();

		// 설정파일에서 Person클래스를 가져와서 재셋팅 후 DP
		Person ps = ctx.getBean("person2", Person.class);
		pi.setPerson(ps);
		pi.getPerson();

		// Spring container 객체는 close 메소드를 통해 소멸된다.
		ctx.close();
	}
}
