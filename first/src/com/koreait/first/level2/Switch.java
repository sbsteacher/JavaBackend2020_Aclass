package com.koreait.first.level2;

public class Switch {
	public static void main(String[] args) {		
		int book = 8;		
		switch(book) {
		case 1:	case 2:	case 3:
			System.out.println("2권은 좀....");
			System.out.println("2권은 좀....");
			System.out.println("노력하세요!!");
			break;
		default:
			System.out.println("?????");
			
		case 4:
			System.out.println("Good!!");
			break;
		
		}
	}
}
