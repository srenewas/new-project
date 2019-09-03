package com.seenu;
import java.util.Arrays;

public class test2 {
	public static void main(String[] args) {
		String in = new String("SEENU IGLESIAS");
		String out = sort(in);
		System.out.println(out);
	}
	public static String sort(String in) {
		char[] ch = in.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
		
	}
}
