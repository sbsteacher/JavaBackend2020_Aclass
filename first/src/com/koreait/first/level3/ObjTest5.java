package com.koreait.first.level3;

public class ObjTest5 {
	public static void main(String[] args) {
		String str = "10";
		int num = Integer.parseInt(str);
		double num2 = Double.parseDouble(str);
		System.out.println(num + 10);
	}
}
class Random3 {
	int num;
	public static int getRandom(int n1) {		
		return (int)(Math.random() * n1);
	}
	
	public int getNum() {
		return num;
	}
}
 
class Random2 {
	int num;		
	
	public int getRandom() {
		return (int)(Math.random() * num);
	}
}





