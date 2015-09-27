package nperfeitos;

public class Main {

	public static void main(String[] args) {
			
	boolean divisivel;
	long a = 2L, b = 2L, n = 0L, soma;

	System.out.printf("\n-> The perfect numbers between 1 and 9223372036854775807 are:\n");
		
		for (long i = 2L; i <= 9223372036854775807L; i++) {
			soma = 0L;
				// Esse for é o for dos divisores
				
				for (long j = 1L; j < i / 2; j++) {
					a = i;
					b = j;
					
					// Esse for executa a divisão
					for (long res = 0L; a > 0L; res++) {
						a = a - b; 
					}
						// Se for igual a zero recebe true
						if (a == 0L) { 
								soma = soma + b;
							}	
				}

			System.out.println();
			System.out.println(i);
			System.out.println();
	 		
	 		if (soma == i) {
	 			System.out.printf("\nYeah, it's true! I found that %d is a perfect number!", i);
	 		}

		}
	}
}

 
	