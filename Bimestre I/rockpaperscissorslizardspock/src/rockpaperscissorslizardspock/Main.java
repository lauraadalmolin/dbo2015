package rockpaperscissorslizardspock;

public class Main {
	
	public static void main(String[] args) {
		
		Game g = new Game();

		System.out.printf("\n\nWelcome to the Rock-Paper-Scissors-Lizard-Spock Game!");
		
		System.out.printf("\nPlayer 1, please type your name:\n-> ");
		g.player1 = System.console().readLine();
		
		System.out.printf("\nPlayer 1, please type your name:\n-> ");
		g.player2 = System.console().readLine();
		
		for (; g.times < 3; ) {
			if (g.times != 0) System.out.printf("\nTie! Try again.");
			System.out.printf("\n\nCheck out the choices:\n1) Rock\n2) Paper\n3) Scissors\n4) Lizard\n5) Spock\n");
			System.out.printf(g.player1 + ", type your choice:\n-> ");
			g.choice1 = Integer.parseInt(System.console().readLine());
			System.out.printf(g.player2 + ", type your choice:\n-> ");
			g.choice2 = Integer.parseInt(System.console().readLine());
			int r = g.result();
			if (r == 1)  { System.out.printf("\n-> Congratulations %s! You won the game!", g.player1); break; }
			if (r == 2) { System.out.printf("\n-> Congratulations %s! You won the game!", g.player2); break; }
		}

		if(g.result() == 3) System.out.println("The game ended! It was a tie.");

	}
}