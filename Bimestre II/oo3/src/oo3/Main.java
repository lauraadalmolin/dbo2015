package oo3;

public class Main {

	public static void main(String[] args) {
		// Relacionamentos 1-1
		// Relacionamentos 1-N
		
		Contato c1 = new Contato("Gabs");
		System.out.println(c1);
		
		Telefone t1 = new Telefone("9132-7772");
		c1.addTelefone(t1);
		c1.addTelefone(new Telefone("9996-7776"));
		c1.addTelefone(new Telefone("8117-6653"));
		c1.addTelefone(new Telefone("9145-5562"));
		
		System.out.println(c1.getTelefone(1));
		
		c1.removeTelefone(1);
		
		System.out.println(c1.getTelefone(1));
		
		

	}

}
