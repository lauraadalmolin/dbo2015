package toolkit;


/**
 * 
 * @author Laura A. Dalmolin
 *
 */

public class List<TYPE> implements IList <TYPE> {
	
	private Object[] list = new Object[10];
	private int last_index = 0;
	
	/**
	 * Construtor 
	 * 
	 */
	
	public List () {
		for (int i = 0; i < list.length; i++) list[i] = null;
	}
	
	
	/**
	 * Adiciona o elemento no fim da lista.
	 * Par�metros null s�o ignorados.
	 *
	 * @param o Elemento a ser adicionado
	 */

	public void append (TYPE o) {
		
		if (o != null) {
			boolean success = false;
			for (int i = 0; i < list.length; i++) {
				if (list[i] == null) {
					list[i] = o;
					success = true;
					break;
				}
			}

			if (success == false) {	
				Object[] temp = new Object[list.length+10];
				int i;
				for (i = 0; i < temp.length; i++) temp[i] = null;
				for (i = 0; i < list.length; i++) temp[i] = list[i];
				temp[i] = o;
				list = temp;
			}
			
		}
	}

	/**
	 * Obtém um elemento dado um índice.
	 * Indices não existentes retornam null.
	 *
	 * @param index Indice do objeto. Valores válidos são 0 <= index < count()
	 * @return Object Elemento no índice informado ou null se não houver.
	 */
	
	public TYPE get(int index) {
		if (index >= 0 && index < this.count()) {
			return (TYPE) list[index];
		}
		return null;
	}

	/**
	 * Retorna o primeiro elemento da lista.
	 * Este método tem o mesmo efeito de get(0).
	 * Retorna null se a lista estiver vazia.
	 *
	 * @return Object Elemento no primeiro índice da lista ou null se vazia.
	 */
	public TYPE first() {
		if (list[0] != null) return (TYPE) list[0];
		return null;
	}

	/**
	 * Retorna o último elemento da lista.
	 * Este método tem o mesmo efeito de get(count() - 1).
	 * Retorna null se a lista estiver vazia.
	 *
	 * @return Object elemento no último índice da lista ou null se vazia.
	 */
	public TYPE last() {
		int a = this.count();
		if (a == 0) return (TYPE) list[0];
		return (TYPE) list[a-1];
	}

	/**
	 * Remove e retorna o elemento contido no índice passado.
	 * Retorna null se não há elemento no índice.
	 *
	 * @param index Indice do elemento a ser removido.
	 * @return Object elemento removido ou null se o índice não existir.
	 */
	public TYPE drop(int index) {
		if (index >= 0 && index < count()) {
		Object n = new Object();
		n = list[index];
		this.delete(index);
		return (TYPE) n; }
		return null;
	}
	/**
	 * Remove o elemento contido no índice passado.
	 * Retorna true se o elemento foi removido e false caso contrário.
	 *
	 * @param index Indice do elemento a ser removido.
	 * @return boolean true ou false caso o elemento seja ou não removido.
	 */
	public boolean delete(int index) {
		if (index >= 0 && index < count()) {
			if (list[index] == null) return false;
			list[index] = null;
			Object[] temp = new Object[list.length-1];
			for (int i = 0; i < temp.length; i++) temp[i] = null;
			int j = 0;
			for (int i = 0; i < list.length; i++) {
				if(list[i] != null) {
					temp[j] = list[i];
					j++;
				}
			}
			list = temp;
			last_index--;
			return true;
		}
		return false;
		
	}

	/**
	 * Remove o elemento da lista.
	 * Retorna true se o objeto foi encontrado e removido e false caso contrário.
	 *
	 * @param o Elemento a ser removido.
	 * @return boolean true ou false caso o elemento seja ou não removido.
	 */
	public boolean remove(TYPE o) {
		for (int i = 0; i < list.length; i++) { 
			if (list[i] == o) {
				this.delete(i);
				return true; 
			}
		}
		return false;
	}

	/**
	 * Remove todos os elementos da lista.
	 * Este método reseta a lista.
	 */
	public void clean() {
		Object[] temp = {null, null, null};
		list = temp;
		
	}

	/**
	 * Retorna a quantidade de elementos na lista.
	 *
	 * @return int quantidade de elementos.
	 */
	public int count() {
		int q = 0;
		for(int i = 0; i < list.length; i++) if (list[i] != null) q++;
		return q;
		
	}

	/**
	 * Retorna se há ou não o elemento na lista.
	 *
	 * @param o Elemento a ser verificado.
	 * @return boolean true ou false caso o elemento se encontre ou não na lista.
	 */
	public boolean has(Object o) {
		for (int i  = 0; i < list.length; i++) if (list[i] == o) return true;
		return false;		
	}

	/**
	 * Retorna se a lista está vazia.
	 *
	 * @return boolean true ou false se a lista estiver ou não vazia.
	 */
	public boolean empty() {
		for (int i = 0; i < list.length; i++) if (list[i] != null) return false;
		return true;
		
		
	}

}
