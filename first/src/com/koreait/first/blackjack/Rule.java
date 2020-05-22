package com.koreait.first.blackjack;

public class Rule {
	public static void whoIsWin(Dealer dealer, Gamer gamer) {
		dealer.openCards();

		int dp = dealer.getTotalPoint();
		int gp = gamer.getTotalPoint();
		
		if((dp > 21 && gp <= 21) || (gp <= 21 && gp > dp)) {
			System.out.println("게이머 승!!");
		} else if((gp > 21 && dp <=21) || (dp <= 21 && dp > gp)) {
			System.out.println("딜러 승!!");
		} else {
			System.out.println("비김!!");
		}
	}
}
