package com.douzone.di_ex06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBaseball {

	public static void main(String[] args) {

		String confLoc = "classpath:baseball1.xml";
		String confLoc2 = "classpath:baseball2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc, confLoc2);
		Player player1 = ctx.getBean("player1", Player.class);
		System.out.print(player1.getName());
		System.out.println("(" + player1.getAge() + "��)");
		System.out.println(player1.getPosition());
		System.out.println("------------------");

		PlayerInfo playerinfo = ctx.getBean("playerInfo1", PlayerInfo.class);
		Player player2 = playerinfo.getPlayer();
		System.out.print(player2.getName());
		System.out.println("(" + player2.getAge() + "��)");
		System.out.println(player2.getPosition());
		System.out.println("------------------");

		/*������
		 * System.out.println("---------------------");
		 * if(player1.equals(player2)) {
		 * System.out.println("���� ���� �����Դϴ�.");
		 * }else {
		 * System.out.println("���� �ٸ� �����Դϴ�.");
		 * }
		 * System.out.println("---------------------");
		 */

		Player player3 = ctx.getBean("player3", Player.class);
		System.out.print(player3.getName());
		System.out.println("(" + player3.getAge() + "��)");
		System.out.println(player3.getPosition());
		System.out.println("------------------");

		BaseballTeam baseballTeam = ctx.getBean("baseballTeam", BaseballTeam.class);
		System.out.println("����: " + baseballTeam.getNameTeam());
		System.out.println("����: " + baseballTeam.getManager());
		System.out.println("Ÿ����ġ: " + baseballTeam.getBattingCoach());
		System.out.println("������ġ: " + baseballTeam.getPitchingCoach());
		System.out.println("Ÿ��: " + baseballTeam.getHitter());
		System.out.println("����: " + baseballTeam.getPitcher());

		ctx.close();

	}

}
