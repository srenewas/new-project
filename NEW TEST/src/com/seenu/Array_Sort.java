package com.seenu;

import java.util.Arrays;

public class Array_Sort {
	public static void main(String[] args) {
		int[] i = {1,3,7,9,2,4,0,10};
		Arrays.sort(i);
		for(int j : i) {
			System.out.println(j);
		}
	}
}
