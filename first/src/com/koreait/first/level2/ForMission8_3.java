package com.koreait.first.level2;

public class ForMission8_3 {

	public static void main(String[] args) {
		int star = 5;
		
		for(int i=star; i>0; i--) {
			for(int z=1; z<=star; z++) {
				if(z < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
