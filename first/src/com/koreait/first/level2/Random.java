package com.koreait.first.level2;

public class Random {
	public static void main(String[] args) {		
		//11~30		
		//int r = (int)(Math.random() * 20 + 11);		
		
		//100 ~ 200
		//int r = (int)(Math.random() * 101 + 100);
		
		//15~35
		//int r = (int)(Math.random() * 21 + 15);
		
		//11~30
		//int r = (int)(Math.random() * 20 + 11);
		
		//1~9
		
		
		int[] arr3 = new int[3];		
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = (int)(Math.random() * 9 + 1);			
			for(int z=0; z<i; z++) { //중복체크
				if(arr3[i] == arr3[z]) {
					i--; 
					break;
				}				
			}
		}
				
		int[] arr4 = new int[3];
		int i = 0;
		parent:
		while(i<arr4.length) {			
			arr4[i] = (int)(Math.random() * 9 + 1);			
			for(int z=0; z<i; z++) { //중복체크
				if(arr4[i] == arr4[z]) {					
					continue parent;
				}				
			}
			i++;
		}	
	}
}














