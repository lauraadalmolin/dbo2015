import javax.swing.JOptionPane;

public class Obrigatoria {

	public static void main(String[] args) {
		
		try {
			System.out.println(formataAutor("Laura", "Dalmolin"));
			System.out.println(formataAutor("Laura", "Gomes"));
		}
		catch (SobrenomeCurtoException e) {
			System.err.println(e);
		}
	
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome:");
		try {
			System.out.println(formataAutor(nome, sobrenome));
		}
		catch (SobrenomeCurtoException e) {
			System.err.println(e);
		}

	}
	// Excecoes CHECKED (Exception) é obrigado a declarar e tratar as exceções
	public static String formataAutor (String nome, String sobrenome) throws RuntimeException, SobrenomeCurtoException {
		if (nome.length() < 3) {
		throw new NomeCurtoException();
		}
		if (sobrenome.length() < 3) {
			throw new SobrenomeCurtoException();
		}
		
		return sobrenome.toUpperCase() + ", " + nome.toUpperCase().charAt(0) + ".";
		
	}
	
}
