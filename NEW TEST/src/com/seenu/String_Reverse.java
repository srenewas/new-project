package com.seenu;

public class String_Reverse {
	public static void main(String[] args) {
		String s = "SEENU IGLESIAS";
		char[] ch = s.toCharArray();
		for(int i = ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}

}
