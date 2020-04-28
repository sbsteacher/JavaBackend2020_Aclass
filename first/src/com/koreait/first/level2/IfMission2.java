package com.koreait.first.level2;

import java.util.Scanner;

public class IfMission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요: ");
		String gender = scan.next();
				
		int standHeight = 0;
		
		if( ! (gender.equals("남자") || gender.equals("여자")) ) {
			System.out.println("잘 못 입력하셨습니다.");
		} else {			
			
			if(gender.equals("남자")) {
				standHeight = 170;
			} else if(gender.equals("여자")) {
				standHeight = 160;
			} else {
				System.out.println("잘못 입력 하셨습니다.");			
			}
			
			System.out.print("키를 입력해 주세요: ");
			int height = scan.nextInt(); 
			
			if(standHeight == 0) {
				System.out.println("잘 못 입력하셨습니다.");
			} else {
				if(height >= standHeight) {
					System.out.println("키가 크네요");
				} else {
					System.out.println("키가 작네요");
				}		
			}
			
		}	
		
	}

}










