package oo;

public class Agua {
	
	private int temperatura;

	public Agua() {
		temperatura = 20;
	}

	public Agua(int t) {
		temperatura = t;
	}
	
	// Consulta a variável.
	public int temperatura() {
		return temperatura;
	}
	// altera a água, não retorna nada
	public void aquece() {
		temperatura++;
	}

	public void esfria() {
		temperatura--;
	}

	public boolean estaLiquida () {
		return (temperatura >= 0 && temperatura <= 100);
	}

	public boolean estaSolida () {
		return (temperatura < 0);
	}

	public boolean estaGasosa () {
		return (temperatura > 100);
	}

}