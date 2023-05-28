package com.jdc.app;

public class MainApp {
	
	final synchronized static public void main(String[] args) {

		SuperInter inter = new SubInter();
		inter.run();
		
		Outer.InnerStatic innerStat = new Outer.InnerStatic();
		innerStat.setInData(10);
		System.out.println(innerStat.getInData());
		
		Outer.InnerInstance innerInst = new Outer().new InnerInstance();
		innerInst.setInData(30);
		System.out.println(innerInst.getInData());
		
	}

}
