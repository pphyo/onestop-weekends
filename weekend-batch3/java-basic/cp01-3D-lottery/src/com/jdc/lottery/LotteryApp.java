package com.jdc.lottery;

public class LotteryApp {
	
	public static void main(String[] args) {
		Runner runner = new Runner();
		boolean result = runner.isRound(4, 5, 6, "654");
		
		System.out.println(result);
	}

}
