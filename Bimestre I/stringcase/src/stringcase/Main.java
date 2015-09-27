package stringcase;

// Implementar a troca de caixa de Strings
// Upper, Lower, Capitalize

public class Main {
	
	public static String upper (String st) {
		char[] a = st.toCharArray();
		char[] b = new char[a.length]; 
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
				case 'a' : b[i] = 'A'; break;
				case 'b' : b[i] = 'B'; break;
				case 'c' : b[i] = 'C'; break;
				case 'd' : b[i] = 'D'; break;
				case 'e' : b[i] = 'E'; break;
				case 'f' : b[i] = 'F'; break;
				case 'g' : b[i] = 'G'; break;
				case 'h' : b[i] = 'H'; break;
				case 'i' : b[i] = 'I'; break;
				case 'j' : b[i]	= 'J'; break;
				case 'k' : b[i] = 'K'; break;
				case 'l' : b[i] = 'L'; break;
				case 'm' : b[i] = 'M'; break;
				case 'n' : b[i]	= 'N'; break;
				case 'o' : b[i] = 'O'; break;
				case 'p' : b[i] = 'P'; break;
				case 'q' : b[i] = 'Q'; break;
				case 'r' : b[i] = 'R'; break;
				case 's' : b[i] = 'S'; break;
				case 't' : b[i] = 'T'; break;
				case 'u' : b[i] = 'U'; break;
				case 'v' : b[i] = 'V'; break;
				case 'w' : b[i] = 'W'; break;
				case 'x' : b[i] = 'X'; break;
				case 'y' : b[i] = 'Y'; break;
				case 'z' : b[i] = 'Z'; break;
				default : b[i] = a[i]; 
			}
		}
		String y = new String(b);
		return y;	
	}

		public static String lower (String x) {
		char[] a = x.toCharArray();
		char[] b = new char[a.length]; 
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
				case 'A' : b[i] = 'a'; break;
				case 'B' : b[i] = 'b'; break;
				case 'C' : b[i] = 'c'; break;
				case 'D' : b[i] = 'd'; break;
				case 'E' : b[i] = 'e'; break;
				case 'F' : b[i] = 'f'; break;
				case 'G' : b[i] = 'g'; break;
				case 'H' : b[i] = 'h'; break;
				case 'I' : b[i] = 'i'; break;
				case 'J' : b[i]	= 'j'; break;
				case 'K' : b[i] = 'k'; break;
				case 'L' : b[i] = 'l'; break;
				case 'M' : b[i] = 'm'; break;
				case 'N' : b[i]	= 'n'; break;
				case 'O' : b[i] = 'o'; break;
				case 'P' : b[i] = 'p'; break;
				case 'Q' : b[i] = 'q'; break;
				case 'R' : b[i] = 'r'; break;
				case 'S' : b[i] = 's'; break;
				case 'T' : b[i] = 't'; break;
				case 'U' : b[i] = 'u'; break;
				case 'V' : b[i] = 'v'; break;
				case 'W' : b[i] = 'w'; break;
				case 'X' : b[i] = 'x'; break;
				case 'Y' : b[i] = 'y'; break;
				case 'Z' : b[i] = 'z'; break;
				default : b[i] = a[i]; 
			}
		}
		String y = new String(b);	
		return y;
	}

	public static String capitalize (String x) {

		if(x == "") { return x;}
		x = lower(x);
		char[] a = x.toCharArray();
		char[] b = new char[a.length];
		
		int i = 0;

		for(i = 0; a[i] == ' '; i++) {
		b[i] = ' '; }
			
		switch(a[i]) {
				case 'a' : b[i] = 'A'; break;
				case 'b' : b[i] = 'B'; break;
				case 'c' : b[i] = 'C'; break;
				case 'd' : b[i] = 'D'; break;
				case 'e' : b[i] = 'E'; break;
				case 'f' : b[i] = 'F'; break;
				case 'g' : b[i] = 'G'; break;
				case 'h' : b[i] = 'H'; break;
				case 'i' : b[i] = 'I'; break;
				case 'j' : b[i]	= 'J'; break;
				case 'k' : b[i] = 'K'; break;
				case 'l' : b[i] = 'L'; break;
				case 'm' : b[i] = 'M'; break;
				case 'n' : b[i]	= 'N'; break;
				case 'o' : b[i] = 'O'; break;
				case 'p' : b[i] = 'P'; break;
				case 'q' : b[i] = 'Q'; break;
				case 'r' : b[i] = 'R'; break;
				case 's' : b[i] = 'S'; break;
				case 't' : b[i] = 'T'; break;
				case 'u' : b[i] = 'U'; break;
				case 'v' : b[i] = 'V'; break;
				case 'w' : b[i] = 'W'; break;
				case 'x' : b[i] = 'X'; break;
				case 'y' : b[i] = 'Y'; break;
				case 'z' : b[i] = 'Z'; break;
				default : b[i] = a[i]; 
			}
			i++;
			for (; i < b.length; i++) b[i] = a[i];
	
		String s = new String(b);
		return s;
	}

	public static boolean eq (String a, String b) {

		if (a == null && b == null) return true;
		if (a == null || b == null) return false;

		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();
		if (aChar.length != bChar.length) return false;
		for (int i = 0; i < aChar.length; i++) {
			if (aChar[i] != bChar[i]) return false;
		}

	return true;
	
	}

	public static void main(String[] args) {
		
		System.out.println(eq(upper("teste222AAAAa"), "TESTE222AAAAA"));
		System.out.println(eq(upper(""), ""));
		System.out.println(eq(lower("TESTE222AAAAA"), "teste222aaaaa"));
		System.out.println(eq(lower(""), ""));
		System.out.println(eq(capitalize("teste"), "Teste"));
		System.out.println(eq(capitalize(" teste"), " Teste"));
		System.out.println(eq(capitalize("TESTE"), "Teste"));
		System.out.println(eq(capitalize("RTFM / LoL"), "Rtfm / lol"));
		System.out.println(eq(capitalize(""), ""));
	
	}
}