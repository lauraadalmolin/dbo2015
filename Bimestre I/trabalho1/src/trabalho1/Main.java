package trabalho1;

/* 1. Mostrar números primos até 10000.

Por exemplo:
2
3
5
7
11
13
...

Regras:

- Não pode usar a API do Java (métodos prontos - Math.random(), etc.);
- Não pode usar qualquer outro operador exceto + e -;
- Não pode usar vetores; */

public class Main {

	public static void main(String[] args) {
			
	boolean primo, divisivel;
	int a = 2, b = 2, n = 0, a1 = 0, a2 = 0, a3 = 0, a4 = 0;

	System.out.printf("\n-> Os 10000 primeiros numeros primos sao:\n");
		
	for (int i = 2; i <= 10000; i++) {
		primo = true;
			
			for (int j = 2; j < i; j++) {
				a = i;
				b = j;

				for (int res = 0; a > 0; res++) {
					a = a - b; 
				}

					if (a == 0) { divisivel = true; 
					} else { divisivel = false;	} 

						if (divisivel) { primo = false; }	
			}

		if (primo) { System.out.printf("\n- %d", i); 
	 		n++;
	 		if (i < 10) {
	 			a1++; 
	 		} else if (i < 100) {
	 		      	a2++; 
	 		   		} else { if (i < 1000) { 
	 		   					a3++; } else { a4++; } 
	 		   				}
	 	}
	 }

	System.out.println();
	System.out.printf("\n-> Foram encontrados %d numeros primos.", n);
	System.out.printf("\n\n-> De tais numeros primos:\n\n- %d possuem um algarismo;\n- %d possuem dois algarismos;\n- %d possuem tres algarismos.\n- %d possuem quatro algarismos.\n", a1, a2, a3, a4);


	}

} 
	
// Aluna: Laura de Aguiar Dalmolin
// Número de matrícula: 11030235