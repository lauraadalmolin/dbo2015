package random;


public class Main {
	
	public static void main (String[] args) {
	
		// como o teste não é preciso, podemos gerar 1 milhão de vezes e checar se estão no intervalo
		System.out.println("Testando intervalo ...");
		IRandom r = new Random();
		for (int i = 0; i < 1000000; i++) {
		    r.next();
		    double n = r.get();
		    if (n < 0 || n >= 1.0) System.out.println("false: " + n);
		}
		
		System.out.println();

		System.out.println("Testando semente ...");
		int semente = 456677;
		IRandom r1 = new Random(semente);
		IRandom r2 = new Random(semente);
		for (int i = 0; i < 10; i++) {
		    r1.next(); r2.next();
		    if (r1.get() != r2.get()) System.out.println("false: " + r1 + " " + r2);
		}

		System.out.println("Testando variação ...");
		IRandom r3 = new Random();
		int[] variacao = new int[10];
		for (int i = 0; i < 1000000; i++) {
		    r3.next();
		    variacao[((int) (r3.get() * 10))]++;
		}
		System.out.println(java.util.Arrays.toString(variacao));
		// a rigor, deveria ser testado se mantém uma distribuição uniforme, ou seja,
		// se acontece aproximadamente 100000 vezes um número entre 0 e 0.1, 0.1 e 0.2,
		// 0.2 e 0.3, e assim por diante, mas fica para outro caso.
		
		
	}

}
