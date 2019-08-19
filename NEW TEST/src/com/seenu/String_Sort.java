package com.seenu;

import java.util.Arrays;

public class String_Sort {
	public static void main(String[] args) {
		String in = "SUHAS";
		String out = sort(in);
		System.out.println(out);
		}
	private static String sort(String in) {
		char[] ch = in.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

}
