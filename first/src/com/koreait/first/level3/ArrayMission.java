package com.koreait.first.level3;

public class ArrayMission {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 50, 80 };
		int[] arr2 = { 0, 0, 0, 0, 0 };

		//값복사 		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}		
		//
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
		System.out.println();
		
		for(int val : arr2) {
			System.out.print(val + ", ");
		}
		System.out.println();
		System.out.println(arr == arr2);
	}

}
