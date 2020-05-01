package com.koreait.first.level2;

public class ForMission8 {
	
	public static void main(String[] args) {
		int star = 5;
	
		for(int i=star-1; i>=0; i--) {
			for(int z=0; z<star; z++) {
				if(i>z) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
