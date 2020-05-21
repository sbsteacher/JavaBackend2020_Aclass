package com.koreait.first.blackjack;

public class Dealer extends Gamer {
	public void moreCard(CardDeck cd) {
		if(this.getTotalPoint() <= 16) {
			this.receiveCard(cd.draw());
		}
	}
}
