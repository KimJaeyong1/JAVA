package com.shenwoo;

import java.util.ArrayList;
import java.util.Scanner;

import com.shenwoo.gym.Member;
import com.shenwoo.gym.display.Title;

public class Main {
	public static void main(String[] args) {
		System.out.println(Title.TITLE);

		Scanner sc = new Scanner(System.in);

		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("김씨", "010-1111-1111", "남자"));
		members.add(new Member("이씨", "010-2222-2222", "남자"));
		members.add(new Member("박씨", "010-3333-3333", "남자"));
		members.add(new Member("최씨", "010-4444-4444", "남자"));
		members.add(new Member("정씨", "010-5555-5555", "남자"));
		members.add(new Member("윤씨", "010-6666-6666", "남자"));
		members.add(new Member("신씨", "010-7777-7777", "남자"));
		members.add(new Member("손씨", "010-8888-8888", "남자"));
		members.add(new Member("하씨", "010-9999-9999", "남자"));

		System.out.println(members.get(0).getName());

		boolean tof = true;

		while (tof) {
			System.out.println("1: 회원정보출력 / 2: 회원가입 / 3: 회원삭제 / 4: 회원정보수정 / e: 프로그램종료");
			String cmd = sc.next();

			switch (cmd) {
			case "1":
				for (Member pp : members) {
					pp.info();
				}
				break;
			case "2":
				System.out.println("이름을 입력해주세요.");
				String name = sc.next();
				System.out.println("연락처를 입력해주세요.");
				String tel = sc.next();
				System.out.println("성별을 입력해주세요.");
				String gender = sc.next();
				System.out.println("회원가입이 완료 되었습니다.");
				members.add(new Member(name, tel, gender));
				break;
			case "3":
				System.out.println("삭제하실 회원의 이름을 입력해주세요.");
				String d = sc.next();

				boolean search = false;
				int searchIndex = -1;
				for (int n = 0; n < members.size(); n++) {
					if (members.get(n).getName().equals(d)) {
						search = true;
						searchIndex = n;
						break;
					}
				}
				if (search) {
					System.out.println("찾음");
					members.remove(searchIndex);
				} else {
					System.out.println("못찾음");
				}
				break;
			case "e":
				System.out.println("프로그램을 종료합니다.");
				tof = false;
				break;
			}
		}
	}
}
