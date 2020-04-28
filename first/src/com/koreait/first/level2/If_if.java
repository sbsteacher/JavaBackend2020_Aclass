package com.koreait.first.level2;

import java.util.Scanner;

public class If_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디를 입력해 주세요: ");
		String id = scan.next();
		
		System.out.print("비밀번호를 입력해 주세요: ");
		String pw = scan.next();
		
		System.out.printf("아이디: %s\n", id);
		System.out.printf("비밀번호: %s\n", pw);
		
		if(id.equals("mic")) {//✨✨✨✨✨
			System.out.println("id 일치");
			
			if("1212".equals(pw)) {
				System.out.println("pw 일치");
				System.out.println(" 로그인 성공!! ");
				
			} else {
				System.out.println("pw 불일치");
			}
		} else {
			System.out.println("id 불일치");
		}
		
	}
}












