package cobaia;

// Engenheiros de Software
// Arquitetos de Sistema
// Engenheiros da Computa��o
// Analistas de Sistema

// tradeoff (escolher os pr�s e contras)

public class Professor extends Model {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toCSV() {
		StringBuilder builder = new StringBuilder();
		builder.append(id).append(";").append(nome);
		return builder.toString();
	}

	@Override
	public void fromCSV(String row) {
		// TODO a fazer
		
	}

}
