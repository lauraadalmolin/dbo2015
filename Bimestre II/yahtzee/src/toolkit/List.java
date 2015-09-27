package toolkit;

import java.util.Arrays;


public class List<TYPE> implements IList<TYPE>{
	
	private Object[] vetor;
	private int full;
	
	public List(){
		vetor = new Object [10];
		full = 10;
	}
	public int count(){
		int retorno = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) retorno++;
		}
		return retorno;
	}
	public boolean empty(){
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) return false;
		}
		return true;
	}
	public TYPE get(int index){
		if (index >= 0 && index < vetor.length){ return (TYPE)vetor[index];}
		return null;
	}
	public TYPE first(){
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) return (TYPE)vetor[i];
		}
		return null;
	}
	public TYPE last(){
		Object o = null;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] != null) o = vetor[i];
		}
		return (TYPE)o;
	}
	public void append(TYPE add){
		if (full == 0) {
			Object[] temp = new Object [vetor.length+10];
			for (int i = 0; i < vetor.length; i++){ temp[i] = vetor[i];}
			temp[vetor.length] = add;
			vetor = temp;
			full = 9;
		}else{
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] == null){ 
					vetor[i] = add;
					full--; break;
				}
			}
		}
	}
	public boolean has(TYPE s){
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && vetor[i].equals(s)){
				/*System.out.println(vetor[i]);
				System.out.println();*/
				return true;
			}
		}
		return false;
	}
	public void delete(int index){
		if (index >= 0 && index < vetor.length){
			if (vetor[index] != null) {
			for (int i = index; i < vetor.length; i++) {
				if (i == vetor.length-1) vetor[i] = null;
				else{
					vetor[i] = vetor[i+1];
				}
			}
			}
			full++;
			
		}
	}
	public boolean remove(TYPE o) {
		for (int i = 0; i < vetor.length; i++) { 
			if (vetor[i] == o) {
				this.delete(i);
				return true; 
			}
		}
		return false;
	}
	public TYPE drop(int index){
		Object retorno;
		if (index >= 0 && index < vetor.length){
			retorno = vetor[index];
			delete(index);
			return (TYPE) retorno;
		} return null;
	}
	public void clean(){
		vetor = new Object [10];
		full = 10;
	}
	public int find(TYPE find){
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(find)) return i;
		}return -1;
	}
	public Object[] getVetor() {
		return vetor;
	}
	
	@Override
	public String toString() {
		return "List [vetor=" + Arrays.toString(vetor) + "]";
	}

}
