package oo6;

public class Perfil {
	
	// DECLARACAO DE CONSTANTE
	public static final int RECRUTA = 20;
	public static final int VETERANO = 50;
	
	private String nome;
	//escolhas finitas são enumeradas
	
	private Genero genero;
	private int reputacao;
	
	public int getReputacao() {
		return reputacao;
	}

	public void setReputacao(int reputacao) {
		this.reputacao = reputacao;
	}

	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	
	public Perfil(String string) {
		this.nome = string;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
