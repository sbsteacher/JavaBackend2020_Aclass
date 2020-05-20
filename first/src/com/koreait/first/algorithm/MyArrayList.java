package com.koreait.first.algorithm;

public class MyArrayList {
	private int[] arr;
	
	public MyArrayList() {
		arr = new int[0];
	}
	
	public void add(int val) {
		int[] temp = new int[arr.length + 1];	
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}		
		temp[arr.length] = val;
		arr = temp;
	}
	
	public void remove() {
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	public void print() {
		for(int val : arr) {
			System.out.print(val + ", ");
		}
		System.out.println();
	}
}




