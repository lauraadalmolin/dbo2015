package um_para_muitos2;

public class Proprietario {
	
	private String nome;
	private Imovel[] imoveis = new Imovel[100];
	
	
	public void addImovel(Imovel o){
		for(int i=0; i < imoveis.length; i++){
			if(imoveis[i] == null){
				imoveis[i] = o;
				if(o.getProprietario() == null) o.setProprietario(this);
				break;
			}else {
				if(imoveis[i].equals(o)) 	break;
			}
		}
	}
	public void vendeImovelPara(int i, Proprietario p){
		if(imoveis[i] != null){
			imoveis[i].setProprietario(p);
			imoveis[i] = null;
		}
	}
	
	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}
	
	public Imovel[] imoveis(){
		int ct=0;
		for(int i=0; i<imoveis.length; i++){
			if(imoveis[i] != null){
				//System.out.println(imovel[i]);
				ct++;
			}
		}
		Imovel[] imovel2 = new Imovel[ct];
		ct=0;
		for(int i=0; i<imovel2.length; i++) imovel2[i] = null;
		for(int i=0; i<imoveis.length; i++){
			if(imoveis[i] != null){
				imovel2[ct] = imoveis[i];
				ct++;
			}
		}
		return imovel2;
	}
	
	public Imovel imoveis(int index){
		int ct=0;
		for(int i=0; i<imoveis.length; i++){
			if(imoveis[i] != null){
				ct++;
			}
		}
		Imovel[] imovel2 = new Imovel[ct];
		ct=0;
		for(int i=0; i<imoveis.length; i++){
			if(imoveis[i] != null){
				imovel2[ct] = imoveis[i];
				ct++;
			}
		}
		if(index>=imovel2.length) return null;
		return imovel2[index];
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + "]";
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
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass())	return false;
		Proprietario other = (Proprietario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public void vendeImovelPara(Imovel imovel, Proprietario p) {
		int j=0;
		for(int i=0; i<imoveis.length; i++){
			if(imoveis[i].equals(imovel)){
				j = i;
				break;
			}
		}
		vendeImovelPara(j, p);
	}
	
	
}