package com.douzone.di_ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBaseballInfo {

	public static void main(String[] args) {

		/*
		 * AbstractApplicationContext
		 *  - GenericXmlApplicationContext
		 *     - AnnotationConfigApplicationContext
		 */
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
		Player player1 = ctx.getBean("player1", Player.class);
		System.out.println("�����̸�: " + player1.getName());
		System.out.println("����: " + player1.getAge());
		System.out.println("������: " + player1.getPosition());
		System.out.println("Ű: " + player1.getHeight());
		System.out.println("������: " + player1.getWeight());

		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println("�����̸�: " + player2.getName());
		System.out.println("����: " + player2.getAge());
		System.out.println("������: " + player2.getPosition());
		System.out.println("Ű: " + player2.getHeight());
		System.out.println("������: " + player2.getWeight());

		ctx.close();

		/* -  Exception: CGLIB(Byte Code Generation Library)
		 * Exception in thread "main" java.lang.IllegalStateException: CGLIB is required
		 * to process @Configuration classes. Either add CGLIB to the classpath or
		 * remove the following
		 * @Configuration bean definitions: [daoFactory]
		 *
		 * ���� �����߻����� ����
		 * pom.xml �� ������ ���� ������־� �ش� ���̺귯���� �ٿ����
			( https://mvnrepository.com/artifact/cglib )
		 *
			<!-- https://mvnrepository.com/artifact/cglib/cglib -->
			<dependency>
			    <groupId>cglib</groupId>
			    <artifactId>cglib</artifactId>
			    <version>3.3.0</version>
			</dependency>
		 */
	}

}
