package olimpiada;

import java.util.*;

public class decifra {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
		char[] tabela = scan.nextLine().toCharArray();
		char[] frase = scan.nextLine().toCharArray();
		scan.close();
		for (int i = 0; i < frase.length; i++) {
			for (int j = 0; j < tabela.length; j++) {
				if (frase[i] == tabela[j]) 	{
					frase[i] = alfabeto[j]; 
					break;
				}
			}
		}
		String saida = new String(frase);
		System.out.println(saida);	
		
	}
	
}
//bzedzeymziluz
