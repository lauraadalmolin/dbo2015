package dice_trial;

public class Main {

	public static void main(String[] args) {
		
		Dice d = new Dice();
		
		System.out.println(d.getValor());
		
		for (int i = 0; i < 100; i++) {
			d.role();
			System.out.println(d.getValor());
		}
		
		

	}

}
