package list;

public interface IList {

	/**
	 * Adiciona o elemento no fim da lista.
	 * Par�metros null s�o ignorados.
	 *
	 * @param o Elemento a ser adicionado
	 */
	public void append(Object o);

	/**
	 * Obt�m um elemento dado um �ndice.
	 * �ndices n�o existentes retornam null.
	 *
	 * @param index �ndice do objeto. Valores v�lidos s�o 0 <= index < count()
	 * @return Object Elemento no �ndice informado ou null se n�o houver.
	 */
	public Object get(int index);

	/**
	 * Retorna o primeiro elemento da lista.
	 * Este m�todo tem o mesmo efeito de get(0).
	 * Retorna null se a lista estiver vazia.
	 *
	 * @return Object Elemento no primeiro �ndice da lista ou null se vazia.
	 */
	public Object first();

	/**
	 * Retorna o �ltimo elemento da lista.
	 * Este m�todo tem o mesmo efeito de get(count() - 1).
	 * Retorna null se a lista estiver vazia.
	 *
	 * @return Object elemento no �ltimo �ndice da lista ou null se vazia.
	 */
	public Object last();

	/**
	 * Remove e retorna o elemento contido no �ndice passado.
	 * Retorna null se n�o h� elemento no �ndice.
	 *
	 * @param index �ndice do elemento a ser removido.
	 * @return Object elemento removido ou null se o �ndice n�o existir.
	 */
	public Object drop(int index);

	/**
	 * Remove o elemento contido no �ndice passado.
	 * Retorna true se o elemento foi removido e false caso contr�rio.
	 *
	 * @param index �ndice do elemento a ser removido.
	 * @return boolean true ou false caso o elemento seja ou n�o removido.
	 */
	public boolean delete(int index);

	/**
	 * Remove o elemento da lista.
	 * Retorna true se o objeto foi encontrado e removido e false caso contr�rio.
	 *
	 * @param o Elemento a ser removido.
	 * @return boolean true ou false caso o elemento seja ou n�o removido.
	 */
	public boolean remove(Object o);

	/**
	 * Remove todos os elementos da lista.
	 * Este m�todo reseta a lista.
	 */
	public void clean();

	/**
	 * Retorna a quantidade de elementos na lista.
	 *
	 * @return int quantidade de elementos.
	 */
	public int count();

	/**
	 * Retorna se h� ou n�o o elemento na lista.
	 *
	 * @param o Elemento a ser verificado.
	 * @return boolean true ou false caso o elemento se encontre ou n�o na lista.
	 */
	public boolean has(Object o);

	/**
	 * Retorna se a lista est� vazia.
	 *
	 * @return boolean true ou false se a lista estiver ou n�o vazia.
	 */
	public boolean empty();

}
