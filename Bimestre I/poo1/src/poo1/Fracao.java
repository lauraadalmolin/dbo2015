package poo1;

// classe: descrição do que é
// objeto: coisa real, quando é feita - passa a ser objeto depois do new
// classes são sempre substantivos
// geralmente no singular
// modela o objeto real da fração
// são declaradas as informações essenciais
// sobre o essencial extrai-se informações secundárias
// public: acessível em todos os lugares
// private: acessível somente na classe
// declaração simples: acessível no pacote
// por enquanto vamos declarar tudo como public, mas há restrições, que serão vistas mais tarde

public class Fracao {
	// atributos/características
	// escopo da classe

	// IMUTABILIDADE - final 
	
	public final int numerador;
	public final int denominador;

	// NÃO É UM MÉTODO - É UM CONSTRUTOR COM DOIS ARGUMENTOS INT 

	// FAIL-FAST : FALHE RAPIDO/CEDO
	// FAIL-SAFE : SEGURO CONTRA FALHAS
	public Fracao(int a, int b) {
		if (b == 0) throw new IllegalArgumentException("Denominador invalido! Nao existe divisao por zero.");
		numerador = a;
		denominador = b;
	}

	// sempre escrever toString
	public String toString() {
		return numerador + "/" + denominador;
	}

	public Fracao (int a) {
		numerador = a;
		denominador = 1;
	}

	public Fracao multiplica(Fracao outra) {
		int n = this.numerador * outra.numerador;
		int d = this.denominador * outra.denominador;
		Fracao r = new Fracao(n, d);
		return r;
	}

	public Fracao multiplica(int n) {
		return new Fracao(this.numerador * n, this.denominador);
	}

	public Fracao soma(Fracao fracao) {
		//
		return null;
	}

	public Fracao subtrai(Fracao fracao) {
		//
		return null;
	}

	public Fracao divide(Fracao outra) {
		int n = this.numerador * outra.denominador;
		int d = this.denominador * outra.numerador;
		Fracao r = new Fracao(n, d);
		return r;
	}

	// Observação para o nome dos métodos
	// Métodos representam ações sobre o objeto


	// Os métodos com static são da classe, os sem são do objeto
	// mais de um construtor
	// SOBRECARGA DE CONSTRUTORES
	// POLIMORFISMO BPASICOS
	// não são apenas bolsas de dados
	// OS OBJETOS DEVEM CARREGAR OS ALGORITMOS
	// os objetos devem ter atributos e métodos




}


