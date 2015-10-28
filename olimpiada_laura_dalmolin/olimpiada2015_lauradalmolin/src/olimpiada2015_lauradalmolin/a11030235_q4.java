package olimpiada2015_lauradalmolin;

import java.util.ArrayList;
import java.util.Scanner;

public class a11030235_q4 {
	
	public static void main(String[] args) {
		
//		P ROBLEMA 4: L ETRAS C ONSECUTIVAS
//		Remover de um literal, com no mínimo 1 e no máximo 100 letras, a maior sequência de letras
//		iguais consecutivas. No caso de haver mais de uma sequência de letras iguais consecutivas com o
//		maior comprimento, ambas devem ser removidas.
//		Exemplo de entrada 1
//		abccddeeeffaabcdeff\n Exemplo de saída 1
//		abccddffaabcdeff\n
//		Exemplo de entrada 2
//		aaaabbccccddeeeefff\n Exemplo de saída 2
//		bbddfff\n
//		Importante
//		Para garantir o entendimento da correta formatação dos dados, nos exemplos de entrada e da
//		saída:
//		a) foi mostrado o caractere de final de linha ('\n').
		
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		ArrayList<Integer> index = new ArrayList<Integer>();
//		ArrayList<Integer> in_a_row = new ArrayList<Integer>();
//		char[] array = s.toCharArray();
//		int iar;
//		for (int i = 0; i < array.length;) {
//			iar = 0;
//			int j = i;
//			char x = array[i];
//			while (x == array[j] && j < array.length) {
//				j++;
//				iar++;
//			}
//			in_a_row.add(iar);
//			System.out.println(i);
//			index.add(i);
//			i+=iar;
//		}
//		int max = 0;
//		int ix = 0;
//		for (int i = 0; i < in_a_row.size(); i++) {
//			max = Math.max(max, in_a_row.get(i));
//			ix = index.get(i);
//		}
//		System.out.println(in_a_row);
//		s = s.replace(s.substring(ix, ix+max), "");
//		
//		System.out.println(s);
		ArrayList<Integer> index = new ArrayList<Integer>();
		ArrayList<Integer> in_a_row = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] array = s.toCharArray();
		int iar = 1;
		for (int i = 0; i < array.length; i++) {
			if ((i + 1 < array.length)) {
				if (array[i] == array[i+1]) {
				iar++;
				}
			else {
				in_a_row.add(iar);
				index.add(i-iar);
				iar =1;
			}
			}
		}
		System.out.println(in_a_row);
//		s = s.replace(s.substring(ix, ix+max), "");
//		
//		System.out.println(s);
		
		
	}
	
	
}
