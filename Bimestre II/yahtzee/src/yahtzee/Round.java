package yahtzee;

import toolkit.List;

public class Round {
	
	public static final int FIRST = 1;
	public static final int SECOND = 2;
	public static final int THIRD = 3;
	public static final int FOURTH = 4;
	public static final int FIFTH = 5;
	public static final int SIXTH = 6;
	public static final int SEVENTH = 7;
	public static final int EIGHT = 8;
	public static final int NINTH = 9;
	public static final int TENTH = 10;
	public static final int ELEVENTH = 11;
	public static final int TWELFTH = 12;
	public static final int THIRTEENTH = 13;
	
	private Choice p1_choice = new Choice();
	private Choice p2_choice = new Choice();
	
	private int p1_points;
	private int p2_points;
	
	private Player p1;
	private Player p2;
	
	public Round (Player p1, Player p2, Choice c1, Choice c2) {
		p1_choice = c1;
		p2_choice = c2;
		this.p1 = p1;
		this.p2 = p2;
		p1_points = c1.getPoints();
		p2_points = c2.getPoints();
		p1.sumPoints(p1_points);
		p2.sumPoints(p2_points);
		
	}
	
	public Choice getChoice(int i) {
		if (i == 1) return p1_choice;
		return p2_choice;
	}
	

		
	public int getPoints (int i) {
		if (i == 1) return p1_points;
		return p2_points;
	}

	public Choice getChoice(Player p) {
		if (p.equals(p1)) return p1_choice;
		return p2_choice;
	}
	
	public Player getPlayer (int i) {
		if (i == 1) return p1;
		return p2;
	}
	
	



	
	
}
