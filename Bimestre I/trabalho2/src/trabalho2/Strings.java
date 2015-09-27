package stringsathome;

public class Strings {

	public static int toInt (char a) {
		
		switch (a) {
			case '0' : return 0;
			case '1' : return 1;
			case '2' : return 2;
			case '3' : return 3;
			case '4' : return 4;
			case '5' : return 5;
			case '6' : return 6;
			case '7' : return 7;
			case '8' : return 8;
			case '9' : return 9;
			default : return 0;
		}
	}

	public static boolean endsWith (String x, String y) {
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		int n1 = a.length - 1;
		int n2 = b.length - 1;
		if (n2 > n1) return false;
		for(int i = n1; n2 >= 0; i--) {
			if(a[i] != b[n2]) return false;
			n2--;
		}
		return true;
	}

	public static boolean startsWith (String x, String y) {
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		int n1 = a.length;
		int n2 = b.length;
		if (n2 > n1) return false;
		for(int i = 0; i < n2; i++){
			if(a[i] != b[i]) return false;
		}
		return true;
	}

	public static boolean hasChar (String x, char y) {
		char[] a = x.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == y) return true;
		}
		return false;
	}

	public static int count (String x, char y) {
		char[] a = x.toCharArray();
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == y) n++;
		}
		return n;
	}

	public static String reverse (String x) {
		char[] a = x.toCharArray();
		char[] b = new char[a.length];
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			b[i] = a[j];
			j--;
		}
		String retorno = new String(b);
		return retorno;

	}
}