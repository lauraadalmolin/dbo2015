import javax.swing.JOptionPane;

public class Lancando {

	public static void main(String[] args) {
		
		System.out.println(formataAutor("Laura", "Dalmolin"));
		System.out.println(formataAutor("Laura", "Gomes"));
	
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome:");
		try {
			System.out.println(formataAutor(nome, sobrenome));
		}
		catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static String formataAutor (String nome, String sobrenome) throws RuntimeException {
		if (nome.length() < 3) {
		throw new RuntimeException("Nome é muito curto, mínimo 3 letras");
		}
		if (sobrenome.length() < 3) {
			throw new RuntimeException("Sobrenome é muito curto, mínimo 3 letras");
		}
		
		return sobrenome.toUpperCase() + ", " + nome.toUpperCase().charAt(0) + ".";
		
	}
	
}
