package cryptography;

public class Main {
	
	public static void main(String[] args) {
		
		Crypto cr = new Crypto("minha chave");
		System.out.println( ! cr.encrypt("desenvolvimento baseado em objetos").equals("desenvolvimento baseado em objetos"));
		System.out.println(cr.encrypt("desenvolvimento baseado em objetos"));
		
		System.out.println(cr.decrypt(cr.encrypt("dbo")).equals("dbo"));

		Crypto cr2 = new Crypto("outra chave");
		System.out.println( ! cr.decrypt(cr2.encrypt("dbo")).equals("dbo"));
		System.out.println( ! cr2.decrypt(cr.encrypt("dbo")).equals("dbo"));
		
		System.out.println(cr.digest("desenvolvimento baseado em objetos, disciplina do curso tecnico em informatica para internet").length() == 64);
		System.out.println(cr.digest("desenvolvimento baseado em objetos").length() == 64);
		System.out.println(cr.digest("dbo").length() == 64);
		
		System.out.println( ! cr.digest("dbo").equals(cr.digest("poo")));
		
		System.out.println(cr.digest("dbo").equals(cr.digest("dbo")));

		System.out.println( ! cr.digest("dbo").equals(cr2.digest("dbo")));
		
	}
}