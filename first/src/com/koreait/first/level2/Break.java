package com.koreait.first.level2;

public class Break {

	public static void main(String[] args) {
		//break는 나를 감싸고 있는 반복문을 종료
		for(int z=10; z<20; z++) {
			for(int i=0; i<5; i++) {
				if(i == 3) {
					break;
				}
				System.out.printf("z:%d, i:%d\n",z, i);
			}	 
		}
		
	}

}
