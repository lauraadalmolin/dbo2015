// RuntimeException e suas filhas n�o s�o checked 
// Exception e suas filhas S�O CHECKED

public class SobrenomeCurtoException extends Exception {
	
	public SobrenomeCurtoException() {
		super("O sobrenome � muito curto, m�nimo 3 letras");
	}
	
}
