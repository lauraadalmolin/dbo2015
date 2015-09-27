package um_para_muitos3;

public class Imovel {
	
	private Proprietario proprietario = null;
	private String endereco;

	public Imovel(String endereco) {
		this.endereco = endereco;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Proprietario p) {
		if (this.getProprietario() == null) {
		proprietario = p;
		proprietario.addImovel(this, true);
		}
	}
	
	public void setProprietario(Proprietario p, boolean i) {
		proprietario = p;
	}

	public void vendePara(Proprietario p) {
		proprietario.remove(this);
		proprietario = p;
		p.addImovel(this);	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((proprietario == null) ? 0 : proprietario.hashCode());
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
		Imovel other = (Imovel) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (proprietario == null) {
			if (other.proprietario != null)
				return false;
		} else if (!proprietario.equals(other.proprietario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Imovel [proprietario=" + proprietario + ", endereco="
				+ endereco + "]";
	}


	
	
	
}
