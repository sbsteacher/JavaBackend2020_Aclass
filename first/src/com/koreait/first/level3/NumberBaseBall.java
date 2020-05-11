package com.koreait.first.level3;

import java.util.Scanner;

public class NumberBaseBall {

	public static void main(String[] args) {
		int gameNo = 2;
		
		int[] gameArr = new int[gameNo];
		int[] myArr = new int[gameNo];
		
		//랜덤값 만들기
		for(int i=0; i<gameArr.length; i++) {
			gameArr[i] = (int)(Math.random() * 9 + 1);			
			for(int z=0; z<i; z++) {
				if(gameArr[i] == gameArr[z]) {
					i--;
					break;
				}
			}
		}
						
		int strike = 0;
		int ball = 0;
		Scanner scan = new Scanner(System.in);
		while(true) { //or while(strike < gameArr.length) {
			
			for(int i=0; i<myArr.length; i++) {
				System.out.printf("숫자%d 입력: ", i+1);
				myArr[i] = scan.nextInt();
			}
			
			for(int i=0; i<gameArr.length; i++) {
				for(int z=0; z<myArr.length; z++) {
					if(gameArr[i] == myArr[z]) {						
						if(i == z) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}		
			
			System.out.printf("S:%d, B:%d, O:%d\n"
					, strike, ball, gameArr.length - (strike + ball));
			
			if(strike == gameArr.length) {				
				break;
			}
			strike = 0;
			ball = 0;
		}
		scan.close();
		System.out.println("게임 종료!");
	}
}


