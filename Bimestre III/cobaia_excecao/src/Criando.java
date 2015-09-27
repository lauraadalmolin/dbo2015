import javax.swing.JOptionPane;

public class Criando {

	public static void main(String[] args) {
		
		System.out.println(formataAutor("Laura", "Dalmolin"));
		System.out.println(formataAutor("Laura", "Gomes"));
	
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome:");
		try {
			System.out.println(formataAutor(nome, sobrenome));
		}
		catch (NomeCurtoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		}
		catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		}
	
	}
	
	public static String formataAutor (String nome, String sobrenome) throws RuntimeException {
		if (nome.length() < 3) {
		throw new NomeCurtoException();
		}
		if (sobrenome.length() < 3) {
			throw new RuntimeException("O sobrenome � muito curto, m�nimo 3 letras");
		}
		
		return sobrenome.toUpperCase() + ", " + nome.toUpperCase().charAt(0) + ".";
		
	}
	
}
