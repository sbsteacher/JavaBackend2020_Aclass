package com.koreait.first.level2;

public class ForMission6 {

	public static void main(String[] args) {
		
		int star = 6;
		for(int i=0; i<star; i++) {
			for(int z=0; z<star; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		for(int i=1; i<=star*star; i++) {
			System.out.print("*");
			if(i % star == 0) {
				System.out.println();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		int star = 6;
		
		for(int i=1; i<=star*star; i++) {
			System.out.print("*");
			if(i % star == 0) {
				System.out.println();
			}
		}
	}
	*/

}
