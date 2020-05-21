package com.koreait.first.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> list = new ArrayList();
	public static final String[] PATTERNS = { "스페이드", "다이아몬드", "클로버", "하트" };
	private final int DENO_CNT = 13;

	public CardDeck() {
		for (int i = 0; i < PATTERNS.length; i++) {
			for (int z = 1; z <= DENO_CNT; z++) {
				String deno;
				switch (z) {
				case 1:
					deno = "A"; break;
				case 11:
					deno = "J"; break;
				case 12:
					deno = "Q"; break;
				case 13:
					deno = "K"; break;
				default:
					deno = String.valueOf(z);
				}
				list.add(new Card(PATTERNS[i], deno));
			}
		}
	}
	
	public Card draw() {
		int r = (int)(Math.random() * list.size());
		return list.remove(r);
	}
	
	public void testPrint() {
		for(Card c : list) {
			System.out.println(c);
		}
	}
}








