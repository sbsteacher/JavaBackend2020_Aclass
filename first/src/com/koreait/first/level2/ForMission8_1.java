package com.koreait.first.level2;

public class ForMission8_1 {

	public static void main(String[] args) {
		int star = 5;
		
		for(int i=0; i<star; i++) {
			for(int z=1; z<=star; z++) {
				if(z < star-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
