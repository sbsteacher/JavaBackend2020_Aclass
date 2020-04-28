package com.koreait.first;

public class PrintF2 {
	public static void main(String[] args) {	
		
		char ch = '1';
		System.out.printf("%c\t: %d\n", ch, (int)ch);
		
		
		int in = 66;
		System.out.printf("%c\t: %d\n", (char)in, in);
		
		String str1 = "SUM은 22";
		System.out.println(str1);
		//4
		//22
		//SUM은 22
		
		String str2 = "4 SUM은";
		//4 SUM은
		//22 SUM은
		System.out.println(str2);
		
	}
}
