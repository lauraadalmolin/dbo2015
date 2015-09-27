package cobaia;

// classe gen�rica (abstrata)
// classe abstrata: serve como pai para as outras classes
public abstract class Model {
	// PROTECTED: torna o id acess�vel para as classes filhas
	protected int id;
	// m�todos concretos (com miolo)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	// m�todos abstratos
	public abstract String toCSV();
		
	public abstract void fromCSV(String row);
}
