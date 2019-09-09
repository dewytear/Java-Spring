package com.douzone.di_ex07;

import java.util.ArrayList;

// annotation 패키지의 Bean객체를 사용한다.
import org.springframework.context.annotation.Bean;
// annotation 패키지의 Configuration객체를 사용한다.
import org.springframework.context.annotation.Configuration;

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
@Configuration
public class ConfigApp {

	// Bean 객체를 생성
	@Bean
	public Player player1(){
		ArrayList<String> position = new ArrayList<String>();
		position.add("공격: 4번타자");
		position.add("수비: 1루수");

		Player player = new Player("김태균", 32, position);
		player.setHeight(187);
		player.setWeight(105);

		return player;
	}

	// Bean 객체를 생성
	@Bean
	public Player player2(){
		ArrayList<String> position = new ArrayList<String>();
		position.add("공격: 2번타자");
		position.add("수비: 내야수");

		Player player = new Player("정근우", 30, position);
		player.setHeight(176);
		player.setWeight(80);

		return player;
	}
}
