package com.koreait.first.level5;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] stuArr = {
				new Student("철수", 30, 40, 55),
				new Student("영미", 10, 89, 100),
				new Student("영수", 40, 11, 99),
				new Student("수영", 54, 22, 33)
		};
		
		stuArr[0].printScore();
		
		//Calc.printSumAvg(stuArr);
		
	}

}
