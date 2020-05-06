package com.koreait.first.level2;

public class SortMission {

	public static void main(String[] args) {
		int[] arr = {12, 29, 30, 100, 10, 130, 9, 11, 10, 1};

		for(int i=0; i<arr.length - 1; i++) {
			for(int z=i; z<arr.length; z++) {
				if(arr[i] > arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;			
				}
			}
		}		
		
		for(int i=0; i<arr.length; i++) {
			if(i > 0) {
				System.out.print(",");	
			}
			System.out.print(arr[i]);
		}
		
	}

}
