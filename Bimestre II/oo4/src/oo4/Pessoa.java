package oo4;

public class Pessoa {
	
	private String nome;
	
	private Pessoa conjuge;	
	// coleção add, remove, getIndex
	private Pessoa[] dependentes = new Pessoa[5];
	
	public void addDependente (Pessoa p) {
		for (int i = 0; i < dependentes.length; i++) {
			if (dependentes[i] == null) {
				dependentes[i] = p;
				break;
			}
		}
	}
	
	public void removeDependente (Pessoa p) {
			
	}
	
	public Pessoa[] getDependentes() {
		int tam = 0;
		for (int j = 0; j < dependentes.length; j++) {
			if (dependentes[j] != null) tam++;
		}
		Pessoa[] novo = new Pessoa[tam];
		for (int j = 0, k = 0; j < dependentes.length; j++) {
			if (dependentes[j] != null) {
				novo[k++] = dependentes[j];
			}
		}
		return novo;
	}
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	public String toString() {
		return nome;
	}

	public Pessoa getConjuge() {
		return conjuge;
	}

	public void casaCom(Pessoa outra) {
		if (this.conjuge == null) {
			this.conjuge = outra;
			outra.casaCom(this);
		}
	}
	
	
}
