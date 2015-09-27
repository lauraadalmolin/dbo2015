package equals;

// Implementar a comparação de Strings
// Regras e restrições:
// - Não pode API;
// - Concatenar também não pode;
// - Pode array de char;
// - Pode length do array de char;
// - Pode e deve: String s = new String(array de char);

public class Main {

	public static boolean eq (String x, String y) {
		
		if (x == null && y == null) return true;
		if (x == null || y == null) return false;

		boolean iguais = true;
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		
		if (a.length == b.length) {
		   for(int i = 0; i < a.length && iguais; i++) {
		   if (a[i] != b[i]) iguais = false;
		   }
		} else { iguais = false; }

		return iguais;
	} 


	public static void main(String[] args) {
	
	System.out.println(eq("teste", "teste") == true);
	System.out.println(eq("teste   ", "teste   ") == true);
	System.out.println(eq("", "") == true);
	System.out.println(eq("teSte", "teste") == false);
	System.out.println(eq("dbo", "poo") == false);
	System.out.println(eq("dbo", null) == false);
	System.out.println(eq(null, "poo") == false);
	System.out.println(eq(null, null) == true);

	}
}

/* Programa do Márcio

package equals;

public class Main {
	
	public static void main(String[] args) {
		
	System.out.println(Strings.eq("teste1", "teste11") == false);
	System.out.println(Strings.eq("teSte", "teste") == false);
	System.out.println(Strings.eq("teste", "teste") == true);
	System.out.println(Strings.eq("teste   ", "teste   ") == true);
	System.out.println(Strings.eq("", "") == true);
	System.out.println(Strings.eq("dbo", "poo") == false);
	System.out.println(Strings.eq("dbo", null) == false);
	System.out.println(Strings.eq(null, "poo") == false);
	System.out.println(Strings.eq(null, null) == true);
	System.out.println();

	}
}

*/