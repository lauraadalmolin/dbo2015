package toolkit;

public interface IRandom {
	
    /**
     * Gera o pr�ximo n�mero aleat�rio.
     * O valor n�o � alterado at� esse m�todo ser invocado.
     */
    void next();

    /**
     * Retorna o �ltimo valor gerado.
     * Este m�todo pode ser chamado diversas vezes n�o
     * dever� ter seu valor alterado com exce��o se next() for invocado.
     *
     * @return double n�mero aleat�rio >= 0 e < 1
     */
    double get();

}
