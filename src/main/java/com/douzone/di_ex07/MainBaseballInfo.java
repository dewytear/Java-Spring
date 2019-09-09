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
		System.out.println("선수이름: " + player1.getName());
		System.out.println("나이: " + player1.getAge());
		System.out.println("포지션: " + player1.getPosition());
		System.out.println("키: " + player1.getHeight());
		System.out.println("몸무게: " + player1.getWeight());

		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println("선수이름: " + player2.getName());
		System.out.println("나이: " + player2.getAge());
		System.out.println("포지션: " + player2.getPosition());
		System.out.println("키: " + player2.getHeight());
		System.out.println("몸무게: " + player2.getWeight());

		ctx.close();

		/* -  Exception: CGLIB(Byte Code Generation Library)
		 * Exception in thread "main" java.lang.IllegalStateException: CGLIB is required
		 * to process @Configuration classes. Either add CGLIB to the classpath or
		 * remove the following
		 * @Configuration bean definitions: [daoFactory]
		 *
		 * 위의 에러발생으로 인해
		 * pom.xml 에 다음과 같이 기술해주어 해당 라이브러리를 다운받음
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
