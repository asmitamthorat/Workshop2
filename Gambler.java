package com.workshop;

import java.util.ArrayList;

class GamblerGame {
	final static int BEATAMOUNT = 1;
	final static int STACKAMOUNT = 100;
	 

	public int startGame() {
		int betAmount = STACKAMOUNT;

		while (betAmount > 50 && betAmount < 150) {
			int option = (int) ((Math.random() * 2) + 1);
			if (option == 1) {
				betAmount = betAmount + BEATAMOUNT;
			}
			if (option == 2) {
				betAmount = betAmount - BEATAMOUNT;
			}
		}
		return betAmount;
	}

	public void amountForDays() {
		int totalDays = 20;
		int totalAmount = 0;
		ArrayList<Integer> listForWinngDays=new ArrayList<Integer>();
	    ArrayList<Integer> listForLoosingDays=new ArrayList<Integer>();
		for (int i = 1; i <= totalDays; i++) {
			int amount = startGame();
			System.out.println("Total amount made for " + i + " is " + amount);
			if (amount == 50) {
				totalAmount = totalAmount - 50;
				listForLoosingDays.add(i);
			}
			if (amount == 150) {
				totalAmount = totalAmount + 150;
				listForWinngDays.add(i);
			}
		}
		System.out.println("total amount: " + totalAmount);
		System.out.println("list of winning days"+listForWinngDays);
		System.out.print("by 150 $   for each day");
		System.out.println(" ");
		System.out.println("list of loosing days"+listForLoosingDays);
		System.out.print("by 50 $  less for each day");
	}

}

public class Gambler {
	public static void main(String asgs[]) {
		System.out.println("welcome to gambler game");
		GamblerGame gameGame = new GamblerGame();
		gameGame.amountForDays();
	}

}
