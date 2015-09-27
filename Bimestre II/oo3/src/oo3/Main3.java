package oo3;

/**
 * 
 * @author Laura A. Dalmolin
 *
 */

public class Main3 {
	
	public static void main (String[] args) {
		
		PiorRandomPossivel randomizer = new PiorRandomPossivel();
		
		// API: Application Programming Interface
		// Interface de Programação de Aplicação
		// Em outras palavras, classes e métodos - PÚBLICOS.
		
		// API (interface) estabelece um CONTRATO
		
		Dado d = new Dado(randomizer);
		
		d.joga();
		
		int v = d.getValor();
		// Dado, por exemplo, tem dois métodos em sua API
		// joga: muda (ou não) o valor
		// getValor: retorna o valor do dado
		
		System.out.println(v); //1, 2, 3, 4, 5, 6.
		
		d.joga();
		
		System.out.println(d.getValor());
		System.out.println(d);
		
		
		
	}
}
