package complex_numbers;

public class Main {
	
	public static void main(String[] args) {
		
		Complex n1 = new Complex (0, 2);
		System.out.println(n1.toString().equals("2.0i"));
		Complex n2 = new Complex (2);	
		System.out.println(n2.toString().equals("2.0i"));
		Complex n3 = new Complex (2, 0);
		System.out.println(n3.toString().equals("2.0"));
		System.out.println(n3.isReal());
		System.out.println(n1.isPure());
		System.out.println(n2.isPure());
		Complex n4 = new Complex (2, 2);
		Complex n5 = new Complex (3, 4);
		Complex n6 = n4.sum(n5); 
		System.out.println(n6.toString().equals("5.0 + 6.0i"));
		Complex n7 = new Complex (1.2, 2.4);
		Complex n8 = new Complex (0.2, 1.2);
		Complex n9 = n7.minus(n8);
		System.out.println(n9.toString().equals("1.0 + 1.2i"));
		n9 = n8.minus(n7);
		System.out.println(n9.toString().equals("-1.0 - 1.2i"));
		Complex n10 = n4.times(n2);
		System.out.println(n10.toString().equals("-4.0 + 4.0i"));
		n10 = n4.times(n5);
		System.out.println(n10.toString().equals("-2.0 + 14.0i"));
		Complex n11 = n5.times(n3);
		System.out.println(n11.toString().equals("6.0 + 8.0i"));
		System.out.println(n11.conjugate().toString().equals("6.0 - 8.0i"));
		System.out.println(n1.conjugate().toString().equals("-2.0i"));
		Complex n12 = n3.conjugate();
		System.out.println(n12.toString().equals("2.0"));
		Complex n13 = new Complex (2, 5);
		Complex n14 = new Complex (3, 2);
		String n15 = n13.over(n14);
		System.out.println(n15.equals("(16.0 + 11.0i)/(13.0)"));
		Complex n16 = new Complex (2, 5);
		Complex n17 = new Complex (3, -2);
		String n18 = n16.over(n17);
		System.out.println(n18.equals("(-4.0 + 19.0i)/(13.0)"));
		Complex n19 = new Complex();
		System.out.println(n19.toString().equals("0"));
		// Optei por fail-fast - isto é, lançar exceção, uma vez que a divisão por zero é uma impossibilidade matemática.
		// A divisão por zero, entretanto, pode ser considerada possível se o resultado de tal for infinito.
		try {
			String n20 = n16.over(n19);
		}
		catch (Exception e) {
			System.out.println("Impossivel dividir por 0");
		}
		

	}

}