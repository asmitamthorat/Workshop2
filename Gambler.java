package com.workshop;

class GamblerGame {
	final static int BEATAMOUNT = 1;
	final static int STACKAMOUNT=100;

	public void StartGame() {
		
		int beatAmount=STACKAMOUNT;
		while (beatAmount > 50 && beatAmount < 150) {
			int option = (int) ((Math.random() * 2) + 1);
			if (option == 1) {
				System.out.println("winning");
				beatAmount = beatAmount + BEATAMOUNT;

			}
			if (option == 2) {
				System.out.println("looseing");
				beatAmount = beatAmount - BEATAMOUNT;

			}
		}
		System.out.println("Money after gamble" + beatAmount);

	}
}

public class Gambler {
	public static void main(String asgs[]) {
		System.out.println("welcome to gambler game");
		GamblerGame gameGame = new GamblerGame();
		gameGame.StartGame();

	}

}
