package com.koreait.first;

public class PrintF {
	public static void main(String[] args) {
		String name = "박도흠";
		int age = 1520;
		double height = 170.5;
		
		String str = "안녕하세요 " + name + "입니다. 제 나이는 " + age + "입니다. "
				+ "제 키는 " + height + "cm 입니다.";		
		System.out.println(str);		
		
		System.out.printf("안녕하세요 %s입니다. 제 나이는 %,d입니다. 제 키는 %8.1fcm 입니다.\n", name, age, height);
		

	}
}
