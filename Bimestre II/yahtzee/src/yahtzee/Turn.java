package yahtzee;

public class Turn {
	
	private int times;
	private Player p1;
	
	public Turn (Player p1) {
		this.p1 = p1;
	}
	
	public void again() {
		times++;
	}
	
	public int getTimes() {
		return times;
	}
	
}
