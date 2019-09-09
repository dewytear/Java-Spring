package com.douzone.di_ex07;

import java.util.ArrayList;

// annotation ��Ű���� Bean��ü�� ����Ѵ�.
import org.springframework.context.annotation.Bean;
// annotation ��Ű���� Configuration��ü�� ����Ѵ�.
import org.springframework.context.annotation.Configuration;

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
@Configuration
public class ConfigApp {

	// Bean ��ü�� ����
	@Bean
	public Player player1(){
		ArrayList<String> position = new ArrayList<String>();
		position.add("����: 4��Ÿ��");
		position.add("����: 1���");

		Player player = new Player("���±�", 32, position);
		player.setHeight(187);
		player.setWeight(105);

		return player;
	}

	// Bean ��ü�� ����
	@Bean
	public Player player2(){
		ArrayList<String> position = new ArrayList<String>();
		position.add("����: 2��Ÿ��");
		position.add("����: ���߼�");

		Player player = new Player("���ٿ�", 30, position);
		player.setHeight(176);
		player.setWeight(80);

		return player;
	}
}
