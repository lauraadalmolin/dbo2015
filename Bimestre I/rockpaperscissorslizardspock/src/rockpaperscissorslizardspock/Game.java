package rockpaperscissorslizardspock;

public class Game {
	
	public String player1;
	public String player2;
	public int choice1 = -1;
	public int choice2 = -1; 
	public int times = 0;
	/*
	SC -> PA
	PA -> R
	R -> L
	L -> SP
	SP -> SC
	SC -> L
	L -> P
	P -> SP
	SP -> R
	SP -> SC
	public int result () {
	*/
	// R - PA - SC - L - SP
	public int result () {
		
		if ((choice1 == 3 && choice2 == 2) || (choice1 == 2 && choice2 == 1) || (choice1 == 1 && choice2 == 4) ||
			(choice1 == 4 && choice2 == 5) || (choice1 == 5 && choice2 == 3) || (choice1 == 3 && choice2 == 4) ||
			(choice1 == 4 && choice2 == 2) || (choice1 == 2 && choice2 == 5) || (choice1 == 5 && choice2 == 1) ||
			(choice1 == 1 && choice2 == 3)) return 1;
		if ((choice2 == 3 && choice1 == 2) || (choice2 == 2 && choice1 == 1) || (choice2 == 1 && choice1 == 4) ||
			(choice2 == 4 && choice1 == 5) || (choice2 == 5 && choice1 == 3) || (choice2 == 3 && choice1 == 4) ||
			(choice2 == 4 && choice1 == 2) || (choice2 == 2 && choice1 == 5) || (choice2 == 5 && choice1 == 1) ||
			(choice2 == 1 && choice1 == 3)) return 2;
		if (choice1 == choice2) times++;
		return 3;
	}
}


