package hamming;

public class Main { 

	public static void main(String[] args) {
		
		// bioinformática
		// DNA ACGT
		// Algoritmo de Hamming - Distância de Hamming
		
		System.out.println(Hamming.distance("ACCGT", "ACGGT") == 1);
		System.out.println(Hamming.distance("AAAAA", "CCCCC") == 5);
		System.out.println(Hamming.distance("AAAAA", "AAAAA") == 0);


	}
}