package com.douzone.di_ex09;

import java.util.ArrayList;
//annotation 패키지의 Bean객체를 사용한다.
import org.springframework.context.annotation.Bean;
//annotation 패키지의 Configuration객체를 사용한다.
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// JAVA코드 안에서 XML을 불러오기
@Configuration
@ImportResource("classpath:baseball4.xml")
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
}
