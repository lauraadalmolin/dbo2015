import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Digite um numero:");
		
		// Método que lança uma NumberFormatException
		// TRATAR a exceção
		// try/catch 
		int numero = 0;
		
		try { // abraça a instrução que pode lançar exceção
			texto = texto.trim();
			numero = Integer.parseInt(texto);
		}
		
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Numero invalido", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Nao ha numero", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
			
		
		System.out.println(numero);
	
	
	}

}

