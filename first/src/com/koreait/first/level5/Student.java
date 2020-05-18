package com.koreait.first.level5;

public class Student {
	private String name;
	private int mathScore; //수학 점수
	private int engScore; //영어 점수
	private int korScore; //국어 점수
	public static final int SCORE_CNT = 3;
	
	public Student(String name, int mathScore, int engScore, int korScore) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.korScore = korScore;
	}
	
	public void printScore() {
		System.out.printf("%s %d %d %d "
				, name, mathScore, engScore, korScore);
	}
	
	public int getSum() {
		return mathScore + engScore + korScore;
	}
	
	public double getAvg() {
		return (double)getSum() / SCORE_CNT;
	}
}









