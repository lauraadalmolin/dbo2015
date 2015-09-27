package yahtzee;

import toolkit.*;

public class Player {
	
	public static final int ONE = 1;
	public static final int TWO = 2;
	
	private String nome;
	private int points = 0;
	private List<Integer> p = new List<Integer>();
	protected Choice round_c = new Choice();
		
	private int times;
		
	public int getPointsTill(int i) {
		return p.get(i);
	}
	
	public Player(String string) {
		this.nome = string;
	}
	
	public String getName() {
		return nome;
	}

	public int getPoints() {
		return points;
	}
	
	public void sumPoints (int points_round) {
		points += points_round;
		p.append(points);
	}
	
	public void again() {
		times++;
	}
	
	public int getTimes() {
		return times;
	}
	
	public void renewTimes() {
		times = 0;
	}
	
	
 }
