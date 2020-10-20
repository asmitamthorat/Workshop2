package com.workshop;

class GamblerGame {
	int Amount=100;
	int betAmount=1;
    final static int winAmount=1;
    final static int loseAmount=1;
    
	public void Startgame() {
	int	option=(int)((Math.random()*2)+1);
		if(option==1) {
			System.out.println("winning");
			Amount=Amount+winAmount;
		}
		if(option==2) {
			System.out.println("looseing");
			Amount=Amount-loseAmount;
		}
		
	}
}


public class Gambler {
	public static void main(String asgs[]) {
		System.out.println("welcome to gambler game");
		GamblerGame gameGame=new GamblerGame();
		gameGame.Startgame();
		
	}

}
