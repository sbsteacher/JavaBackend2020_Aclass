package com.koreait.first.blackjack;

import java.util.ArrayList;
import java.util.List;

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
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : list) {
			sum += c.getPoint();
		}
		return sum;
	}
}
