package yahtzee;

import toolkit.*;

public class Dice {
	
		private int valor = 1;
		private IRandom randomizer;
	
		public Dice () {
			this.randomizer = new Random();
			roll();
		}
	
		public int roll() {
			randomizer.next();
			valor = (int) (randomizer.get() * 6 + 1);
			return valor;
		}

		public int getValor() {
			return valor;
		}
		
		public String toString() {
			return valor + "";
		}
	
}
