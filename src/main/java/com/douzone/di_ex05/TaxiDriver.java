package com.douzone.di_ex05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TaxiDriver {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:taxi.xml");
		Taxi taxi = ctx.getBean("taxi", Taxi.class);
		taxi.drive();

		ctx.close();

	}//main

}//class
