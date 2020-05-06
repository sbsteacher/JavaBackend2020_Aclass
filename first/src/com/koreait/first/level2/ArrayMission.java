package com.koreait.first.level2;

public class ArrayMission {

	public static void main(String[] args) {
		int[] arr = new int[900];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}

		for(int i=0; i<arr.length; i++) {
			System.out.printf("i:%d : %d\n", i, arr[i]);
		}
		
		
		
		
		
		//1~100 값 중에 짝수만 arr에 순차적으로 넣어주세요.
		
		//값을 찍는다.
		//2
		//4
		//6
		//...
		//100

	}

}
