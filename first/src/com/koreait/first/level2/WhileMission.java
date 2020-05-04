package com.koreait.first.level2;

import java.util.Scanner;

public class WhileMission {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		int cnt = 0;
		
		System.out.print("음악을 재생하시겠습니까?(Y)");
		answer = scan.next();
		
		while("Y".equals(answer)) {
			System.out.printf("음악을 %d번 재생했습니다.\n", ++cnt);
			
			System.out.print("음악을 재생하시겠습니까?(Y)");
			answer = scan.next();
		}
		System.out.println("재생 종료");
	}
	
	/*
	음악을 재생하시겠습니까?(Y) Y
	음악을 1번 재생했습니다.
	음악을 재생하시겠습니까?(Y) Y
	음악을 2번 재생했습니다.
	음악을 재생하시겠습니까?(Y) N
	재생 종료
	 */
}
