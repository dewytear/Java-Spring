package com.douzone.di_ex09;

import java.util.ArrayList;
//annotation ��Ű���� Bean��ü�� ����Ѵ�.
import org.springframework.context.annotation.Bean;
//annotation ��Ű���� Configuration��ü�� ����Ѵ�.
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// JAVA�ڵ� �ȿ��� XML�� �ҷ�����
@Configuration
@ImportResource("classpath:baseball4.xml")
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
}
