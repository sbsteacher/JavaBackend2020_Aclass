package com.koreait.first.level3;

public class ArrayMission2 {

	public static void main(String[] args) {
		int[] arr, arr2; //A
			
		
		arr = setArrDefaultValue(5, 3);
		arr2 = setArrDefaultValue(8, 4);
		
		printArr(arr);
		printArr(arr2);		
		
		
	}

	
	public static int[] setArrDefaultValue(int len, int defVal) {
		int[] temp = new int[len]; //B
		
		for(int i=0; i<len; i++) {
			temp[i] = defVal;
		}
		
		return temp;
	}
	
	public static void printArr(int[] array) {		
		for(int val : array) {
			System.out.print(val + ", ");
		}
		System.out.println();
	}
}





