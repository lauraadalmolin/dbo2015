package friends;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pedro = new Pessoa("Pedro");
		Pessoa ana = new Pessoa("Ana");
		Pessoa luiza = new Pessoa("Luiza");
		Pessoa matheus = new Pessoa("Matheus");
		Pessoa flavia = new Pessoa("Flavia");

		System.out.println(pedro.getAmigoContagem() == 0);
		System.out.println(ana.getAmigoContagem() == 0);

		pedro.addAmigo(ana);

		System.out.println(pedro.getAmigos().length == 1);
		System.out.println(ana.getAmigos().length == 1);

		luiza.addAmigo(pedro);
		System.out.println(pedro.getAmigos().length == 2);

		System.out.println(ana.getAmigo(0).equals(pedro));
		System.out.println(ana.getAmigo(1) == null);

		System.out.println(pedro.getAmigo(0).equals(ana));
		System.out.println(pedro.getAmigo(1).equals(luiza));

		ana.addAmigo(luiza);
		luiza.addAmigo(matheus);

		System.out.println(ana.getAmigo(1).equals(luiza));

		System.out.println(luiza.getAmigo(0).equals(pedro));
		System.out.println(luiza.getAmigo(1).equals(ana));
		System.out.println(luiza.getAmigo(2).equals(matheus));

		flavia.addAmigo(pedro);
		flavia.addAmigo(ana);
		flavia.addAmigo(luiza);
		flavia.addAmigo(matheus);

		System.out.println(flavia.getAmigos().length == 4);

		flavia.removeAmigo(ana);

		System.out.println(flavia.getAmigos().length == 3);

		System.out.println(flavia.getAmigo(0).equals(pedro));
		System.out.println(flavia.getAmigo(1).equals(luiza));
		System.out.println(flavia.getAmigo(2).equals(matheus));

		for (int i = 0; i < flavia.getAmigos().length; i++) {
		    System.out.println(flavia.getAmigo(i) != null);
		}

		System.out.println(flavia.getAmigo(0).getAmigo(0).equals(ana));
		                         // pedro    // ana      // luiza    // matheus
		System.out.println(flavia.getAmigo(0).getAmigo(0).getAmigo(1).getAmigo(2).equals(matheus));

		System.out.println(pedro.getAmigos().length == 3);

		pedro.addAmigo(pedro);

		System.out.println(pedro.getAmigos().length == 3);

		pedro.removeAmigo(0);
		pedro.removeAmigo(0);
		pedro.removeAmigo(0);

		System.out.println(pedro.getAmigos().length == 0);

	}

}
