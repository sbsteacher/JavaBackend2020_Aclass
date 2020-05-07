package com.koreait.first.level2;

import java.util.Scanner;

public class TestMission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] productNames = {"콜라", "사이다", "환타", "맥콜", "마운틴듀", "수염차"};
		int[] prices = {500, 600, 500, 600, 700, 1000};
		
		//메뉴 출력
		System.out.println("---- 자판기 -----");
		for(int i=0; i<productNames.length; i++) {
			System.out.printf("%d. %s - %,d원\n", i+1, productNames[i], prices[i]);
		}
		System.out.println("-------------------");
		
		//메뉴 선택	
		while(true) {
			System.out.print("음료를 선택해 주세요(종료:0)");
			int menu = scan.nextInt();
			if(menu == 0) {
				break;
			} else if(menu < 0 || menu > productNames.length) {
				System.out.println("잘 못 선택");
				continue;
			} 
			int idx = menu - 1;
			System.out.printf("%s %,d원\n", productNames[idx], prices[idx]);	
		
		}
		System.out.println("종료!");

	}
	/*
	자판기
	1. 콜라 - 500원
	2. 사이다 - 600원
	3. 환타 - 500원
	4. 맥콜 - 600원
	5. 마운틴듀 - 700원
	6. 수염차 - 1,000원
	----------------
	음료를 선택해 주세요(종료:0) 1
	콜라 500원
	음료를 선택해 주세요(종료:0) 6
	수염차 1,000원
	음료를 선택해 주세요(종료:0) 8
	잘 못 선택
	음료를 선택해 주세요(종료:0) 0
	종료!
	 */

}
