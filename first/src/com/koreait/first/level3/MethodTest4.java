package com.koreait.first.level3;

public class MethodTest4 {

	public static void main(String[] args) {
		//printStarLine(5);
		//printSqure(5);
		//printTriangle(6);
		printReverseTriangle(6);
	}
	
	public static void printReverseTriangle(int star) {
		for(int i=star; i>0; i--) {
			printStarLine(i);
		}
	}
	
	public static void printTriangle(int star) {
		for(int i=1; i<=star; i++) {
			printStarLine(i);
		}
	}
	
	public static void printSqure(int star) {
		for(int i=0; i<star; i++) {
			printStarLine(star);
		}
	}
	
	public static void printStarLine(int star) {
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
