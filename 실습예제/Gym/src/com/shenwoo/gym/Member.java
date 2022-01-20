package com.shenwoo.gym;

public class Member {
	private String name;
	private String tel;
	private String gender;

	public Member(String name, String tel, String gender) {
		this.name = name;
		this.tel = tel;
		this.gender = gender;
	}

	public void info() {
		System.out.println("이름:" + name + " 연락처:" + tel + "성별:" + gender);
	}

	public String getName() {
		return name;
	}

	String getTel() {
		return tel;
	}

	String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	void setTel(String tel) {
		this.tel = tel;
	}

	void setGender(String gender) {
		this.gender = gender;
	}
}
