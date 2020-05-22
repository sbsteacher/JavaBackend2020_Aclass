package com.koreait.first.blackjack;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();		
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		
		for(int i=0; i<2; i++) {
			gamer.receiveCard(cd.draw());
			dealer.receiveCard(cd.draw());
		}
		dealer.moreCard(cd);
		gamer.moreCard(cd);
		
		Rule.whoIsWin(dealer, gamer);
		
	}

}






