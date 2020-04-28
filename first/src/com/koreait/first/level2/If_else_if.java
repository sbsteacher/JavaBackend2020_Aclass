package com.koreait.first.level2;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요: ");
		int age = scan.nextInt();
		
		if(age > 19) {
			System.out.println("성인 요금입니다.");
		
		} else if(age > 13) {
			System.out.println("청소년 요금입니다.");
			
		} else if(age > 8) {
			System.out.println("어린이 요금입니다.");
			
		} else {
			System.out.println("유아 요금입니다.");
		}
		
		System.out.println("결제를 진행해 주세요.");

	}

}
