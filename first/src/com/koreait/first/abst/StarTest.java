package com.koreait.first.abst;

public class StarTest {

	public static void main(String[] args) {
		STank s1 = new STank();
		Marine m1 = new Marine();		
		Medic me1 = new Medic();		
		SCV scv1 = new SCV();
		
		s1.setHp(10);
		m1.setHp(10);		
		
		System.out.println(m1);
		me1.cure(m1);
		System.out.println(m1);
		
		System.out.println(s1);
		scv1.fix(s1);
		System.out.println(s1);
		
		//me1.cure(s1);

	}

}
