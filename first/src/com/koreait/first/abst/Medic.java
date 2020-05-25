package com.koreait.first.abst;

public class Medic extends Unit implements Curable, Bionic {
	public static int INIT_HP = 40;
	
	public Medic() {	
		super("메딕", INIT_HP, INIT_HP);		
	}
	
	@Override
	public void cure(Bionic bio) {
		if(this == bio) {
			System.out.println("자기가 자기를 치료할 수 없다.");
			return;
		}
		Unit unit = (Unit)bio;
		int maxHp = unit.getMaxHp();
		unit.setHp(maxHp);
	}
}







