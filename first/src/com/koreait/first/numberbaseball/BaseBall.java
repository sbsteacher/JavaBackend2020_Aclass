package com.koreait.first.numberbaseball;

public class BaseBall {
	private int[] arr;
	public final int LENGTH;
	
	public BaseBall(int cnt) {
		LENGTH = cnt;
		arr = new int[LENGTH];
		setRandom();
	}
	
	private void setRandom() {
		//랜덤값 만들기
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 9 + 1);			
			for(int z=0; z<i; z++) {
				if(arr[i] == arr[z]) {
					i--;
					break;
				}
			}
		}
	}
	
	public int[] getArr() {
		return arr;
	}
	
}
