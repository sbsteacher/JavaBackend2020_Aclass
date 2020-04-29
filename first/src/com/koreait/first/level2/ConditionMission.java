package com.koreait.first.level2;

import java.util.Scanner;

public class ConditionMission {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력해 주세요: (1~12)");
		int season = scan.nextInt();
		
		//분기문 에러부터 먼저 잡으세요!!!!
		if (season <= 0 || season > 12) {
			System.out.println("잘 못 입력 하셨습니다.");
		} else if (season <= 2 || season == 12) {
			System.out.println("겨울");
		} else if (season <= 5) {
			System.out.println("봄");
		} else if (season <= 8) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
		
		//9~11
		
	}
	
	/*

	월을 입력해 주세요: (1~12)
	
	3~5사이 값이면 "봄"
	6~8사이 값이면 "여름"
	9~11사이 값이면 "가을"
	12, 1, 2 값이면 "겨울"
	이외의 값이 입력되면 "잘못 입력"
	
	
	if, switch

	 */
}
