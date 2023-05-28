package com.jdc.se5;

public class AutoBoxUnBoxApp {

	public static void main(String[] args) {
		
		Integer objInt = new Integer("100");
		int priInt = 10;
		
		objInt = Integer.valueOf(200);
		priInt = new Integer("20").intValue();
		
		Double objDou = new Double("500");
		double priDou = 50;
		
		priDou = objDou;
		priDou = objInt.intValue();
		objDou = new Integer(priInt).doubleValue();

	}

}
