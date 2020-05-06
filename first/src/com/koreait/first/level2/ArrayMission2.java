package com.koreait.first.level2;

public class ArrayMission2 {

	public static void main(String[] args) {
		int[] mathScore = {100, 88, 23, 88, 90};
		
		int sum = 0;
		int len = mathScore.length;
		
		for(int i=0; i<mathScore.length; i++) {
			sum += mathScore[i];
		}
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %f\n", (float)sum/(float)mathScore.length);
		
		
		//byte > short > int > long > float > double > (String) 
		//합계: ?
		//평균값: ?

	}

}
