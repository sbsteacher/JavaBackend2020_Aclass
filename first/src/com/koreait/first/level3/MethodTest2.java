package com.koreait.first.level3;

public class MethodTest2 {

	public static void main(String[] args) {
		int rVal = getRandom(40, 50);
		System.out.println("rVal : " + rVal);
		
		int result = getABS(-910);
		System.out.println("result : " + result);
		
		int[] arr = {70, 44, 3, 8, 34, 98, 10};
		int min = getMin(arr);
		System.out.println("min : " + min);
		
		int max = getMax(arr);
		System.out.println("max : " + max);
		
		float div = getMaxMinDiv(arr); //배열 최대값 나누기 최소값
		System.out.println("div : " + div);
	}
	public static float getMaxMinDiv(int[] arr) {
		int max = getMax(arr);
		int min = getMin(arr);
		return (float)max/min;
	}
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static int getABS(int val) {
		return val < 0 ? -val : val;
	}
	
	public static int getRandom(int sVal, int eVal) {
		return (int)(Math.random() * (eVal - sVal + 1) + sVal);
	}
	
	
	
	//40~50 >  Math.random() * 11 + 40
	
	//5~20 > Math.random() * 16 + 5
	
	

}
