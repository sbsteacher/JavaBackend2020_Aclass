package com.koreait.first.level2;

public class Continue {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.printf("i:%d\n", i);
		}
	}

}
