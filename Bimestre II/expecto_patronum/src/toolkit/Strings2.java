package toolkit;

public class Strings2 {

	public static long pot (int n) {
		long x = 1;
		for (int i = 0; i < n; i++) {
			x *= 10;
		}
		return x;
	}

	public static boolean teste (char a) {
		switch (a) {
			case '1' : return true;	
			case '2' : return true;
			case '3' : return true;
			case '4' : return true;
			case '5' : return true;
			case '6' : return true;
			case '7' : return true;
			case '8' : return true;
			case '9' : return true;
			case '0' : return true;
			default : return false;
		}
	}
	
	public static int change (char a) {
		switch (a) {
			case '1' : return 1;	
			case '2' : return 2;
			case '3' : return 3;
			case '4' : return 4;
			case '5' : return 5;
			case '6' : return 6;
			case '7' : return 7;
			case '8' : return 8;
			case '9' : return 9;
			case '0' : return 0;
			default : return -1;
		}
	}
	
	public static long toInt (String x) {
		long soma = 0l;
		char[] a = x.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (teste(a[i]) == false) return 0;
		}
		int n = 11;
		for (int i = 0; i < a.length; i++, n--) {
			soma += (change(a[i]) * pot(n));
		}
		return soma;
	}

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

	public static String fromInt (int x) {
		int[] n1 = new int[expoente(x)];
		char[] a = new char[n1.length];
		n1 = converter (x, (expoente(x)-1));
		for (int i = 0; i < n1.length; i++) {
			a[i] =  intchar(n1[i]);
		}
		String b = new String(a);
		return b;
	}

}

