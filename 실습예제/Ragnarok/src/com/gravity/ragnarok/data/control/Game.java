package com.gravity.ragnarok.data.control;

import com.gravity.ragnarok.data.img.Entrance;
import com.gravity.ragnarok.data.monster.Orc;
import com.gravity.ragnarok.data.monster.Goblin;
import com.gravity.ragnarok.data.string.Str;
import com.gravity.ragnarok.data.string.User;

public class Game {
	static String cmd = "";
	Orc orc1 = new Orc("오크1", 120, 120, 20);
	Orc orc2 = new Orc("오크2", 120, 120, 20);
	Goblin goblin1 = new Goblin("고블린1", 100, 100, 30);
	Goblin goblin2 = new Goblin("고블린2", 100, 100, 30);
	Goblin goblin3 = new Goblin("고블린3", 100, 100, 30);
		
	public void start() {
		Entrance.show();
		
		User.name = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		User.sex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_GENDER_INPUT);
		User.job = Command.getCommand(Str.CMD_GUIDE_CHARACTER_JOB_INPUT);
		
		String chaName = String.format("당신의 이름은 %s 입니다~", User.name);
		System.out.println(chaName);
		String chaGender= String.format("당신의 성별은 %s 입니다~", User.sex);
		System.out.println(chaGender);
		String chaJob = String.format("당신의 직업은 %s 입니다~", User.job);
		System.out.println(chaJob);
		
		orc1.info();
		orc2.info();
		goblin1.info();
		goblin2.info();
		goblin3.info();
		
		procBattle();
		
		gameRun();
		gameOver(Str.CMD_GUIDE_GAME_OVER_INPUT);
	}
	
	private void gameRun() {
		User.info();
		
		boolean aaa = true;
		while(aaa) {
			String cmd = Command.getCommand("");
			switch(cmd) {
			case "exit": aaa = false;
			break;
			}
		}
	}
	private void gameOver(String guide) {
		System.out.println(guide);
	}
	
	public void procBattle() {
		User.attack();
		goblin1.attack();
	}
	
	public void attack() {
		int useratk = (int)(Math.random()*User.atk)+1;
		goblin1.currentHp = goblin1.currentHp - useratk;
		System.out.println(User.name+"이"+goblin1.name+"에게 공격하여"+useratk+"의 데미지를 주었다.");
	}
}
