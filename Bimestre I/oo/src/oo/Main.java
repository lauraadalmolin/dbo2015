package oo;

public class Main {
	
	public static void main(String[] args) {
		Time t90 = new Time(3, 40, 10);
		Time t91 = new Time(3, 40, 10);
		System.out.println(t90);
		System.out.println(t91);
		System.out.println(t90 == t91); // true or false?
		System.out.println(t90.equals(t91)); // true or false?

	
	}


	public static void testeAgua() {
		// temperatura
		// todo modelo virtual é uma imitação da realidade
		Agua agua = new Agua();
		System.out.println(agua.temperatura()); // 20°C
		Agua agua2 = new Agua(27);
		System.out.println(agua2.temperatura()); // 27°C

		agua.aquece(); // +1;
		agua.aquece(); // +1;
		agua.aquece(); // +1;
		System.out.println(agua.temperatura() == 23);
		// estado de objetos tem pré-condições e pós-condições
		// assertiva: não existem três false ou dois true
		
		System.out.println(agua.estaLiquida());
		System.out.println(agua.estaGasosa());
		System.out.println(agua.estaSolida());

		while(! agua.estaGasosa()) agua.aquece();
		
		System.out.println(agua.estaLiquida());
		System.out.println(agua.estaGasosa());
		System.out.println(agua.estaSolida());

		System.out.println(agua.temperatura());

		//agua.temperatura() = -1;

		System.out.println(agua.estaSolida());
	}
}