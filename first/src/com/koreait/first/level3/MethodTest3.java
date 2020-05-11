package com.koreait.first.level3;

public class MethodTest3 {
	public static void main(String[] args) {
		int dan = 3;
		//printGugudan(dan);
		
		int sDan = 7; //시작단수
		int eDan = 2; //종료단수
		printGugudan2(sDan, eDan); 
		//sDan = 5, eDan = 9 > 5단부터 9단이 찍히도록
		//sDan = 8, eDan = 2 > 시작단이 종료단보다 클 수 없습니다.

		//(전공자)sDan = 8, eDan = 2 > 8단부터 2단이 찍히도록
	}
	
	public static void printGugudan(int dan) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
	}
	
	public static void printGugudan(int sDan, int eDan) {
		if(sDan > eDan) {
			System.out.println("시작단이 종료단보다 클 수 없습니다.");
			return;
		}
		
		for(int i=sDan; i<=eDan; i++) {			
			printGugudan(i);			
			System.out.println();
		}
	}
	
	//오름차순 내림차순 ver1
	public static void printGugudan2(int sDan, int eDan) {
		if(sDan < eDan) {
			for(int i=sDan; i<=eDan; i++) {			
				printGugudan(i);			
				System.out.println();
			}
			return;
		} 
		for(int i=sDan; i>=eDan; i--) {			
			printGugudan(i);			
			System.out.println();
		}
			
	}
	
	//오름차순 내림차순 ver2
	public static void printGugudan3(int sDan, int eDan) {
		int dan = sDan;
		int endCnt = sDan > eDan ? sDan - eDan : eDan - sDan;
		
		for(int i=0; i<=endCnt; i++) {			
			printGugudan(dan);
			dan = sDan > eDan ? dan - 1 : dan + 1;
			System.out.println();
		}
	}
	
}
