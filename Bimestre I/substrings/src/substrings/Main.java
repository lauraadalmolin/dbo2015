package substrings;

public class Main {
	
	public static String substr (String x, int a, int b) {
		
		char[] chars = x.toCharArray();
		int l = chars.length;
		if (a > l || l + a < 0) {
			a = 0;
			b = 0;
		}
		if (a < 0) {
			a = l + a;
		}
		if (a < 0) {
			a = 0;
		}
		if (b < 0) {
			b = l + b;
		}
		if (b > l) {
			b = l;
		}
		if (b > 0 && a > 0 && b < a) {
			a = 0;
			b = 0;
		}
		char[] subs = new char[b - a];
		int n = 0;
		for (int i = a; i < b; i++, n++) {
			subs[n] = chars[i];
		}
		String retorno = new String(subs);
		return retorno;
	}


	public static String substr (String x, int a) {
		char[] chars = x.toCharArray();
		int l = chars.length;
		if (a > l || l + a < 0) {
			a = 0;
		}
		if (a < 0) {
			a = l + a;
		}
		if (a < 0) {
			a = 0;
		}
		char[] subs = new char[l - a];
		int n = 0;
		for (int i = a; i < l; i++, n++) {
			subs[n] = chars[i];
		}
		String retorno = new String(subs);
		return retorno;
	}

	public static void main(String[] args) {
		
		System.out.println("#01: " + substr("aspectos avancados de programacao", 0).equals("aspectos avancados de programacao"));
		System.out.println("#02: " + substr("aspectos avancados de programacao", 9).equals("avancados de programacao"));
		System.out.println("#03: " + substr("aspectos avancados de programacao", 33).equals(""));
		System.out.println("#04: " + substr("aspectos avancados de programacao", -1).equals("o"));
		System.out.println("#05: " + substr("aspectos avancados de programacao", -11).equals("programacao"));
		System.out.println("#06: " + substr("aspectos avancados de programacao", -33).equals("aspectos avancados de programacao"));
		System.out.println("#07: " + substr("aspectos avancados de programacao", -35).equals("aspectos avancados de programacao"));
		System.out.println("#08: " + substr("aspectos avancados de programacao", 5, 7).equals("to"));
		System.out.println("#09: " + substr("aspectos avancados de programacao", -5, -3).equals("ma"));
		System.out.println("#10: " + substr("aspectos avancados de programacao", 9, 18).equals("avancados"));
		System.out.println("#11: " + substr("aspectos avancados de programacao", 22, 35).equals("programacao"));
		System.out.println("#12: " + substr("aspectos avancados de programacao", -15, -11).equals(" de "));
		System.out.println("#13: " + substr("aspectos avancados de programacao", 22, -7).equals("prog"));
		System.out.println("#14: " + substr("aspectos avancados de programacao", -24, 15).equals("avanca"));
		System.out.println("#15: " + substr("aspectos avancados de programacao", 10, 5).equals(""));
		System.out.println("#16: " + substr("aspectos avancados de programacao", -5, -10).equals(""));
		System.out.println("#17: " + substr("aspectos avancados de programacao", -10, 10).equals(""));
		System.out.println("#18: " + substr("", 0).equals(""));
		System.out.println("#19: " + substr("", 5).equals(""));
		System.out.println("#20: " + substr("", -5).equals(""));
		System.out.println("#21: " + substr("", 5, 7).equals(""));
		System.out.println("#22: " + substr("", -5, -3).equals(""));
	
	}
}