package expecto_patronum;

import toolkit.Random;


/**
 * 
 * @author Laura A. Dalmolin
 *
 */

public class BetterList implements IBetterList {
	
	private Object[] list = new Object[10];
	private Random randomizer = new Random();
		
	/**
	 * Construtor 
	 * 
	 */
	
	public BetterList () {
		for (int i = 0; i < list.length; i++) list[i] = null;
	}
	
	
	/**
	 * Adiciona o elemento no fim da lista.
	 * Par�metros null s�o ignorados.
	 *
	 * @param o Elemento a ser adicionado
	 */

	public void append (Object o) {
		
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
	
	public Object get(int index) {
		if (index >= 0 && index < this.count()) {
			return list[index];
		}
		if (index < 0) {
			index += this.count();
			return list[index];
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
	public Object first() {
		if (list[0] != null) return (Object) list[0];
		return null;
	}

	/**
	 * Retorna o último elemento da lista.
	 * Este método tem o mesmo efeito de get(count() - 1).
	 * Retorna null se a lista estiver vazia.
	 *
	 * @return Object elemento no último índice da lista ou null se vazia.
	 */
	public Object last() {
		int a = this.count();
		if (a == 0) return list[0];
		return list[a-1];
	}

	/**
	 * Remove e retorna o elemento contido no índice passado.
	 * Retorna null se não há elemento no índice.
	 *
	 * @param index Indice do elemento a ser removido.
	 * @return Object elemento removido ou null se o índice não existir.
	 */
	public Object drop(int index) {
		if (index >= 0 && index < count()) {
		Object n = new Object();
		n = list[index];
		this.delete(index);
		return n; }
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
	public boolean remove(Object o) {
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
	
	// add an object in the begin of the list (the oposite of append)
    public void prepend(Object o) {
    	Object[] temp = new Object[list.length+1];
    	temp[0] = o;
    	int j = 1;
    	for (int i = 0; i < list.length; i++) {
    		temp[j] = list[i];
    		j++;
    	}
    	list = temp;
    }
    
    // add an object in the specified index
    public void insert(int index, Object o) {
    	Object[] temp = new Object[list.length-index];
    	for(int i = 0; i < index; i++) {
    		temp[i] = list[i];
    	}
    	temp[index] = o;
    	index++;
    	for(int i = index-1; i < this.count(); i++) {
    		temp[index] = list[i];
    		index++;
    	}
    	list = temp;
    }
    
    // reorganize in ascending order (use the Object#compareTo(Object) method to contrast greater and less)
    public void sort() {
    	int[] n = new int[this.count()];
    	for (int i = 0; i < this.count(); i++) {
    		for (int j = 0; j < this.count(); j++) {
    		int s = list[i].compareTo(list[j]); {
    			
    			}
    		}
    	}
    	
    	
    	
    }
    
    // reverse the list, the first ones will be last
    public void reverse() {
    	Object[] temp = list;
    	int j = this.count();
    	for(int i = 0; i < this.count(); i++) {
    		temp[i] = list[j];
    		j--;
    	}
    	list = temp;
    }
    
    // randomize the positions
    public void shuffle() {
    	int[] n = new int[this.count()];
    	int valor;
    	boolean test;
      	for(int i = 0; i < n.length; ) {
      		test = true;
    		randomizer.next();
      		valor = (int) (randomizer.get() * this.count()  + 1);
      		for (int j = 0; j < n.length; j++) {
        		if (n[j] == valor) {
        			test = false;
        		}
        	}
        	if (test) {
        		n[i] = valor; 
        		i++;
        	}
        }
      	for (int i = 0 ; i < n.length; i++) n[i]-=1;
      	Object[] temp = new Object[list.length];
    	for(int i = 0; i < n.length; i++) {
    		temp[i] = list[n[i]]; 
    	}
    	list = temp;
    }
    
    // extract a sublist
    public BetterList sublist(int start, int end) {
    	int size = end-start;
    	BetterList l = new BetterList();
    	Object[] o = new Object[size];
    	int j = 0;
    	for(int i = start+1; i <= end; i++) {
    		o[j] = list[i];
    		j++;
    	}
    	l.list=o;
    	return l;
    }
    
   // get an object from a random position
    public Object sample() {
    	randomizer.next();
    	int valor = (int) (randomizer.get() * this.count()  + 1);
    	return list[valor];
    }

	
}
