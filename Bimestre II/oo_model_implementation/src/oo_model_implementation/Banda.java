package oo_model_implementation;

import toolkit.*;

public class Banda {
	
	private List<Integrante> integrantes = new List<Integrante>();
	private List<Musica> musicas = new List<Musica>();
	private Date data_fundacao;
	private String nome;
	private List<Genero> genero = new List<Genero>();
	
	public void addMusica(Musica musica) {
		musicas.append(musica);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addGenero(Genero genero) {
		this.genero.append(genero);		
	}

	public void setDataFundacao(Date date) {
		data_fundacao = date;
		
	}

	public Object getNome() {
	
		return null;
	}

	public Object getGenero(int i) {
	
		return null;
	}

	public Object getDataFundacao() {
		
		return null;
	}

	

	
}
