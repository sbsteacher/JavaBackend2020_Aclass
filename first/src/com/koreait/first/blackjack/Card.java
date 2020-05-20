package com.koreait.first.blackjack;

public class Card {
	private String pattern;
	private String denomination;
	private int point;

	public Card(String pattern, String denomination) {
		init(pattern, denomination);
	}

	private void init(String pattern, String denomination) {
		this.pattern = pattern;
		this.denomination = denomination;
		switch (denomination) {
		case "A":
			this.point = 1;
			break;
		case "J":case "Q":case "K":
			this.point = 10;
			break;
		default:
			this.point = Integer.parseInt(denomination);
		}
	}
	
	@Override
	public String toString() {
		//return pattern + ", " + denomination + ", " + point;
		return String.format("%s - %s - %d"
				, pattern, denomination, point);
	}
	
}
