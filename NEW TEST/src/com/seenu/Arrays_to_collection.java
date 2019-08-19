package com.seenu;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_to_collection {
	public static void main(String[] args) {
		String[] s = {"seenu","suvvy","mini"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));
		for(String ss : list) {
			System.out.println(ss);
		}
	}
}
