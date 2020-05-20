package com.koreait.first.method2;

public class MethodTest1 {

	public static void main(String[] args) {
		//Star.printStarLine(6);
		//Star.printStarSqure(5);
		//Star.printStarTriangle(5);
		//Star.printStarReverseTriangle(5);
		//Star.printLine("_", 6);
		Star.printStarTriangle2(5); //printLine을 이용!
	}

}

class Star {
	static void printStarTriangle2(int num) {
		for(int i=1; i<=num; i++) {
			printLine(" ", num-i);
			printStarLine(i);
			/*
			printLine("*", i);
			System.out.println();
			*/
		}
	}
	static void printLine(String sym, int num) {
		for(int i=0; i<num; i++) {
			System.out.print(sym);
		}
	}
	static void printStarReverseTriangle(int num) {
		for(int i=num; i>0; i--) {
			printStarLine(i);
		}
	}
	static void printStarTriangle(int num) {
		for(int i=1; i<=num; i++) {
			printStarLine(i);
		}
	}
	static void printStarSqure(int num) {
		for(int i=0; i<num; i++) {
			printStarLine(num);			
		}
	}
	
	static void printStarLine(int num) {
		for(int i=0; i<num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}