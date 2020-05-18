package com.koreait.first.numberbaseball;

import java.util.Scanner;

public class Player {
	private int[] arr;
	private Scanner scan = new Scanner(System.in);
	
	public Player(int cnt) {
		arr = new int[cnt];
	}
	
	public void setValue() {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("숫자%d 입력: ", i+1);
			arr[i] = scan.nextInt();
		}
	}

	public int[] getArr() {
		return arr;
	}
	
}









