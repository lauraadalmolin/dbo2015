package oo5;

// academico.riogrande.ifrs.edu.br/~marcio.torres/downloads

public class Main {

	public static void main(String[] args) {
		
		Cliente bruno = new Cliente("Bruno");
		System.out.println(bruno); // Bruno
		
		Poupanca p = new Poupanca (bruno, 21, 4332, 1500.0);
		
		Corrente c = new Corrente (bruno, 21, 8873, 4000.0);
		
		Especial e = new Especial (bruno, 21, 6633, 6000.0, 1000.0);
		
		e.saque(6500.0); // possível
		
		System.out.println(e.getSaldo());
		
		e.deposito(800.0);
		
		System.out.println(e.getSaldo());

	}

}
