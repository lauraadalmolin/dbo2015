package oo3;

import java.util.ArrayList;

public class Main2 {
	
	public static void main (String[] args) {
		
		String[] nomes = new String[2];
		nomes[0] = "Luca";
		nomes[1] = "Lucas";
		
//		for(int i = 0; i < nomes.length; i++) {
//			System.out.println(nomes[i]);
//		}
		System.out.println(java.util.Arrays.toString(nomes));
		
		String[] temp = new String[4];
		temp[0] = nomes[0];
		temp[1] = nomes[1];
		temp[2] = "Gregory";
		temp[3] = "Batata";
		nomes = temp;
		
		System.out.println(java.util.Arrays.toString(nomes));
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Erick");
		lista.add("Eduardo");
		lista.add("Laura D.");
		lista.add("Mauro");
		lista.add("Rodrigo");
		lista.add("Caroline");
		
		System.out.println(lista);
		

		
		
	}
}
