package um_para_muitos2;

public class Imovel {
	
	public String endereco;
	private Proprietario proprietario;

	public Imovel(String endereco) {
		super();
		this.endereco = endereco;
	}
	public void vendePara(Proprietario p){
		//this.setProprietario(p);
		proprietario.vendeImovelPara(this, p);
	}	
	public Proprietario getProprietario(){
		return proprietario;
	}
	public void setProprietario(Proprietario p){
		if(p != null){
		proprietario = p;
		p.addImovel(this);
		}
	}
	public String getEndereco() {
		return endereco;
	}
	

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
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
		return true;
	}

	@Override
	public String toString() {
		return "Imovel [endereco=" + endereco + "]";
	}
	
	
	
}

