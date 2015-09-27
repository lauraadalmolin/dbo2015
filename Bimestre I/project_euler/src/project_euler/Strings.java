package project_euler;

public class Strings {


	public static int expoente (int n) {
		int i = 10, j = 1;
		if (n > 1000000000) return 10;
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

	public static char intchar (int a) {
		switch (a) {
			case 0 : return 48;
			case 1 : return 49;
			case 2 : return 50;
			case 3 : return 51;
			case 4 : return 52;
			case 5 : return 53;
			case 6 : return 54;
			case 7 : return 55;
			case 8 : return 56;
			case 9 : return 57;
			default : return 0;
		}
	}

	public static char[] fromInt (int x) {
		int[] n1 = new int[expoente(x)];
		char[] a = new char[n1.length];
		n1 = converter (x, (expoente(x)-1));
		for (int i = 0; i < n1.length; i++) {
			a[i] =  intchar(n1[i]);
		}
		return a;
		
	}

}