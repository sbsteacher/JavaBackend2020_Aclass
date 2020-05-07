package com.koreait.first.level2;

public class Array2Mission {

	public static void main(String[] args) {
		String[] subject = {"수학", "영어", "국어", "물리"};
		int[][] score = {
				{80, 75, 30, 10}, //수학
				{90, 100, 88, 50}, //영어
				{60, 90, 100, 80}, //국어
				{80, 99, 100}
		};		
		int[] sum = new int[subject.length];
		
		for(int i=0; i<score.length; i++) {
			for(int z=0; z<score[i].length; z++) {
				sum[z] += score[i][z];
			}
		}
		
		for(int i=0; i<subject.length; i++) {
			System.out.printf("%s 합계: %,d, 평균: %.2f\n"
					, subject[i], sum[i], (float)sum[i] / score[i].length);
		}
	}

}






