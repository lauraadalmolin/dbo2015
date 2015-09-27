package dice_trial;

import toolkit.*;

public class Dice {
	
		private int valor = 1;
		private IRandom randomizer;
	
		public Dice () {
			this.randomizer = new Random();
			role();
		}
	
		public void role() {
			randomizer.next();
			valor = (int) (randomizer.get() * 6 + 1);
		}

		public int getValor() {
			return valor;
		}
		
		public String toString() {
			return valor + "";
		}
	
}
