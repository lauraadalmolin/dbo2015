package oo3;

/**
 * 
 * @author Laura A. Dalmolin
 *
 */

public class Dado {
	
	// DADO TEM UM VALOR
	private int valor = 1;
	
	// DADO TEM UM IRANDOM
	private IRandom randomizer;
	
	// DADO TEM UMA DEPENDÊNCIA
	public Dado(IRandom r) {
		this.randomizer = r;
	}
	
	/**
	 * obtém o valor da face superior do dado
	 * @return o valor de 1 a 6 presente na face superior.
	 */
	public int getValor() {
		// TODO Auto-generated method stub
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	/**
	 * joga o dado eventualmente mudando seu valor -> é concreto
	 */
	
	public void joga() {
		valor = (int) ((randomizer.get() * 6) + 1);
		if (valor == 7) valor = 1;
	}
			
	// Não é API.
	//private void randomizarDado() {
		// mágica
	//}
	
	
	@Override
	public String toString() {
		return "Dado [valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + valor;
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
		Dado other = (Dado) obj;
		if (valor != other.valor)
			return false;
		return true;
	}

}
