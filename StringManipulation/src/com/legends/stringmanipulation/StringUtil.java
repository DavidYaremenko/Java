package com.legends.stringmanipulation;

import java.lang.reflect.Array;
import java.util.List;

public class StringUtil {

	public static void main(String[] args) {
		
		String source = "Hello World!";
		String[] words = source.split(" ");
		
		System.out.println(words.length);
		
		for(int i = 0; i < words.length; i++ ) {
			
			System.out.println(words[i]);
			
			char[] letters = words[i].toCharArray();
			System.out.println(letters.length);
		}
			
		}
	
	List<> word = new Array();

}
