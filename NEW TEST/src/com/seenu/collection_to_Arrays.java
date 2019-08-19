package com.seenu;

import java.util.ArrayList;

public class collection_to_Arrays {
public static void main(String[] args) {
	ArrayList<String> s = new ArrayList<String>();
	s.add("seenu");
	s.add("suvvy");
	s.add("mini");
	
	String[] ss = new String[s.size()];
	s.toArray();
	for(String sss : s) {
		System.out.println(sss);
	}
}
}
