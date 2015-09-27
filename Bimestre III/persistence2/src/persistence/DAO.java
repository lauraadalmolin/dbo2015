package persistence;

import java.util.ArrayList;


public interface DAO<T> {

	public void store(T obj);	

	public void delete(T obj);

	public T load(int chave);

	public void update(T obj);

	public ArrayList<T> list();

	

}