package com.koreait.first.numberbaseball;

public class Judgement {
	
	public static boolean isContinue(BaseBall bb, Player player) {
		int[] bbArr = bb.getArr();
		int[] playerArr = player.getArr();
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<bbArr.length; i++) {
			for(int z=0; z<playerArr.length; z++) {
				if(bbArr[i] == playerArr[z]) {						
					if(i == z) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}		
		
		System.out.printf("S:%d, B:%d, O:%d\n"
				, strike, ball, bb.LENGTH - (strike + ball));		
		
		return strike < bb.LENGTH;
	}
}



