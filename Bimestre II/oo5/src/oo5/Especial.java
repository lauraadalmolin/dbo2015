package oo5;

public class Especial extends Corrente {
	
	private double limite;
	
	public Especial(Cliente cliente, int agencia, int numero, double saldo, double limite) {
		super(cliente, agencia, numero, saldo);
		this.limite = limite;
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo() + limite;
	}
	
	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		if (valor <= getSaldo()) {
			this.saldo -= valor;
		}
	}
	
}
