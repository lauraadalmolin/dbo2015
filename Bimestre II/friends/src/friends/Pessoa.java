package friends;

import java.util.Arrays;

public class Pessoa {
	
	private String nome;
	private Pessoa[] amigos = new Pessoa[1000];
	
	public Pessoa(String string) {
		nome = string;
		for (int i = 0; i < 1000; i++) amigos[i] = null;
	}
	
	public int getAmigoContagem() {
		int j = 0;
		for (int i = 0; i < 1000; i++) {
			if (amigos[i] != null) {
				
				j++;
			}
		}
		return j;
	}

	public void addAmigo(Pessoa p) {
		if (! (this.equals(p))) {
			for (int i = 0; i < amigos.length; i++) {
				if (amigos[i] == null) {
					amigos[i] = p;
					break;	
				}
				
			}
			Pessoa[] vetor_p = p.getAmigos();
			boolean contains = false;
			for (int i = 0; i < vetor_p.length; i++) {
				if (vetor_p[i] == this) contains = true;
			}
			if (contains == false) p.addAmigo(this);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa[] getAmigos() {
	
		Pessoa[] a = new Pessoa [getAmigoContagem()];
		int j = 0;
		for (int i = 0; i < 1000; i++) {
			if (amigos[i] != null) {
				a[j] = amigos[i];	
				j++;
			}
		}
		
		return a;
	}


	@Override
	public String toString() {
		return nome;
	}

	public void setAmigos(Pessoa[] amigos) {
		this.amigos = amigos;
	}

	public Pessoa getAmigo(int i) {
		Pessoa[] a = getAmigos();
		if (i > a.length-1) return null;
		if (a[i] != null) return a[i];
	
		return null;
	}

	public void removeAmigo(Pessoa p) {
		for (int i = 0; i < amigos.length; i++) {
			if (amigos[i] == p) {
				amigos[i] = null;
				break;	
			}
			
		}
		Pessoa[] vetor_p = p.getAmigos();
		boolean contains = false;
		for (int i = 0; i < vetor_p.length; i++) {
			if (vetor_p[i] == this) contains = true;
		}
		if (contains == true) p.removeAmigo(this);	
		
	}

	public void removeAmigo(int index) {
		Pessoa[] a = getAmigos();
		
		this.removeAmigo(a[index]);		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(amigos);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	public boolean equals(Pessoa p) {
		if (this.nome == p.nome && this.amigos == p.amigos) return true;
		return false;
	}

}
