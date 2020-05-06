package com.koreait.first.level2;

import java.util.Scanner;

public class ContinueMission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 10_000;
		System.out.printf("<현재 가진 돈은 %,d원 입니다>\n", money);
		
		while(money > 0) {
			System.out.print("얼마를 사용하시겠습니까?");
			int useMoney = scan.nextInt();
			
			if(useMoney > money) {
				System.out.println("다시 입력해주세요 (사용 범위가 틀렸습니다)\n");
				continue;
			}
			
			money -= useMoney;
			System.out.printf("남은 돈 %,d\n", money);	
		}
		System.out.println("모든 돈 사용함. 종료!");
		scan.close();
		
	}

}
