package com.koreait.first.level3;

public class MethodTest {
	
	public static void main(String[] args) {
				
		sum(10, 50, 30);
		
	}
	
	public static int minus(int a, int b) {
		return a - b;
	}
	
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);		
	}
	
	public static void sum(double n1, int n2, int n3) {
		System.out.println("double!!!");
	}
	public static void sum(int n1, int n2, int n3) {
		System.out.println("int!!!!!");
	}
	
	
	
	
	public static void multi(int n1, int n2) {
		System.out.println(n1 * n2);
	}
	
	

}
