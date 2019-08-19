package com.seenu;

public class char_count {
	public static void main(String[] args) {
		String s = "SEENU IGLESIAS";
		char tocheck = 'E';
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==tocheck) {
				count++;
			}
		}
		System.out.println(count);
	}
}
