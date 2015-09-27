package um_para_muitos3;


public class Proprietario {
	
	private Imovel[] imoveis = new Imovel[100];
	private String nome;
	private int length = 0;
	
	public Proprietario(String nome) {
		this.nome = nome;
		for (int i = 0; i < 100; i++) imoveis[i] = null;
	}

	public void addImovel(Imovel im) {
		length = 0;
		for(int i = 0; i < imoveis.length; i++) {
			if (imoveis[i] == null) {
				imoveis[i] = im;
				break;
			}
			else { length++; }
		}	
		if (im.getProprietario() == null) im.setProprietario(this, true);	
	}
	
	public void addImovel(Imovel im, boolean o) {
		length = 0;
		for(int i = 0; i < imoveis.length; i++)	if (imoveis[i] != null) length++; 
		imoveis[length] = im;
		length++;		
	}

	public Imovel[] imoveis() {
		int tam = 0;
		for (int j = 0; j < imoveis.length; j++) {
			if (imoveis[j] != null) tam++;
		}
		Imovel[] novo = new Imovel[tam];
		for (int j = 0, k = 0; j < imoveis.length; j++) {
			if (imoveis[j] != null) {
				novo[k++] = imoveis[j];
			}
		}
		return novo;
	}
	
	public void remove (Imovel im) {
		for (int i = 0; i < imoveis.length; i++) {
			if (imoveis[i] == im) imoveis[i] = null;
		}
	}
	
	public Imovel imoveis(int i) {
		return imoveis[i];
	}

	public boolean equals(Proprietario p) {
		if (nome == p.nome) return true;
		return false;
	}

	public void vendeImovelPara(int i, Proprietario p2) {
		imoveis[i].vendePara(p2);
		imoveis[i] = null;
			
	}

}
