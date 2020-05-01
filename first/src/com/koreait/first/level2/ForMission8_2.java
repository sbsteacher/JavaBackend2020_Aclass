package com.koreait.first.level2;

public class ForMission8_2 {

	public static void main(String[] args) {
		int star = 5;
		
		for(int i=1; i<=star; i++) {
			for(int z=0; z<star; z++) {
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
