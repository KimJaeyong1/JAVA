package com.gravity.ragnarok.data.monster;

import com.gravity.ragnarok.data.string.User;

public class Orc {
	String name;
	int currentHp;
	int maxHp;
	int atk;
	
	public Orc(String name, int currentHp, int maxHp, int atk) {
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}
	
	public void info() {
		System.out.print("["+this.name+" (HP:"+this.currentHp+"/"+this.maxHp+") 공격력: "+this.atk+"]");
	}
	
	public void attack() {
		int orcatk = (int)(Math.random()*this.atk)+1;
		User.currentHp = User.currentHp - orcatk;
		System.out.println(this.name+"가"+User.name+"에게 공격하여"+orcatk+"의 데미지를 주었다.");
	}
}
