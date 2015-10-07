package olimpiada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// entrada: 45 23 87 23 12 34
		// saída: 87\n println
		
		Scanner scan = new Scanner(System.in);
		int max = 0;
		String linha = scan.nextLine();
		String[] vetor = linha.split(" ");
		for (int i = 0; i < vetor.length; i++) {
			int num = Integer.parseInt(vetor[i]);
			if (num > max) {
				max = num;
			}
		}
		//scan.useDelimiter(" ");
		
		System.out.println(max);

	}

}