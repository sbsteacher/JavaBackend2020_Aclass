package com.koreait.first.numberbaseball;

public class Game {

	public static void main(String[] args) {
		int gameNo = 3;
		BaseBall bb = new BaseBall(gameNo);
		Player player = new Player(gameNo);		
		do {
			player.setValue();	
		} while(Judgement.isContinue(bb, player));
		System.out.println("게임 종료!!");
		
	}

}
