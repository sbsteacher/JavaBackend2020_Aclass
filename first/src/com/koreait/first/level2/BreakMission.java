package com.koreait.first.level2;

import java.util.Scanner;

public class BreakMission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int val = 0;
		while(true) {			
			System.out.print("더할 숫자를 입력하세요(종료 0):");
			val = scan.nextInt();			
			if(val == 0) { break; }
			sum += val;
			
		}
		System.out.printf("현재까지의 총합 = %d", sum);
		scan.close();
	}

}






