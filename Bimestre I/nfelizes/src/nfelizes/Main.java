package nfelizes;

public class Main {

	public static int expoente (int n) {
		int i = 10, j = 1;
		while (i <= n) {
			i *= 10;
			j++;
		}
		return j;
	} 

	public static int realizapotencia (int base, int expoente) {
		int res = 1;
		for (int i = 0; expoente > i; i++) {
			res = res * base;
		}
		return res;
	}

	public static int[] converter (int num, int exp) {
		int[] n = new int[exp + 1];
		int res;
		for (int i = 0; exp >= 0; exp--, i++) {
			res = realizapotencia(10, exp);
			n[i] = num / res;
			num = num % res;
		}
		return n;
	}
		
	public static void main(String[] args) {
		
		int n, soma, am = 0, div2 = 0, div3 = 0, div5 = 0, div7 = 0;

		System.out.printf("\n- Os numeros felizes entre 1 e Integer.MAX_VALUE sao:\n");

		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			n = i;
			for (; n != 1 && n != 4 && n != 16 && n != 37 && n != 58 && n != 89 && n != 145 && n != 42 && n != 20; ) {
				int[] n1 = new int[expoente(n)];
				n1 = converter (n, (expoente(n)-1));
				soma = 0;
				for (int k = 0; k < expoente(n); k++) {
					soma = n1[k] * n1[k] + soma;
				}
				n = soma;
			 } 
			if(n == 1) { System.out.printf("\n-> %d", i); 
			am++;
			if (i % 2 == 0) { div2++; }
			if (i % 3 == 0) { div3++; }
			if (i % 5 == 0) { div5++; }
			if (i % 7 == 0) { div7++; }
			} }
			System.out.printf("\n\nForam encontrados %d numeros felizes.\nDestes:\n- %d sao divisiveis por 2;\n- %d sao divisiveis por 3;\n- %d sao divisiveis por 5;\n- %d sao divisiveis por 7.\n", am, div2, div3, div5, div7);
		}
	}		