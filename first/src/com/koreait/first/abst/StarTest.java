package com.koreait.first.abst;

public class StarTest {

	public static void main(String[] args) {
		STank s1 = new STank();			
		SCV scv1 = new SCV();
		SCV scv2 = new SCV();
		
		Marine m1 = new Marine();		
		Medic me1 = new Medic();
		Medic me2 = new Medic();
		
		me1.setHp(9);
		m1.setHp(12);
		
		System.out.println(me1);
		scv1.fix(me1);
		System.out.println(me1);
	
		
		//

	}

}
