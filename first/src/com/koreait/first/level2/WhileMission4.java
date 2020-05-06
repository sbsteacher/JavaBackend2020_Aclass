package com.koreait.first.level2;

import java.util.Scanner;

public class WhileMission4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		int cnt = 0;
		
		while(true) {
			System.out.print("음악을 재생하시겠습니까?(Y)");
			answer = scan.next();			
			if(!answer.equals("Y")) { break; }
			System.out.printf("음악을 %d번 재생했습니다.\n", ++cnt);			
		}
		System.out.println("재생 종료");

	}

}
