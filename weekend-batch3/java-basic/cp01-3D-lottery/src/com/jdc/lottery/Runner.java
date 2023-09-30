package com.jdc.lottery;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Runner {
	
	private Scanner sc = new Scanner(System.in);

	public void run() {
		
		// show message
		showMessage("Welcome to 3D Lottery App");
		
		do {
//			int first = generate();
//			int second = generate();
//			int third = generate();
			
			// get user's lottery
			String userDigit = getString("Enter your lottery number: ");
			
			if(userDigit.length() != 3)
				continue;
			
			// display original lottery
			
			// betting
		} while(getString("Do you want to play again?(y/others): ").equalsIgnoreCase("y"));
		
	}
	
	public boolean isRound(int firstLottery, int secondLottery, int thirdLottery, String userDigit) {
		int firstUser = Integer.parseInt(userDigit.substring(0, 1));
		int secondUser = Integer.parseInt(userDigit.substring(1, 2));
		int thirdUser = Integer.parseInt(userDigit.substring(2, 3));
		
		boolean firstPlace = firstLottery == firstUser || firstLottery == secondUser || firstLottery == thirdUser;
		boolean secondPlace = secondLottery == firstUser || secondLottery == secondUser || secondLottery == thirdUser;
		boolean thirdPlace = thirdLottery == firstUser || thirdLottery == secondUser || thirdLottery == thirdUser;
		
		return firstPlace && secondPlace && thirdPlace;
	}
	
	public boolean isTut(int firstLottery, int secondLottery, int thirdLottery, String userDigit) {
		return false;
	}
	
	public void showMessage(String message) {
		String line = "";
		for(int i = 0, n = message.length(); i < n; i++) {
			line += "*";
		}
		System.out.println("**".concat(line).concat("**"));
		System.out.println("* ".concat(message).concat(" *"));
		System.out.println("**".concat(line).concat("**"));
	}
	
	public int generate() {
		return ThreadLocalRandom.current().nextInt(10);
	}
	
	public String getString(String message) {
		System.out.print(message);
		return sc.nextLine();
	}

}





