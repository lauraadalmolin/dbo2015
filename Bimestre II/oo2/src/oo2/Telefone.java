package oo2;

public class Telefone {
	
	private String ddd;
	private String numero;
	private String operadora;

	public void setDdd (String ddd) {
		this.ddd = ddd;
	}

	public String getDdd () {
		return ddd;
	}

	public void setNumero (String numero) {
		this.numero = numero;
	}

	public String getNumero () {
		return numero;
	}

	public void setOperadora (String operadora) {
		this.operadora = operadora;
	}

	public String getOperadora () {
		return operadora;
	}

	public String toString () {
		return "(" + ddd + ") " + numero + "\n" + "Operadora: " + operadora; 
	}
}

