package com.koreait.first.level2;

public class Array2Mission2 {

	public static void main(String[] args) {
		String[] subject = {"수학", "영어", "국어", "물리"};
		int[][] score = {
				{80, 75, 30, 10}, 
				{90, 100, 88, 50},
				{60, 90, 100, 80}, 
				{80, 99}
		};		
		int[] sum = new int[subject.length];	
		int[] cnt = new int[subject.length];
		
		for(int i=0; i<score.length; i++) {
			for(int z=0; z<score[i].length; z++) {
				sum[z] += score[i][z];
				cnt[z] += 1;
			}
		}
		
		for(int i=0; i<subject.length; i++) {
			System.out.printf("%s 합계: %,d, 평균: %.2f\n"
					, subject[i], sum[i], (float)sum[i] / cnt[i]);
		}
	}

}






