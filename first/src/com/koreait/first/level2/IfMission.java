package com.koreait.first.level2;

import java.util.Scanner;

public class IfMission {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요: ");
		String gender = scan.next();
		
		System.out.print("키를 입력해 주세요: ");
		int height = scan.nextInt(); 
		
		if(gender.equals("남자")) {			
			if(height >= 170) {
				System.out.println("키가 크네요");
			} else {
				System.out.println("키가 작네요");
			}			
			
		} else if(gender.equals("여자")) {			
			if(height >= 160) {
				System.out.println("키가 크네요");
			} else {
				System.out.println("키가 작네요");
			}			
		} else {
			System.out.println("잘 못 된 입력입니다.");
		}
	}
	
	/*
	성별을 입력해 주세요: (남 or 여)
	키를 입력해 주세요: 
	
	-----------------------
	남자였을때 키값이 170이상이면
	"키가 크네요"
	아니면
	"키가 작네요"
	-------------
	남자였을때 키값이 160이상이면
	"키가 크네요"
	아니면
	"키가 작네요"
	 */
}
