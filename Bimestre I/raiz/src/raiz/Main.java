package raiz;

// Projetar e implementar o método sqrt para calcular a raiz quadrada de um número inteiro;
// Considere utilizar a Equação de Pell;
// Para inexatos utilizar o inteiro menor (sqrt(30) = 5);
// Deve utilizar métodos auxiliares;
// Não pode API, *, /, % e arrays.

public class Main {
	
	// Pela equação de Pell tem-se que para extrair a parte inteira do valor deve-se subtrair números ímpares
	// consecutivos do número a ser extraída a raiz enquanto o número for maior ou igual ao número ímpar. 
	public static int sqrt (int n) {
		
		if (n < 0) { throw new IllegalArgumentException(); }

		int raiz, i, exata = 0;

		for (i = 1; n >= i; i+=2) {
			n = n - i;
			exata++;
		}	

		if (n == 0)	{ raiz = exata; }
		else { raiz = n; }

		return raiz;
	}

	public static void main(String[] args) {

		System.out.println(sqrt(1) == 1);
		System.out.println(sqrt(2) == 1);
		System.out.println(sqrt(4) == 2);
		System.out.println(sqrt(6) == 2);
		System.out.println(sqrt(275625) == 525);
		System.out.println(sqrt(546016689) == 23367);
		try {
			System.out.println(sqrt(-25) == 5);
		} catch (Exception e) {
			System.out.println("Numeros negativos nao sao aceitos.\nExcecao: ");
			System.out.print(e);
		}
	}
}