package toolkit;

public interface IRandom {
	
    /**
     * Gera o próximo número aleatório.
     * O valor não é alterado até esse método ser invocado.
     */
    void next();

    /**
     * Retorna o último valor gerado.
     * Este método pode ser chamado diversas vezes não
     * deverá ter seu valor alterado com exceção se next() for invocado.
     *
     * @return double número aleatório >= 0 e < 1
     */
    double get();

}
