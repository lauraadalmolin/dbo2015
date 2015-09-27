package oo2;

public class Main {
	
	public static void main (String[] args) {

		//Telefone t1 = new Telefone();
		//t1.setNumero("3334-2223");
		//t1.setOperadora("Vivo");

		Cliente c1 = new Cliente();
		c1.setNome("Steve");
		// c1.setTelResidencial(t1);
		c1.getTelResidencial().setNumero("9132-7772");
		c1.getTelResidencial().setDdd("53");
		c1.getTelResidencial().setOperadora("Clear");
		c1.getEndereco().setRua("Privet Drive");
		c1.getEndereco().setNumero("4");
		c1.getEndereco().setCep("77777-777");

		Cliente c2 = new Cliente();
		c2.setNome("George");
		// c2.setTelResidencial(t1);
		c2.getTelResidencial().setNumero("8117-6653");
		c2.getTelResidencial().setDdd("53");
		c2.getTelResidencial().setOperadora("Alive");
		c2.getEndereco().setRua("Oxford Street");
		c2.getEndereco().setNumero("267");
		c2.getEndereco().setCep("17892-213");

		System.out.println(c1.getTelResidencial().getDdd());
		System.out.println(c1.getTelResidencial().getNumero());
		System.out.println(c1.getTelResidencial().getOperadora());
		System.out.println(c1.getEndereco().getRua());
		System.out.println(c1.getEndereco().getNumero());
		System.out.println(c1.getEndereco().getCep());
		System.out.println();
		System.out.println("   " + c1.getNome());
		System.out.println(c1.getTelResidencial().toString());
		System.out.println(c1.getEndereco().toString());
		System.out.println();
		System.out.println(c2.getTelResidencial().getDdd());
		System.out.println(c2.getTelResidencial().getNumero());
		System.out.println(c2.getTelResidencial().getOperadora());
		System.out.println(c2.getEndereco().getRua());
		System.out.println(c2.getEndereco().getNumero());
		System.out.println(c2.getEndereco().getCep());
		System.out.println();
		System.out.println("   " + c2.getNome());
		System.out.println(c2.getTelResidencial().toString());
		System.out.println(c2.getEndereco().toString());

	}
}