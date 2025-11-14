class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Estou pensando em um numero entre 0 e 9...");
		System.out.println();

		while(true) {
			System.out.println("O número para adivinhar é " + targetNumber + ".");

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Player um escolheu: " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player dois escolheu: " + guessp2);

			guessp3 = p3.number;
			System.out.println("Player três escolheu: " + guessp3);

			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("Temos um vencedor!!");
				System.out.println();
				System.out.println("O player um acertou? " + p1isRight);
				System.out.println("O player dois acertou? " + p2isRight);
				System.out.println("O player três acertou? " + p3isRight);
				System.out.println();
				System.out.println("Fim de jogo.");
				break;	
			} else {
					System.out.println("Os jogadores terão que tentar novamente.");
					System.out.println();
				}
		} 
		
	}
}

class Player{
	int number;
	
	public void guess() {
		int targetNumber = (int) (Math.random() * 10);
		number = targetNumber;
	}
}

class GameLauncher {
	public static void main(String[] args) {
		GuessGame jogo1 = new GuessGame();
		jogo1.startGame();
	}
}