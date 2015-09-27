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
		// Interface de Programa��o de Aplica��o
		// Em outras palavras, classes e m�todos - P�BLICOS.
		
		// API (interface) estabelece um CONTRATO
		
		Dado d = new Dado(randomizer);
		
		d.joga();
		
		int v = d.getValor();
		// Dado, por exemplo, tem dois m�todos em sua API
		// joga: muda (ou n�o) o valor
		// getValor: retorna o valor do dado
		
		System.out.println(v); //1, 2, 3, 4, 5, 6.
		
		d.joga();
		
		System.out.println(d.getValor());
		System.out.println(d);
		
		
		
	}
}
