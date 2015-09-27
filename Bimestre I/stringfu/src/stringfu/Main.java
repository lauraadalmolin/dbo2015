/* package stringfu;

public class Main {
	
	public static void main(String[] args) {

		String titulo = "tecnico em INFORMATICA para internet";

		// capitalizar
		// Tecnico em informatica para internet
		// "titulofazer"
		// Tecnico Em Informática Para Internet
		// inverter
		// TECNICO EM informatica PARA INTERNET

		int lg = titulo.length();
		String t1 = titulo, t2 = titulo, t3 = "";

		t1 = t1.toLowerCase();
		t1 = t1.substring(0,1).toUpperCase() + titulo.substring(1, lg).toLowerCase();
		System.out.printf("\nCapitalizado: %s\n", t1);

		t2 = t2.toLowerCase();
		
		t2 = t2.substring(0,1).toUpperCase() + t2.substring(1, lg);

		int z = 0;
	
		for(int i = 0; i < lg; i++) {
			z = i + 1;
			if ((t2.substring(i,z)).equals(" ")) {
				i++;
				z++;
				t2 = t2.substring(0, i) + t2.substring(i, z).toUpperCase() + t2.substring(z, lg);
				i--;
				z--;
			} 
		}

		System.out.printf("\n'Titulofazer': %s\n", t2);

		String a, b, c;		
		
		z = 0;
		
		for (int i = 0; i < lg; i++) {
			z = i + 1;
			a = titulo.substring(i, z);
			b = a.toLowerCase();
			c = a.toUpperCase();
			if (a == b) {
				a = a.toUpperCase();
				t3 = t3 + a; 
			} else if (a == c) {
				a = a.toLowerCase();
				t3 = t3 + a; 
			}
		}

		System.out.printf("\nInvertido: %s\n", t3);
	}
} */

// O de cima era o meu, agora é o do professor.

package stringfu;

public class Main {
	public static void main(String[] args) {
		
		String s= "teste"; // String literal
		char c = 'a'; // caractere literal
		// int i = c;
		// System.out.println((int)(c));
		// ['t', 'e', 's', 't', 'e']
		//   0    1    2    3    4
		char[] chars = s.toCharArray();
		System.out.println(chars[1]);

		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}

		for (int i = 0; i < chars.length - 1; i++) {
			chars[i] = (char) (chars[i] - 1);
		}

		System.out.println(chars);
		
		String s1 = "programador ";
		String s2 = "web";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		char[] re = new char[c1.length + c2.length];

		for (int i = 0; i < c1.length; i++) {
			re[i] = c1[i]; 
		}

		for (int i = c1.length; i < re.length; i++ ) {
			re[i] = c2[i - c1.length];
		}

		String s3 = new String (re);
		System.out.println(s3);
	}
}