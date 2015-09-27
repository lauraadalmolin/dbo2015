import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Digite um numero:");
		
		// M�todo que lan�a uma NumberFormatException
		// TRATAR a exce��o
		// try/catch 
		int numero = 0;
		
		try { // abra�a a instru��o que pode lan�ar exce��o
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

