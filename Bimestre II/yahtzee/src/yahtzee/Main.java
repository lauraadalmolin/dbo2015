package yahtzee;

import toolkit.IList;

public class Main {

	public static void main(String[] args) {
		
		/* SECTION #1 ================================================== 0.3 PTS */

		// instanciando jogadores
		Player pedro = new Player("Pedro");
		Player ana = new Player("Ana");

		System.out.println(pedro.getName().equals("Pedro"));
		System.out.println(ana.getName().equals("Ana"));

		// instanciando um jogo  (estado pré-jogo)
		Yahtzee game = new Yahtzee(pedro, ana);
		System.out.println(game.isFinished() == false);
		System.out.println(game.getWinner() == null);
		System.out.println(game.getPlayer(1).equals(pedro));
		System.out.println(game.getPlayer(2).equals(ana));

		/* SECTION #2 ================================================== 0.2 PTS */

		// no rounds yet
		System.out.println(game.getRounds().empty() == true);
		// no choices yet (updated!)
		System.out.println(game.getPlayerChoices(1).empty() == true);
		System.out.println(game.getPlayerChoices(2).empty() == true);

		/* SECTION #3 ================================================== 0.5 PTS */
		
		//1 
		game.play(pedro);
		game.play(ana);
		// 2
		game.play(pedro);
		game.play(pedro);
		game.play(ana);
		game.play(ana);
		// 3
		game.play(pedro);
		game.play(pedro);
		game.play(pedro);
		game.play(pedro);
		game.play(ana);
		game.play(ana);
		// 4
		game.play(pedro);
		game.play(ana);
		// 5	
		game.play(pedro);
		game.play(ana);
		game.play(ana);
		// 6
		game.play(pedro);
		game.play(pedro);
		game.play(ana);
		// 7
		game.play(pedro);
		game.play(ana);
		game.play(ana);
		game.play(ana);
		// 8
		game.play(pedro);
		game.play(ana);
		// 9
		game.play(pedro);
		game.play(pedro);
		game.play(ana);
		game.play(ana);
		// 10
		game.play(pedro);
		game.play(ana);
		game.play(ana);
		// 11
		game.play(pedro);
		game.play(ana);
		// 12
		game.play(pedro);
		game.play(pedro);
		game.play(ana);
		// 13
		game.play(pedro);
		game.play(ana);
		
		// PARA DAR NEW NA ÚLTIMA RODADA: PEDRO JOGA E NADA ACONTECE.
		game.play(pedro);

		
		/* SECTION #4 ================================================== 0.7 PTS */
		System.out.println();
		System.out.println(game.isFinished() == true); //OK
		
		// by player number
		System.out.println(game.getPlayerPoints(1) > 0); //OK
		System.out.println(game.getPlayerPoints(2) > 0); //OK

		// by player
		System.out.println(game.getPlayerPoints(pedro) > 0);//OK
		System.out.println(game.getPlayerPoints(ana) > 0);//OK

		// for consistency
		System.out.println(game.getPlayerPoints(pedro) == game.getPlayerPoints(1));//OK

		System.out.println(game.getPlayerPoints(1) <  game.getPlayerPoints(2));
		// suppose Pedro won
		System.out.println(ana.equals(game.getWinner()));
		// suppose Ana lost
		System.out.println(pedro.equals(game.getLoser()));
	
		int round = 1;

		// points by player number and round
		System.out.println(game.getPlayerPoints(1, round) > 0);
		// points by player number can use a constant in Player class
		System.out.println(Player.ONE == 1);
		System.out.println(game.getPlayerPoints(Player.ONE, round) > 0);
		// points by player and round
		System.out.println(game.getPlayerPoints(pedro, round) > 0);
		System.out.println(game.getPlayerPoints(2, round) == 0);
		// points by player and round can use a constant in Player and Round classes
		System.out.println(Round.FIFTH == 5);
		System.out.println(game.getPlayerPoints(Player.TWO, Round.TENTH) > 0);

		/* SECTION #5 ================================================== 0.8 PTS */
		System.out.println();
		// Category is an Enum
		System.out.println(Category.ACES instanceof Enum);

		// points by player number and category
		System.out.println(game.getPlayerPoints(1, Category.FULL_HOUSE) == 0);
		// points by player and category
		System.out.println(game.getPlayerPoints(pedro, Category.FULL_HOUSE) == 0);
		System.out.println(game.getPlayerPoints(2, Category.TWOS) == 0);

		// Pedro's choices
		IList<Choice> choices = game.getPlayerChoices(1);
		// always 13 rounds if the game is finished
		System.out.println(choices.count() == 13);

		Choice pedrosChoiceOne = choices.first();
		// consider that Pedro chose ACES in the first round
		System.out.println(pedrosChoiceOne.getCategory().equals(Category.ACES));
		// and earned at least one point
		System.out.println(pedrosChoiceOne.getPoints() > 0);

		IList<Round> rounds = game.getRounds();
		// always 13 rounds if the game is finished
		System.out.println(rounds.count() == 13);

		// thirteenth round
		Round lastRound = rounds.last();
		// last Pedro's choice (by player number)
		Choice lastAnasChoice = lastRound.getChoice(2);
		// last Pedro's choice (by player)
		Choice lastPedrosChoice = lastRound.getChoice(pedro);

		// cannot be ACES because was his first choice
		System.out.println( ! lastPedrosChoice.getCategory().equals(Category.ACES));
		// for consistency, the Pedro's first choice from Yahtzee or Round would be the same
		System.out.println(pedrosChoiceOne.equals(rounds.first().getChoice(pedro)));
	
	}

}
