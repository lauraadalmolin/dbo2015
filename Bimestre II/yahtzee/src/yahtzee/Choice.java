package yahtzee;

import toolkit.List;

public class Choice {
	
	private Category c;
	private Category[] inner_c = new Category[13];
	private int[] inner_i = new int[13];
	private int points;
	private Player p;
	
	public Choice() {
		
	}
	
	public Category getCategory() {
		return c;
	}

	public int getPoints() {
		return points;
	}
	
	public Choice chooseCategory(int[] dice, Player p1, int x) {
		p = p1;
		int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;
		//count numbers
		for (int i = 0; i < 5; i++) {
			if (dice[i] == 1) ones++;
			if (dice[i] == 2) twos++;
			if (dice[i] == 3) threes++;
			if (dice[i] == 4) fours++;
			if (dice[i] == 5) fives++;
			if (dice[i] == 6) sixes++;			
		}
		inner_c[0] = Category.ACES;
		inner_i[0] = ones;
		inner_c[1] = Category.TWOS;
		inner_i[1] = twos * 2;
		inner_c[2] = Category.THREES;
		inner_i[2] = threes * 3;
		inner_c[3] = Category.FOURS;
		inner_i[3] = fours * 4;
		inner_c[4] = Category.FIVES;
		inner_i[4] = fives * 5;
		inner_c[5] = Category.SIXES;
		inner_i[5] = sixes * 6;
		inner_c[6] = Category.CHANCE;
		inner_i[6] = ones + twos * 2 + threes * 3 + fours * 4 + fives * 5 + sixes * 6;
		inner_c[7] = Category.YAHTZEE;
		inner_i[7] = 0;
		inner_c[8] = Category.FULL_HOUSE;
		inner_i[8] = 0;
		inner_c[9] = Category.FOUR_OF_A_KIND;
		inner_i[9] = 0;
		inner_c[10] = Category.THREE_OF_A_KIND;	
		inner_i[10] = 0;
		inner_c[11] = Category.SMALL_STRAIGHT;		
		inner_i[11] = 0;
		inner_c[12] = Category.LARGE_STRAIGHT;	
		inner_i[12] = 0;
		// com os outros 
		// YAHTZEE
		if (ones == 5 || twos == 5 || threes == 5 || fours == 5 || fives == 5 || sixes == 5) {
			inner_i[7] = 50;
		}		
		// FULL_HOUSE
		// SE NÃO ME ENGANO É DOIS DE UM E TRÊS DE OUTRO
		if ((ones == 3 && twos == 2) || (ones == 2 && twos == 3) || (ones == 3 && threes == 2) || (ones == 2 && threes == 3) ||
			(ones == 3 && fours == 2) || (ones == 2 && fours == 3) || (ones == 3 && fives == 2) || (ones == 2 && fives == 3) ||
			(ones == 3 && sixes == 2) || (ones == 2 && sixes == 3) || (twos == 3 && threes == 2) || (twos == 2 && threes == 3) ||
			(twos == 3 && fours == 2) || (twos == 2 && fours == 3) || (twos == 3 && fives == 2) || (twos == 2 && fives == 3) ||
			(twos == 3 && sixes == 2) || (twos == 2 && sixes == 3) || (threes == 3 && fours == 2) || (threes == 2 && fours == 3) ||
			(threes == 3 && fives == 2) || (threes == 2 && fives == 3) || (threes == 3 && sixes == 2) || (threes == 2 && sixes == 3) ||
			(fours == 3 && fives == 2) || (fours == 2 && fives == 3) || (fours == 3 && sixes == 2) || (fours == 2 && sixes == 3)||
			(fives == 3 && sixes == 2) || (fives == 2 && sixes == 3)) {
			inner_i[8] = 25;
		}
		// FOUR_OF_A_KIND
		if (ones >= 4 || twos >= 4 || threes >= 4 || fours >= 4 || fives >= 4 || sixes >= 4) {
			inner_i[9] = ones + twos * 2 + threes * 3 + fours * 4 + fives * 5 + sixes * 6;
		}
		// THREE_OF_A_KIND
		if (ones >= 3 || twos >= 3 || threes >= 3 || fours >= 3 || fives >= 3 || sixes >= 3) {
			inner_i[10] = ones + twos * 2 + threes * 3 + fours * 4 + fives * 5 + sixes * 6;
		}
		// SMALL_STRAIGHT
		if ((ones != 0 && twos != 0 && threes != 0 && fours != 0) || (twos != 0 && threes != 0 && fours != 0 && fives != 0) || (threes != 0 && fours != 0  && fives != 0 && sixes != 0)) {
			inner_i[11] = 30;
		}
		// LARGE_STRAIGHT
		if ((ones == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1) || (twos == 1 && threes == 1 && fours == 1 && fives == 1 && sixes == 1)) {
			inner_i[12] = 40;
		}
		
		c = inner_c[x];
		points = inner_i[x];
		return this;
	}

	
	
	
}
