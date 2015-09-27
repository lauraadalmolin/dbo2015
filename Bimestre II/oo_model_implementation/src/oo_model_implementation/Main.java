package oo_model_implementation;

import toolkit.Date;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Neste catálogo devem estar representados as pessoas sejam autores,
		 * vocalistas ou músicos, instrumentos que tocam se for o caso, bandas,
		 * álbuns com ano e outros detalhes, canções, gravadoras, etc.
		 * 
		 */
		
		Genero generoFunkRock = new Genero("funk rock");
		Genero rockAlternativo = new Genero("rock alternativo");
		Banda b = new Banda();
		
		b.setNome("red hot chili peppers");
		b.addGenero(generoFunkRock);
		b.addGenero(rockAlternativo);
		b.setDataFundacao(new Date(13, 2, 1983));

		System.out.println(b.getNome().equals("red hot chili peppers"));
		System.out.println(b.getGenero(0).equals(generoFunkRock));
		System.out.println(b.getGenero(1).equals(rockAlternativo));
		System.out.println(b.getGenero(2) == null);
		System.out.println(b.getDataFundacao().equals(new Date(13, 2, 1983)));
		
	}

}
