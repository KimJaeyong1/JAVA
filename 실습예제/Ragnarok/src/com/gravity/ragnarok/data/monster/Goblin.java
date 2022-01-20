package com.gravity.ragnarok.data.monster;

import com.gravity.ragnarok.data.string.User;
import com.gravity.ragnarok.util.So;

public class Goblin {
		public static String name;
		public static int currentHp;
		int maxHp;
		int atk;
		
		public Goblin(String name, int currentHp, int maxHp, int atk) {
			this.name = name;
			this.currentHp = currentHp;
			this.maxHp = maxHp;
			this.atk = atk;
		}
		
		public void info() {
			So.p("["+this.name+" (HP:"+this.currentHp+"/"+this.maxHp+") 공격력: "+this.atk+"]");
		}
		
		public void attack() {
			int goblinatk = (int)(Math.random()*this.atk)+1;
			User.currentHp = User.currentHp - goblinatk;
			System.out.println(this.name+"이"+User.name+"에게 공격하여"+goblinatk+"의 데미지를 주었다.");
		}
}
