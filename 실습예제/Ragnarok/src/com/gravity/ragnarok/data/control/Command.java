package com.gravity.ragnarok.data.control;

import java.util.Scanner;

public class Command {
	public static String getCommand(String guide) {	
		System.out.print(guide+":");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();
		return cmd;
	}
}