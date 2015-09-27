package trabalho_5;

public class Disciplina {
	
	public String d;
	public Nota n1 = new Nota();
	public Nota n2 = new Nota();
	public Nota n3 = new Nota();
	public Nota n4 = new Nota();

	
	public Disciplina (String disciplina) {
		d = disciplina;
	}

	public void nota (int a, Nota b) {
		if (a == 1) n1 = b;
		if (a == 2) n2 = b;
		if (a == 3) n3 = b;
		if (a == 4) n4 = b;
	}


	public Nota nota (int a) {
		if (a == 1) return n1;
		if (a == 2) return n2;
		if (a == 3) return n3;
		if (a == 4) return n4;
		return null;
	}




}