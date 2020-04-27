package com.koreait.first;

public class Variable3 {
	public static void main(String[] args) {
		//byte > short > int > long > float > double
		byte by = 10;
		short sh = (byte)by;
		int in = sh;
		long lo = in;
		float fl = lo;
		double dou = 300;
		
		byte by2 = (byte)dou;
		System.out.println(by2);
		
		
	}

}
