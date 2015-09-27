package oo_model_implementation;

import toolkit.List;

public class Musica {
	
	String nome;
	List<String> compositores = new List<String>();
	Album album = new Album();
	
	public Musica (String nome) {
		this.nome = nome;
	}
	
	public void addCompositor (String c) {
		compositores.append(c);
	}
	
	public void setAlbum(Album a) {
		album = a;
		a.addMusica(this);
	}
	
	
	
	
}
