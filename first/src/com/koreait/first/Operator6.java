package com.koreait.first;

public class Operator6 {
	public static void main(String[] args) {
		//and연산자, or연산자
		//&&, ||
		//and 연산자는 모두 true > true (즉, false가 1개라도 있으면 false)
		//or 연산자는 모두 false > false (즉, true가 1개라도 있으면 true)
		
		System.out.println(1 == 1 && 5 > 2 && 2 > 1);
		System.out.println(1 != 1 || 5 < 2 || 0 > 1);
		System.out.println(1 != 1 && (5 < 2 || 5 > 1));
	}
}
