package com.seenu;

import java.util.*;

public class test {
	public static void main(String[] args) {
		String in = "SEENU IGLESIAS";
		char tocheck = 'E';
		int count = 0;
		for(int i = 0;i<in.length();i++) {
			if(in.charAt(i)==tocheck)
				count++;
		}
		System.out.println(count);
		}
	}
