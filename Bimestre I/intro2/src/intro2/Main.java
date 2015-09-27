package intro2;

public class Main {

	public static int multiplica (int m, int n)  {
		// static: método da classe
		// int: tipo de retorno
		// int, int: tipo de entrada (parâmetros, argumentos)
		int r = 0;
		for (int i = 0; i < n; i++) r += m;
		return r;
	}
	
	public static int potencia (int base, int exp) {
		if (exp < 0) {
			throw new IllegalArgumentException("Expoente negativo nao permitido!");
		}
		int r = 1;
		for (int i = 0; i < exp; i++) { 
		r = multiplica(r, base);
		}
		if (base < 0 && exp % 2 != 0) r = multiplica(r, -1);
		if (exp == 0) r = 1; 
	
		return r;	
	}	

	public static int quadrado (int base) {
		return potencia(base, 2);
	}


	public static int cubo (int base) {
		return potencia(base, 3);
	}

	public static void main(String[] args) {
		
		// Assertiva: expressão verdadeira
		System.out.println(1 == 1);	
		//
		System.out.println(0.1 == 0.1);
		//
		System.out.println(0.1 + 0.1 == 0.2);
		//
		System.out.println(0.1 + 0.1 + 0.1 == 0.3);
		//
		System.out.println(0.1 + 0.1 + 0.1);
		//
		// Operações com Double e Float não são precisas.
		// -------> Floating Point Problem.
		// assertiva
		System.out.println(multiplica(3, 5) == 15);
		
		System.out.println(multiplica(12, 2) == 24);
		// qual é a especificação?
		// especificação é um contrato
		System.out.println();
		
		System.out.println(potencia(2, 3) == 8);

		System.out.println(potencia(3, 2) == 9);
		
		// casos diferentes:
		System.out.println(potencia(3, 1) == 3);
		System.out.println(potencia(3, 0) == 1);
		
		// exceção: caso em que é negado
		try {
		  System.out.println(potencia(3, -2) == 1);
		} catch (Exception e) { 
			// o 'e' representa a variável excessão
			// se for impresso apresenta a mensagem de erro java.lang.IllegalArgumentException
		  System.out.println(e);
		  // ou colocar só a mensagem de erro aqui mesmo e apagar lá do throw.
		}

		System.out.println(potencia(3, 2));
		System.out.println(quadrado(5) == 25);
		System.out.println(cubo(5) == 125);

	}
}