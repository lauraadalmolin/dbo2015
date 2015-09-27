package oo2;

// padrão JavaBean
// accessors and mutators
// getters/setters
// consulta/comando

public class Cliente {

	private String nome;
	private String sobrenome;
	private int numero;
	// Relacionamento
	// Cliente TEM um telefone.
	private Telefone telResidencial = new Telefone();
	// Composição é diferente de agregação
	private Endereco endereco = new Endereco();

	public Endereco getEndereco () {
		return endereco;
	}

	/*public void setTelResidencial (Telefone telRes) {
		telResidencial = telRes;
	}*/

	public Telefone getTelResidencial () {
		return telResidencial;
	}
	
	// Mutator or setter: "void setSomething"
	public void setNome (String nome) {
		this.nome = nome;
	}

	// Accessor or getter: "tipo getSomething"
	public String getNome () {
		return nome;
	}

	public void setSobrenome (String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome () {
		return sobrenome;
	}

	public void setNumero (int numero) {
		this.numero = numero;
	}

	public int getNumero () {
		return numero;
	}
}