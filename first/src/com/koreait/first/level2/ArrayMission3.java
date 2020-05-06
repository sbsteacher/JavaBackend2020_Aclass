package com.koreait.first.level2;

public class ArrayMission3 {

	public static void main(String[] args) {
		int[] arr = {30, 29, 30, 100, 10, 130, 9, 11, 10, 1};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			} else if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.printf("max : %d\n", max);
		System.out.printf("min : %d\n", min);
		
	}

}
