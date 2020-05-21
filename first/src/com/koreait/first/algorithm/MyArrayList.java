package com.koreait.first.algorithm;

public class MyArrayList {
	private int[] arr;
	
	public MyArrayList() {
		arr = new int[0];
	}
	
	public int get(int idx) {
		return arr[idx];
	}
	
	public int size() {
		return arr.length;
	}
	
	public void add(int idx, int val) {
		int[] temp = new int[arr.length + 1];
		for(int i=0; i<arr.length; i++) {
			if(i<idx) {
				temp[i] = arr[i];
			} else {
				temp[i+1] = arr[i];
			}
		}
		temp[idx] = val;
		arr = temp;
	}
	
	public void add(int val) {
		int[] temp = new int[arr.length + 1];	
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}		
		temp[arr.length] = val;
		arr = temp;
	}
	
	public int remove() {
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		return arr[temp.length];
	}
	
	public int remove(int idx) {
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<temp.length; i++) {			
			//temp[i] = arr[i < idx ? i : i + 1];
			if(i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i + 1];
			}
		}
		arr = temp;
		return arr[idx];
	}
	
	public void print() {
		for(int val : arr) {
			System.out.print(val + ", ");
		}
		System.out.println();
	}
}




