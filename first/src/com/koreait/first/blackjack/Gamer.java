package com.koreait.first.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	private List<Card> list = new ArrayList();
	
	public void receiveCard(Card c) {
		list.add(c);
	}
	
	public void openCards() {
		for(Card c : list) {
			System.out.println(c);
		}
	}
	
	public void moreCard(CardDeck cd) {
		Scanner scan = new Scanner(System.in);
		String answer = null;		
		while(true) {
			openCards();
			System.out.print("카드를 받으시겠습니까? (Y) ");
			answer = scan.next();
			if(!("Y".equals(answer) || "y".equals(answer))) {
				break;
			}			
			receiveCard(cd.draw());
		}
		scan.close();
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : list) {
			sum += c.getPoint();
		}
		return sum;
	}
}
