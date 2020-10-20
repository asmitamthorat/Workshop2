package com.workshop;

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

	public void gameAmount() {
		int totalDays = 20;
		int totalAmount = 0;
		for (int i = 1; i <= totalDays; i++) {
			int amount = startGame();
			System.out.println("Total amount made for " + i + " is " + amount);
			if (amount == 50) {
				totalAmount = totalAmount - 50;
			}
			if (amount == 150) {
				totalAmount = totalAmount + 150;
			}
		}
		System.out.println("total amount: " + totalAmount);
	}

}

public class Gambler {
	public static void main(String asgs[]) {
		System.out.println("welcome to gambler game");
		GamblerGame gameGame = new GamblerGame();
		gameGame.gameAmount();
	}

}
