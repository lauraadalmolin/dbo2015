package olimpiada2015_lauradalmolin;

import java.util.ArrayList;
import java.util.Scanner;

public class a11030235_q2 {
	public static void main(String[] args) {
//		P ROBLEMA 2: I NTERSECÇÃO DE C ONJUNTOS
//		Mostrar o resultado da intersecção de dois conjuntos de números inteiros positivos, com no
//		mínimo 0 e no máximo 100 elementos em ordem crescente cada na forma ( e 1 e 2 e 3 ... e n ).
//		Exemplo de entrada 1
//		(_1_2_3_)\n
//		(_1_3_5_7_9_)\n Exemplo de saída 1
//		(_1_3_)\n
//		Exemplo de entrada 2
//		(_)\n
//		(_1_2_3_)\n Exemplo de saída 2
//		(_)\n
//		Importante
//		Para garantir o entendimento da correta formatação dos dados, nos exemplos de entrada e da
//		saída:
//		a) foi utilizado o caractere sublinhado ('_') em substituição ao caractere espaço (' ').
//		b) foi mostrado o caractere de final de linha ('\n').
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		s = s.replace("(", " ");
		s = s.replace(")", " ");
		s = s.trim();
		ArrayList<Integer> a = new ArrayList<Integer>();
		char[] array = s.toCharArray();
		for(int i = 0; i < array.length; i++) {
			if (array[i] != ' ') a.add(Integer.parseInt((array[i])+""));
		}
		String x = scan.nextLine();
		scan.close();
		x = x.replace("(", " ");
		x = x.replace(")", " ");
		x = x.trim();
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		char[] array2 = x.toCharArray();
			for(int i = 0; i < array2.length; i++) {
			if (array2[i] != ' ') {
				if ((a.contains(Integer.parseInt((array2[i])+"")) == true) && (intersection.contains(Integer.parseInt((array2[i])+"")) == false)) {
					intersection.add(Integer.parseInt((array2[i])+""));
				}
			}
		}
		
		String out = "( ";
			
		for (int i = 0; i < intersection.size(); i++) {
			out = out + intersection.get(i) + " ";
		}
		out = out + ")";
		
		System.out.println(out);
		
		
	}
}
