package trim;

// 	Criar os métodos trimLeft, trimRight e trim.
//  Lidar com casos que fogem do padrão.

public class Main {
	
	public static String trimLeft (String x) {

		char[] a = x.toCharArray();
		int k = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] == ' ' || a[i] == '\r' || a[i] == '\n' || a[i] == '\t') { k++;
			} else { i = a.length + 1; }
		}
		char[] b = new char[a.length - k];
		for(int i = 0; i < b.length; i++) {
			b[i] = a[k]; 
			k++;
		}
		String y = new String(b);
		return y;
	}

	public static String trimRight (String x) {
		char[] a = x.toCharArray();
		int k = a.length;
		for(int i = a.length - 1; i >= 0; i--) {
			if (a[i] == ' ' || a[i] == '\r' || a[i] == '\n' || a[i] == '\t') { k--;
			} else { i = 0; }
		}
		char[] b = new char[k];
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i]; 
		}
		String y = new String(b);
		return y;
	}

	public static String trim (String x) {
		x = trimRight(x);
		x = trimLeft(x);
		return x;
	}

	public static void main(String[] args) {
		System.out.println("As assertivas que deram false eram para dar false");
		// aparar String à esquerda: remover espaços à esquerda da String
		// trimLeft, leftTrim, apararEsquerda, trimBegin, ...
		System.out.println(trimLeft("    abc  ").equals("abc  "));
		System.out.println(trimLeft("    com espaco  ").equals("    com espaco"));
		System.out.println(trimLeft("\r\n\t com return, line feed, tab e espaco  \n").equals("com return, line feed, tab e espaco  \n"));
		System.out.println(trimLeft("dbo ").equals("dbo "));
		System.out.println(trimLeft("  ").equals(""));
		// aparar String à direita: remover espaços à direita da String
		//trimRight, rightTrim, apararDireita, trimEnd, ...
		System.out.println(trimRight("    abc  ").equals("    abc"));
		System.out.println(trimRight("    abc\r\n\t").equals("    abc"));
		//A de baixo tem que dar false
		System.out.println(trimRight(" dbo").equals("dbo "));
		System.out.println(trimRight("   ").equals(""));
		System.out.println(trimRight("dbo").equals("dbo"));
		// aparar String em ambos lados
		// trim, allTrim, trimAll, trimTotal, apararAmbos, ...
		System.out.println(trim("    abc  ").equals("abc"));
		System.out.println(trim("\n\r\t      abc\n\r\t        ").equals("abc"));
		System.out.println(trim("    ").equals(""));
		System.out.println(trim("dbo").equals("dbo"));

	}
}




