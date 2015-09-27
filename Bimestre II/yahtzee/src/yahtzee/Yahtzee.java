package yahtzee;

import toolkit.IList;
import toolkit.List;

public class Yahtzee {
	
	private List<Round> rounds = new List<Round>();
	private List<Choice> player1_choices = new List<Choice>();
	private List<Choice> player2_choices = new List<Choice>();
	private Player p1;
	private Player p2;
	private int[] dice_numbers1 = new int[5];
	private int[] dice_numbers2 = new int[5];
	private Dice d = new Dice();
	
	public Yahtzee(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	
	}
	
	public void play (Player p) {
		Choice round_choice1 = new Choice();
		Choice round_choice2 = new Choice();
		if (p2.getTimes() != 0 && p1.equals(p)) {
			Round r = new Round(p1, p2, p1.round_c, p2.round_c);
			rounds.append(r);
			player1_choices.append(p1.round_c);
			player2_choices.append(p2.round_c);
			p1.renewTimes();
			p2.renewTimes();
			
		}
		if (rounds.count() != 13) {  
			if (p.equals(p1) && p1.getTimes() < 3) {
				p1.again();
				for (int i = 0; i < 5; i++) dice_numbers1[i] = d.roll();
				p1.round_c = round_choice1.chooseCategory(dice_numbers1, p1, rounds.count());
			}
			if (p.equals(p2) && p2.getTimes() < 3) {
				p2.again();
				for (int i = 0; i < 5; i++) dice_numbers2[i] = d.roll();
				p2.round_c = round_choice2.chooseCategory(dice_numbers2, p2, rounds.count());
				
			}	
		}
		
	}
			

	/*public void fill() {
		for (int i = 0; i < 13; i++) {
			rounds.append(new Round());
		}
	}*/

	
	public boolean isFinished() {
		if (rounds.count() < 13) return false;
		return true;
	}

	public Player getWinner() {
		if (p1.getPoints() == p2.getPoints()) return null;
		if  (p1.getPoints() > p2.getPoints())  { return p1; }
		return p2;
	}
	
	public Object getLoser() {
		if (getWinner() == null) return null;
		if (getWinner() == p1) return p2;
		return p1;
	}

	public Player getPlayer(int i) {
		if (i == 1) return p1;
		return p2;
	}

	public List<Round> getRounds() {
		return rounds;
	}



	public int getPlayerPoints(int i) {
		if (i == 1) return p1.getPoints();
		return p2.getPoints();
	}

	public int getPlayerPoints(Player p) {
		if (p.equals(p1)) return p1.getPoints();
		return p2.getPoints();
	}

	public int getPlayerPoints(int i, int round) {
		return rounds.get(round).getPlayer(i).getPointsTill(round);
	}

	public int getPlayerPoints(Player p, int round) {
		int i = 0;
		if (p.equals(p1)) i = 1;
		else i = 2;
		return rounds.get(round).getPlayer(i).getPointsTill(round);
	}

	
	public int getPlayerPoints(int j, Category c) {
		for (int i = 0; i < rounds.count(); i++) {
			if (rounds.get(i).getChoice(j).getCategory() == c) return rounds.get(i).getChoice(j).getPoints();
		}
		return 0;
	}
	

	public IList<Choice> getPlayerChoices(int i) {
		if (i == 1) return player1_choices;
		return player2_choices;
	}

	public int getPlayerPoints(Player p, Category c) {
		int j;
		if (p.equals(p1)) j = 1;
		else j = 2;
		for (int i = 0; i < rounds.count(); i++) {
			if (rounds.get(i).getChoice(j).getCategory() == c) return rounds.get(i).getChoice(j).getPoints();
		}
		return 0;
	}
	
	
}
