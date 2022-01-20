package com.gravity.ragnarok.data.string;

import com.gravity.ragnarok.data.monster.Goblin;

public class User {
	static public String name = "";
	static public int currentHp = 200;
	static public int maxHp = 200;
	static public int atk = 50;
	static public String sex = "";
	static public String job = "";
	
	public static void info() {
		System.out.println();
		System.out.println("["+name+" (HP:"+currentHp+"/"+maxHp+") 공격력: "+atk+"]");
	}

	public static void attack() {
		int useratk = (int)(Math.random()*User.atk)+1;
		Goblin.currentHp = User.currentHp - useratk;
		System.out.println(User.name+"이"+Goblin.name+"에게 공격하여"+useratk+"의 데미지를 주었다.");
	}
	
}
