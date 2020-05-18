package com.koreait.first.level5;

public class Calc {
	public static void printSumAvg(int[][] arr) {
		int totalSum = 0;
		int totalCnt = 0;
		for(int i=0; i<arr.length; i++) {
			int lineSum = 0;			
			for(int z=0; z<arr[i].length; z++) {
				totalCnt++;
				lineSum += arr[i][z];
				System.out.print(arr[i][z] + " ");
			}
			totalSum += lineSum;
			System.out.printf(": %d %.1f\n", lineSum, (float)lineSum / arr[i].length);
		}
		
		System.out.printf("전체 합계 : %d\n", totalSum);
		System.out.printf("전체 평균 : %.1f\n", (double)totalSum/totalCnt);
	}
}
