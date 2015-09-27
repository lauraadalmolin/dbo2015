package oo2;

public class Endereco {
	
	private String rua;
	private String numero;
	private String cep;

	public void setRua (String rua) {
		this.rua = rua;
	}

	public String getRua () {
		return rua;
	}

	public void setNumero (String numero) {
		this.numero = numero;
	}

	public String getNumero () {
		return numero;
	}

	public void setCep (String cep) {
		this.cep = cep;
	}

	public String getCep (){
		return cep;
	}

	public String toString() {
		return rua + " " + numero + "\n" + "CEP: " + cep;
	}

}