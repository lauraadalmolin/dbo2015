// RuntimeException e suas filhas não são checked 
// Exception e suas filhas SÃO CHECKED

public class SobrenomeCurtoException extends Exception {
	
	public SobrenomeCurtoException() {
		super("O sobrenome é muito curto, mínimo 3 letras");
	}
	
}
