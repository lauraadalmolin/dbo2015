package persistence;

public class Musica {
	
	private String nome;
	private String banda;
	private int ano;
	private String andamento;
	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getBanda() {
		return banda;
	}
	
	public void setBanda(String banda) {
		this.banda = banda;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getAndamento() {
		return andamento;
	}
	
	public void setAndamento(String andamento) {
		this.andamento = andamento;
	}

	@Override
	public String toString() {
		return "Musica [nome=" + nome + ", banda=" + banda + ", ano=" + ano + ", andamento=" + andamento + ", numero="
				+ numero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
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
		Musica other = (Musica) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	
	
	
	
	
}
