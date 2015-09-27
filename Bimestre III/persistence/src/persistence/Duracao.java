package persistence;

public class Duracao {

	private int minutos;
	private int segundos;
		
	public int getMinutos() {
		return minutos;
	}


	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}


	public int getSegundos() {
		return segundos;
	}


	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	


	public Duracao(int i, int j) {
		minutos = i;
		segundos = j;
	}
	
	public String toString() {
		return minutos + ":" + segundos;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + minutos;
		result = prime * result + segundos;
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
		Duracao other = (Duracao) obj;
		if (minutos != other.minutos)
			return false;
		if (segundos != other.segundos)
			return false;
		return true;
	}
	
	

}
