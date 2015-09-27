package poo1;


public class Main {

	/*
	
	public static int[] mfracoes (int a, int b, int c, int d) {
		
		int[] n = new int[2];
		n[0] = a * c;
		n[1] = b * d;

		return n;
 	} */

	public static void main(String[] args) {
		
		// Fracao.numerador(ERRADO)
		// tipo variável = valor
		Fracao a = new Fracao(2, 3); 
		// instância - quando se põe o new é uma instância
		// instanciando ou construindo
		System.out.println(a.numerador);
		System.out.println(a.denominador);

		//a.numerador = 2;
		//a.denominador = 3;
		
		// Construtor vazio (automático)
		//Fracao b = new Fracao(2, 5); //() = CONSTRUTOR
		// não tem new não tem objeto
		// só existe objeto quando se tem new 
		// new Classe() -> Constrói um objeto

		//System.out.println(mfracoes(a, b).numerador == 6);
		//System.out.println(mfracoes(a, b).denominador == 15);
		
		Fracao f2 = new Fracao(2); 
		System.out.println(f2.numerador);
		System.out.println(f2.denominador);

		Fracao t1 = new Fracao(3, 4);
		Fracao t2 = new Fracao(5, 6);
		Fracao t3 = t1.multiplica(t2);
		System.out.println(t3.numerador == 15);
		System.out.println(t3.denominador == 24);
		Fracao t4 = t1.divide(t2);
		System.out.println(t4.numerador == 18);
		System.out.println(t4.denominador == 20);
		

	}
}

// Objetos podem ser usados para carregar dados, por exemplo carregar o numerador e denominador de uma Fracao.
// Frequentemente objetos substituem vetores