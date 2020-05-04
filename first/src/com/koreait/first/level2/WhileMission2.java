package com.koreait.first.level2;

import java.util.Scanner;

public class WhileMission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "Y";
		int cnt = 0;
		
		while("Y".equals(answer)) {
			System.out.print("음악을 재생하시겠습니까?(Y)");
			answer = scan.next();
			
			if("Y".equals(answer)) {
				System.out.printf("음악을 %d번 재생했습니다.\n", ++cnt);
			}
		}
		System.out.println("재생 종료");
		scan.close();

	}

}
